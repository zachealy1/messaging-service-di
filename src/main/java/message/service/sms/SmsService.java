/**
 * File: SmsService.java
 * Package: message.service.sms
 *
 * This class extends the MessageService class to provide specific functionality
 * for sending and receiving SMS messages. It includes methods for sending and receiving
 * SMS messages that incorporate the sender's phone number in the message.
 */

package message.service.sms;

import message.service.interfaces.IReceiveMessage;
import message.service.interfaces.ISendMessage;
import message.service.interfaces.ISmsService;

/**
 * The SmsService class extends the MessageService class to provide specific
 * functionality for sending and receiving SMS messages. This class is part of the SMS service module.
 */
public class SmsService implements ISmsService {

	// Instance variable for receiving messages
	IReceiveMessage receiveMessage;

	// Instance variable for sending messages
	ISendMessage sendMessage;

	/**
	 * Constructs an SmsService with the specified receive and send message handlers.
	 *
	 * @param receiveMessage The handler for receiving messages.
	 * @param sendMessage The handler for sending messages.
	 */
	public SmsService(IReceiveMessage receiveMessage, ISendMessage sendMessage) {
		this.receiveMessage = receiveMessage;
		this.sendMessage = sendMessage;
	}

	/**
	 * Sends an SMS message and prints a message to the console indicating
	 * that an SMS is being sent, including the sender's phone number.
	 *
	 * @param message The SMS message to be sent.
	 * @param phoneNumber The sender's phone number.
	 */
	@Override
	public void sendMessage(String message, int phoneNumber) {
		System.out.println("SmsService: Sending SMS...");
		// Construct the full SMS message with the sender's phone number
		String smsMessage = "From: " + phoneNumber + "\nMessage: " + message;
		// Print a message to the console indicating that an SMS is being sent
		System.out.println("Sending SMS:\n" + smsMessage);
		// Call the sendMessage method from injected interface
		sendMessage.sendMessage(smsMessage);
	}

	/**
	 * Receives an SMS message and prints a message to the console indicating
	 * that an SMS has been received, including the sender's phone number.
	 *
	 * @param message The SMS message to be received.
	 * @param phoneNumber The sender's phone number.
	 */
	@Override
	public void receiveMessage(String message, int phoneNumber) {
		System.out.println("SmsService: Receiving SMS...");
		// Construct the full SMS message with the sender's phone number
		String smsMessage = "From: " + phoneNumber + "\nMessage: " + message;
		// Print a message to the console indicating that an SMS has been received
		System.out.println("Received SMS:\n" + smsMessage);
		// Call the receiveMessage method from injected interface
		receiveMessage.receiveMessage(smsMessage);
	}

	/**
	 * Gets the handler for receiving messages.
	 *
	 * @return The handler for receiving messages.
	 */
	public IReceiveMessage getReceiveMessage() {
		return receiveMessage;
	}

	/**
	 * Sets the handler for receiving messages.
	 *
	 * @param receiveMessage The handler for receiving messages.
	 */
	public void setReceiveMessage(IReceiveMessage receiveMessage) {
		this.receiveMessage = receiveMessage;
	}

	/**
	 * Gets the handler for sending messages.
	 *
	 * @return The handler for sending messages.
	 */
	public ISendMessage getSendMessage() {
		return sendMessage;
	}

	/**
	 * Sets the handler for sending messages.
	 *
	 * @param sendMessage The handler for sending messages.
	 */
	public void setSendMessage(ISendMessage sendMessage) {
		this.sendMessage = sendMessage;
	}
}

