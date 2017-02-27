package com.oy.utils;

import java.io.Serializable;

public class ResponseMsg implements Serializable {
	private static final long serialVersionUID = 1L;
	private String responseCode;
	private String responseMsg;
	private Object obj;

	public ResponseMsg() {
	}

	public ResponseMsg(String responseCode, String responseMsg) {
		this.responseCode = responseCode;
		this.responseMsg = responseMsg;
	}

	public ResponseMsg(String responseCode, String responseMsg, Object obj) {
		this.responseCode = responseCode;
		this.responseMsg = responseMsg;
		this.obj = obj;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
