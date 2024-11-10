/**
 * File: IEmailService.java
 * Package: message.service.interfaces
 *
 * This interface defines the contract for the email service. Implementing classes
 * must provide an implementation for the sendMessage and receiveMessage method, which processes
 * outgoing messages.
 */
package message.service.interfaces;

/**
 * The IEmailService interface defines a method for sending and receiving messages.
 * Implementing classes are expected to provide specific functionality for handling
 * messages.
 */
public interface IEmailService {

	/**
	 * Sends a message to a specific email address.
	 *
	 * @param message The message to be sent.
	 * @param email The email address to send the message to.
	 */
	void sendMessage(String message, String email);

	/**
	 * Receives a message from a specific email address.
	 *
	 * @param message The message to be received.
	 * @param email The email address the message was sent from.
	 */
	void receiveMessage(String message, String email);
}
