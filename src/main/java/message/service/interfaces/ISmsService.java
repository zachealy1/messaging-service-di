/**
 * File: ISmsService.java
 * Package: message.service.interfaces
 *
 * This interface defines the contract for the sms service. Implementing classes
 * must provide an implementation for the sendMessage and receiveMessage method, which processes
 * outgoing messages.
 */
package message.service.interfaces;

/**
 * The ISmsService interface defines a method for sending and receiving messages.
 * Implementing classes are expected to provide specific functionality for handling
 * messages.
 */
public interface ISmsService {

	/**
	 * Sends a message to a specific phone number.
	 *
	 * @param message The message to be sent.
	 * @param phoneNumber The phone number to send the message to.
	 */
	void sendMessage(String message, int phoneNumber);

	/**
	 * Receives a message from a specific phone number.
	 *
	 * @param message The message to be received.
	 * @param phoneNumber The phone number the message was sent from.
	 */
	void receiveMessage(String message, int phoneNumber);
}
