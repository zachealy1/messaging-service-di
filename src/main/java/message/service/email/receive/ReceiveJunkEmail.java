/**
 * File: ReceiveJunkEmail.java
 * Package: message.service.email.receive
 *
 * This class implements the IReceiveMessage interface to provide functionality
 * for receiving junk emails. It contains the receiveMessage method which simulates
 * the receipt of a junk email message by printing a message to the console.
 */

package message.service.email.receive;

import message.service.interfaces.IReceiveMessage;

/**
 * The ReceiveJunkEmail class implements the IReceiveMessage interface to provide
 * functionality for receiving junk emails. This class is part of the email service module.
 */
public class ReceiveJunkEmail implements IReceiveMessage {

	/**
	 * Receives a junk email message and prints a message to the console indicating
	 * that a junk email is being received.
	 *
	 * @param message The junk email message to be received.
	 */
	@Override
	public void receiveMessage(String message) {
		// Print a message to the console indicating that a junk email is being received
		System.out.println("ReceiveJunkEmail: Receiving junk email...");
	}
}

