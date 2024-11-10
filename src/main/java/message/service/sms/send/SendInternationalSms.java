/**
 * File: SendInternationalSms.java
 * Package: message.service.sms.send
 *
 * This class implements the ISendMessage interface to provide functionality
 * for sending international SMS messages. It contains the sendMessage method
 * which simulates the sending of an international SMS message by printing a message
 * to the console.
 */

package message.service.sms.send;

import message.service.interfaces.ISendMessage;

/**
 * The SendInternationalSms class implements the ISendMessage interface to provide
 * functionality for sending international SMS messages. This class is part of the SMS service module.
 */
public class SendInternationalSms implements ISendMessage {

	/**
	 * Sends an international SMS message and prints a message to the console indicating
	 * that an international SMS is being sent.
	 *
	 * @param message The international SMS message to be sent.
	 */
	@Override
	public void sendMessage(String message) {
		// Print a message to the console indicating that an international SMS is being sent
		System.out.println("SendInternationalSms: Sending international SMS...");
	}
}

