package com.plexobject.mock.server;

import java.util.Map;

public class RecordedResponse {
	transient int responseCode;
	Map<String, String> headers;
	String contentType;
	String payload;

	public RecordedResponse() {
	}

	public RecordedResponse(int responseCode, String contentType, Map<String, String> headers, String payload) {
		this.responseCode = responseCode;
		this.contentType = contentType;
		this.headers = headers;
		this.payload = payload;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

}