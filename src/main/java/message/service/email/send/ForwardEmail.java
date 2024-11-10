/**
 * File: ForwardEmail.java
 * Package: message.service.email.send
 *
 * This class implements the ISendMessage interface to provide functionality
 * for forwarding emails. It contains the sendMessage method which simulates
 * the forwarding of an email message by printing a message to the console.
 */

package message.service.email.send;

import message.service.interfaces.ISendMessage;

/**
 * The ForwardEmail class implements the ISendMessage interface to provide
 * functionality for forwarding emails. This class is part of the email service module.
 */
public class ForwardEmail implements ISendMessage {

	/**
	 * Forwards an email message and prints a message to the console indicating
	 * that an email is being forwarded.
	 *
	 * @param message The email message to be forwarded.
	 */
	@Override
	public void sendMessage(String message) {
		// Print a message to the console indicating that an email is being forwarded
		System.out.println("ForwardEmail: Forwarding email...");
	}
}

