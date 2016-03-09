package model;

public class MessageBean {
	
	private String message;

	/**
	 * 
	 */
	public MessageBean() {
		this.message = "Message not set";
	}

	/**
	 * @param message
	 */
	public MessageBean(String message) {
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
