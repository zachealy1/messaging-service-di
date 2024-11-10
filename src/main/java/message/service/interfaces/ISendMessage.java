/**
 * File: ISendMessage.java
 * Package: message.service.interfaces
 *
 * This interface defines the contract for sending messages. Implementing classes
 * must provide an implementation for the sendMessage method, which processes
 * outgoing messages.
 */

package message.service.interfaces;

/**
 * The ISendMessage interface defines a method for sending messages.
 * Implementing classes are expected to provide specific functionality for handling
 * outgoing messages.
 */
public interface ISendMessage {

	/**
	 * Sends a message and processes it accordingly.
	 *
	 * @param message The message to be sent.
	 */
	void sendMessage(String message);
}

