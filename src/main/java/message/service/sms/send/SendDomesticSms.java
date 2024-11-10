/**
 * File: SendDomesticSms.java
 * Package: message.service.sms.send
 *
 * This class implements the ISendMessage interface to provide functionality
 * for sending domestic SMS messages. It contains the sendMessage method
 * which simulates the sending of a domestic SMS message by printing a message
 * to the console.
 */

package message.service.sms.send;

import message.service.interfaces.ISendMessage;

/**
 * The SendDomesticSms class implements the ISendMessage interface to provide
 * functionality for sending domestic SMS messages. This class is part of the SMS service module.
 */
public class SendDomesticSms implements ISendMessage {

	/**
	 * Sends a domestic SMS message and prints a message to the console indicating
	 * that a domestic SMS is being sent.
	 *
	 * @param message The domestic SMS message to be sent.
	 */
	@Override
	public void sendMessage(String message) {
		// Print a message to the console indicating that a domestic SMS is being sent
		System.out.println("SendDomesticSms: Sending domestic SMS...");
	}
}

