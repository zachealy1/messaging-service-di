/**
 * File: ReceiveDomesticSms.java
 * Package: message.service.sms.receive
 *
 * This class implements the IReceiveMessage interface to provide functionality
 * for receiving domestic SMS messages. It contains the receiveMessage method
 * which simulates the receipt of a domestic SMS message by printing a message
 * to the console.
 */

package message.service.sms.receive;

import message.service.interfaces.IReceiveMessage;

/**
 * The ReceiveDomesticSms class implements the IReceiveMessage interface to provide
 * functionality for receiving domestic SMS messages. This class is part of the SMS service module.
 */
public class ReceiveDomesticSms implements IReceiveMessage {

	/**
	 * Receives a domestic SMS message and prints a message to the console indicating
	 * that a domestic SMS is being received.
	 *
	 * @param message The domestic SMS message to be received.
	 */
	@Override
	public void receiveMessage(String message) {
		// Print a message to the console indicating that a domestic SMS is being received
		System.out.println("ReceiveDomesticSms: Receiving domestic SMS...");
	}
}

