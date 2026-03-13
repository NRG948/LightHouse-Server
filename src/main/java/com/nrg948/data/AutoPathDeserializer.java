package com.nrg948.data;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class AutoPathDeserializer extends JsonDeserializer<AutoPath> {

    @Override
    public AutoPath deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        ObjectMapper mapper = (ObjectMapper) p.getCodec();
        JsonNode node = mapper.readTree(p);
        
        if (node == null || node.isNull()) {
            return null;
        }

        AutoPath autoPath = new AutoPath();
        
        if (node.has("path") && !node.get("path").isNull()) {
            autoPath.setPath(mapper.convertValue(node.get("path"), Object[].class));
        }
        
        if (node.has("attemptedClimb")) {
            autoPath.setAttemptedClimb(node.get("attemptedClimb").asBoolean());
        }
        
        if (node.has("climbSuccessful")) {
            autoPath.setClimbSuccessful(node.get("climbSuccessful").asBoolean());
        }
        
        if (node.has("climbLevel") && !node.get("climbLevel").isNull()) {
            autoPath.setClimbLevel(mapper.convertValue(node.get("climbLevel"), Object.class));
        }
        
        return autoPath;
    }
}
