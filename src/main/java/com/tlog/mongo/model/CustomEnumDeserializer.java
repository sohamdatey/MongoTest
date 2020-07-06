package com.tlog.mongo.model;

import java.io.IOException;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class CustomEnumDeserializer extends StdDeserializer<ReportTypeEnum> {
	 
	private static final long serialVersionUID = 1L;

	public CustomEnumDeserializer() {
		super(ReportTypeEnum.class);
	}

	@Override
    public ReportTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
      throws IOException, JsonProcessingException {
       
		JsonNode node = jsonParser.getCodec().readTree(jsonParser);
 
        int unit = node.intValue();
 
        for (ReportTypeEnum x : ReportTypeEnum.values()) {
            
            if (x.getCode()==unit) {
                return x;
            }
        }
 
        return null;
    }
}