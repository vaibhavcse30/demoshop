package com.shop.common.model;

public class Announcment {

	private String message_type; // broadcast or private
	private String directed_to = "all"; // broadcast (all) or else populate with
	private String category;
	private String message;
	private String scheduled_timestamp; // selectdata and time and send

	public String getMessage_type() {
		return message_type;
	}

	public void setMessage_type(String message_type) {
		this.message_type = message_type;
	}

	public String getDirected_to() {
		return directed_to;
	}

	public void setDirected_to(String directed_to) {
		this.directed_to = directed_to;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getScheduled_timestamp() {
		return scheduled_timestamp;
	}

	public void setScheduled_timestamp(String scheduled_timestamp) {
		this.scheduled_timestamp = scheduled_timestamp;
	}
}
