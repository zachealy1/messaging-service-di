/**
 * File: MessageService.java
 * Package: message.service
 *
 * This abstract class defines the basic structure for a message service, providing
 * methods for sending and receiving messages. It utilizes the IReceiveMessage and
 * ISendMessage interfaces for handling the actual message operations.
 */

package message.service;

import message.service.interfaces.IEmailService;
import message.service.interfaces.ISmsService;

/**
 * The MessageService class is an abstract class that provides the basic structure
 * for a message service. It includes methods for sending and receiving messages
 * and utilizes the IReceiveMessage and ISendMessage interfaces.
 */
public class MessageService {

	// Instance variable for sms messages
	ISmsService smsService;

	// Instance variable for email messages
	IEmailService emailService;

	/**
	 * Constructs a MessageService with the specified receive and send message handlers.
	 *
	 * @param messageService The handler for sms messages.
	 * @param emailService The handler for email messages.
	 */
	public MessageService(ISmsService messageService, IEmailService emailService) {
		this.smsService = messageService;
		this.emailService = emailService;
	}

	/**
	 * Sends an email message and prints a message to the console indicating
	 * that an email is being sent.
	 *
	 * @param message The email message to be sent.
	 * @param email The recipient's email address.
	 */
	public void sendEmailMessage(String message, String email) {
		System.out.println("MessageService: Sending email message...");
		emailService.sendMessage(message, email);
	}

	/**
	 * Receives an email message and prints a message to the console indicating
	 * that an email has been received.
	 *
	 * @param message The email message that was received.
	 * @param email The recipient's email address.
	 */
	public void receiveEmailMessage(String message, String email) {
		System.out.println("MessageService: Receiving email message...");
		emailService.receiveMessage(message, email);
	}

	/**
	 * Sends an SMS message and prints a message to the console indicating
	 * that an SMS is being sent.
	 *
	 * @param message The SMS message to be sent.
	 * @param phoneNumber The recipient's phone number.
	 */
	public void sendSmsMessage(String message, int phoneNumber) {
		System.out.println("MessageService: Sending SMS message...");
		smsService.sendMessage(message, phoneNumber);
	}

	/**
	 * Receives an SMS message and prints a message to the console indicating
	 * that an SMS has been received.
	 *
	 * @param message The SMS message that was received.
	 * @param phoneNumber The recipient's phone number.
	 */
	public void receiveSmsMessage(String message, int phoneNumber) {
		System.out.println("MessageService: Receiving SMS message...");
		smsService.receiveMessage(message, phoneNumber);
	}

	/**
	 * Gets the handler for sms messages.
	 *
	 * @return The handler for sms messages.
	 */
	public ISmsService getSmsService() {
		return smsService;
	}

	/**
	 * Sets the handler for sms messages.
	 *
	 * @param smsService The handler for sms messages.
	 */
	public void setSmsService(ISmsService smsService) {
		this.smsService = smsService;
	}

	/**
	 * Gets the handler for email messages.
	 *
	 * @return The handler for email messages.
	 */
	public IEmailService getEmailService() {
		return emailService;
	}

	/**
	 * Sets the handler for email messages.
	 *
	 * @param emailService The handler for email messages.
	 */
	public void setEmailService(IEmailService emailService) {
		this.emailService = emailService;
	}
}



