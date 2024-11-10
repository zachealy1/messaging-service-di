/**
 * File: ReceiveEmail.java
 * Package: message.service.email.receive
 *
 * This class implements the IReceiveMessage interface to provide functionality
 * for receiving emails. It contains the receiveMessage method which simulates
 * the receipt of an email message by printing a message to the console.
 */

package message.service.email.receive;

import message.service.interfaces.IReceiveMessage;

/**
 * The ReceiveEmail class implements the IReceiveMessage interface to provide
 * email receiving functionality. This class is part of the email service module.
 */
public class ReceiveEmail implements IReceiveMessage {

	/**
	 * Receives an email message and prints a message to the console indicating
	 * that an email is being received.
	 *
	 * @param message The email message to be received.
	 */
	@Override
	public void receiveMessage(String message) {
		// Print a message to the console indicating that an email is being received
		System.out.println("ReceiveEmail: Receiving email...");
	}
}

