/**
 * File: SendEmail.java
 * Package: message.service.email.send
 *
 * This class implements the ISendMessage interface to provide functionality
 * for sending emails. It contains the sendMessage method which simulates
 * the sending of an email message by printing a message to the console.
 */

package message.service.email.send;

import message.service.interfaces.ISendMessage;

/**
 * The SendEmail class implements the ISendMessage interface to provide
 * functionality for sending emails. This class is part of the email service module.
 */
public class SendEmail implements ISendMessage {

	/**
	 * Sends an email message and prints a message to the console indicating
	 * that an email is being sent.
	 *
	 * @param message The email message to be sent.
	 */
	@Override
	public void sendMessage(String message) {
		// Print a message to the console indicating that an email is being sent
		System.out.println("SendEmail: Sending email...");
	}
}

