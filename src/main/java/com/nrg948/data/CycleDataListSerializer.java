package com.nrg948.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.List;

public class CycleDataListSerializer extends JsonSerializer<CycleDataList> {

    @Override
    public void serialize(CycleDataList value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null || value.getCycles() == null) {
            return;
        }

        List<CycleData> cycles = value.getCycles();
        String prefix = value.getKeyPrefix();

        for (int i = 0; i < cycles.size(); i++) {
            String key = prefix + i;
            gen.writeObjectField(key, cycles.get(i));
        }
    }
}
