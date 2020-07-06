package com.tlog.mongo.model;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = CustomEnumDeserializer.class)
public enum ReportTypeEnum {

	ReportTypeA(1), ReportTypeB(2);
	int code;

	ReportTypeEnum(int code) {
		this.code = code;
	}

	@JsonValue
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
}
