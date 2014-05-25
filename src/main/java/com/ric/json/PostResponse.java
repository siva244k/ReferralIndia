package com.ric.json;

public class PostResponse {
	
	private String status = "FAILURE";
	
	private String statusMessage = "Job not posted successfully";

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
