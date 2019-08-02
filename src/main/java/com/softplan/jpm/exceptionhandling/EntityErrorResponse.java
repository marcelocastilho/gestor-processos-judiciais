package com.softplan.jpm.exceptionhandling;

import java.util.List;

public class EntityErrorResponse {
	
	private final String message;
    private final int code;
    private final String status;
    private final String objectName;
    private final List<ErrorObject> errors;
	
    public EntityErrorResponse(String message, int code, String status, String objectName, List<ErrorObject> errors) {
		super();
		this.message = message;
		this.code = code;
		this.status = status;
		this.objectName = objectName;
		this.errors = errors;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

	public String getStatus() {
		return status;
	}

	public String getObjectName() {
		return objectName;
	}

	public List<ErrorObject> getErrors() {
		return errors;
	}
}
