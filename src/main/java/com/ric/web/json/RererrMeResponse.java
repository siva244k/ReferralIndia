package com.ric.web.json;

public class RererrMeResponse {
	
	private String status = "FAILURE";
	
	private String statusMessage = "Your reference not sent";

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(final String statusMessage) {
		this.statusMessage = statusMessage;
	}
	
}
