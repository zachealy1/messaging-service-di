/**
 * File: IReceiveMessage.java
 * Package: message.service.interfaces
 *
 * This interface defines the contract for receiving messages. Implementing classes
 * must provide an implementation for the receiveMessage method, which processes
 * incoming messages.
 */

package message.service.interfaces;

/**
 * The IReceiveMessage interface defines a method for receiving messages.
 * Implementing classes are expected to provide specific functionality for handling
 * received messages.
 */
public interface IReceiveMessage {

	/**
	 * Receives a message and processes it accordingly.
	 *
	 * @param message The message to be received.
	 */
	void receiveMessage(String message);
}

