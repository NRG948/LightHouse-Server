package com.nrg948.data;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class ChronosEventDeserializer extends JsonDeserializer<ChronosEvent> {

    @Override
    public ChronosEvent deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        // Get the array node
        ArrayNode arrayNode = jp.getCodec().readTree(jp);

        // Assuming the array has exactly two elements
        String eventType = arrayNode.get(0).asText();
        Double eventTime = arrayNode.get(1).asDouble();

        // Create the ChronosEvent object
        ChronosEvent out = new ChronosEvent();
        out.setStr(eventType);
        out.setDouble(eventTime);
        return out;
    }
}

