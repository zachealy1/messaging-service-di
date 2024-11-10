/**
 * File: EmailService.java
 * Package: message.service.email
 *
 * This class extends the MessageService class to provide specific functionality
 * for sending and receiving emails. It includes methods for sending and receiving
 * emails that incorporate the sender's email address in the message.
 */

package message.service.email;

import message.service.interfaces.IEmailService;
import message.service.interfaces.IReceiveMessage;
import message.service.interfaces.ISendMessage;

/**
 * The EmailService class implements the IEmailService interface to provide specific
 * functionality for sending and receiving emails. This class is part of the email service module.
 */
public class EmailService implements IEmailService {

	// Instance variable for receiving messages
	private IReceiveMessage receiveMessage;

	// Instance variable for sending messages
	private ISendMessage sendMessage;

	/**
	 * Constructs an EmailService with the specified receive and send message handlers.
	 * Initializes the instance variables receiveMessage and sendMessage with the provided parameters.
	 *
	 * @param receiveMessage The handler for receiving messages.
	 * @param sendMessage The handler for sending messages.
	 */
	public EmailService(IReceiveMessage receiveMessage, ISendMessage sendMessage) {
		this.receiveMessage = receiveMessage;
		this.sendMessage = sendMessage;
	}

	/**
	 * Sends an email message and prints a message to the console indicating
	 * that an email is being sent, including the sender's email address.
	 *
	 * @param message The email message to be sent.
	 * @param email The sender's email address.
	 */
	@Override
	public void sendMessage(String message, String email) {
		System.out.println("EmailService: Sending email...");
		// Construct the full email message with the sender's email address
		String emailMessage = "From: " + email + "\nMessage: " + message;
		// Print a message to the console indicating that an email is being sent
		System.out.println("Sending email:\n" + emailMessage);
		// Call sendMessage method from injected sendMessage interface
		sendMessage.sendMessage(emailMessage);
	}

	/**
	 * Receives an email message and prints a message to the console indicating
	 * that an email has been received, including the sender's email address.
	 *
	 * @param message The email message to be received.
	 * @param email The sender's email address.
	 */
	@Override
	public void receiveMessage(String message, String email) {
		System.out.println("EmailService: Receiving email...");
		// Construct the full email message with the sender's email address
		String emailMessage = "From: " + email + "\nMessage: " + message;
		// Print a message to the console indicating that an email has been received
		System.out.println("Received email:\n" + emailMessage);
		// Call receiveMessage method from injected receiveMessage interface
		receiveMessage.receiveMessage(emailMessage);
	}

	/**
	 * Gets the current receiveMessage handler.
	 *
	 * @return The handler for receiving messages.
	 */
	public IReceiveMessage getReceiveMessage() {
		return receiveMessage;
	}

	/**
	 * Sets a new receiveMessage handler.
	 *
	 * @param receiveMessage The new handler for receiving messages.
	 */
	public void setReceiveMessage(IReceiveMessage receiveMessage) {
		this.receiveMessage = receiveMessage;
	}

	/**
	 * Gets the current sendMessage handler.
	 *
	 * @return The handler for sending messages.
	 */
	public ISendMessage getSendMessage() {
		return sendMessage;
	}

	/**
	 * Sets a new sendMessage handler.
	 *
	 * @param sendMessage The new handler for sending messages.
	 */
	public void setSendMessage(ISendMessage sendMessage) {
		this.sendMessage = sendMessage;
	}
}


