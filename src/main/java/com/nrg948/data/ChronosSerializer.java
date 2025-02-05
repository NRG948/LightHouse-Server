package com.nrg948.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

public class ChronosSerializer extends StdSerializer<ChronosEvent> {

    public ChronosSerializer() {
        super(ChronosEvent.class);
    }

    @Override
    public void serialize(ChronosEvent event, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartArray(); // Start of array
        gen.writeString(event.getStr());  // First element: event name
        gen.writeNumber(event.getDouble());  // Second element: timestamp
        gen.writeEndArray(); // End of array
    }
}

