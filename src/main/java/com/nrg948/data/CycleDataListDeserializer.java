package com.nrg948.data;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CycleDataListDeserializer extends JsonDeserializer<CycleDataList> {

    private static final Pattern KEY_PATTERN = Pattern.compile("^(.+?)(\\d+)$");

    @Override
    public CycleDataList deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        ObjectMapper mapper = (ObjectMapper) p.getCodec();
        JsonNode node = mapper.readTree(p);
        
        if (node == null || node.isNull() || !node.isObject()) {
            return new CycleDataList();
        }

        Map<Integer, CycleData> sortedCycles = new TreeMap<>();
        String prefix = null;
        
        Map<String, JsonNode> fields = mapper.convertValue(node, Map.class);
        
        for (Map.Entry<String, JsonNode> entry : fields.entrySet()) {
            String key = entry.getKey();
            Matcher matcher = KEY_PATTERN.matcher(key);
            
            if (matcher.matches()) {
                String prefixPart = matcher.group(1);
                String numberPart = matcher.group(2);
                
                try {
                    int index = Integer.parseInt(numberPart);
                    if (prefix == null) {
                        prefix = prefixPart;
                    }
                    CycleData cycleData = mapper.convertValue(entry.getValue(), CycleData.class);
                    sortedCycles.put(index, cycleData);
                } catch (NumberFormatException e) {
                    // Skip invalid keys
                }
            }
        }

        List<CycleData> cycles = new ArrayList<>(sortedCycles.values());
        String finalPrefix = prefix != null ? prefix : "";
        
        return new CycleDataList(cycles, finalPrefix);
    }
}
