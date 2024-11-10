/**
 * File: ReceiveInternationalSms.java
 * Package: message.service.sms.receive
 *
 * This class implements the IReceiveMessage interface to provide functionality
 * for receiving international SMS messages. It contains the receiveMessage method
 * which simulates the receipt of an international SMS message by printing a message
 * to the console.
 */

package message.service.sms.receive;

import message.service.interfaces.IReceiveMessage;

/**
 * The ReceiveInternationalSms class implements the IReceiveMessage interface to provide
 * functionality for receiving international SMS messages. This class is part of the SMS service module.
 */
public class ReceiveInternationalSms implements IReceiveMessage {

	/**
	 * Receives an international SMS message and prints a message to the console indicating
	 * that an international SMS is being received.
	 *
	 * @param message The international SMS message to be received.
	 */
	@Override
	public void receiveMessage(String message) {
		// Print a message to the console indicating that an international SMS is being received
		System.out.println("ReceiveInternationalSms: Receiving international SMS...");
	}
}

