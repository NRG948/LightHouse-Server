package com.nrg948.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

public class AutoPathSerializer extends JsonSerializer<AutoPath> {

    @Override
    public void serialize(AutoPath value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeNull();
            return;
        }

        gen.writeStartObject();
        
        if (value.getPath() != null) {
            gen.writeObjectField("path", value.getPath());
        } else {
            gen.writeNullField("path");
        }
        
        gen.writeBooleanField("attemptedClimb", value.isAttemptedClimb());
        gen.writeBooleanField("climbSuccessful", value.isClimbSuccessful());
        gen.writeObjectField("climbLevel", value.getClimbLevel());
        
        gen.writeEndObject();
    }
}
