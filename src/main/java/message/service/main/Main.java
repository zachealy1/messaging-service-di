/**
 * File: Main.java
 * Package: message.service.main
 *
 * This class serves as the entry point for demonstrating the functionality of the
 * email and SMS services. It sets up different configurations for sending and
 * receiving messages using various implementations of the send and receive interfaces.
 */

package message.service.main;

import message.service.MessageService;
import message.service.email.EmailService;
import message.service.email.receive.ReceiveEmail;
import message.service.email.receive.ReceiveJunkEmail;
import message.service.email.send.ForwardEmail;
import message.service.email.send.SendEmail;
import message.service.sms.SmsService;
import message.service.sms.receive.ReceiveDomesticSms;
import message.service.sms.receive.ReceiveInternationalSms;
import message.service.sms.send.SendDomesticSms;
import message.service.sms.send.SendInternationalSms;

/**
 * The Main class demonstrates the use of the EmailService and SmsService classes
 * with different configurations for sending and receiving messages.
 */
public class Main {

	/**
	 * The main method serves as the entry point of the application and demonstrates
	 * the functionality of the email and SMS services with various configurations.
	 *
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		System.out.println("-------------------- ReceiveEmail/ForwardEmail and ReceiveDomesticSms/SendDomesticSms Constructor Injection--------------------");
		ReceiveEmail receiveEmail = new ReceiveEmail();
		ForwardEmail forwardEmail = new ForwardEmail();
		EmailService emailService = new EmailService(receiveEmail, forwardEmail);
		ReceiveDomesticSms receiveDomesticSms = new ReceiveDomesticSms();
		SendDomesticSms sendDomesticSms = new SendDomesticSms();
		SmsService smsService = new SmsService(receiveDomesticSms, sendDomesticSms);
		MessageService messageService = new MessageService(smsService, emailService);
		messageService.receiveEmailMessage("Hello, this is an email message.", "test@test.com");
		messageService.sendEmailMessage("Hello, this is an email message.", "test@test.com");
		messageService.receiveSmsMessage("Hello, this is an SMS message.", 1234567890);
		messageService.sendSmsMessage("Hello, this is an SMS message.", 1234567890);
		System.out.println();

		System.out.println("-------------------- ReceiveJunkEmail/SendEmail and ReceiveInternationalSms/SendInternationalSms Setter Injection--------------------");
		ReceiveJunkEmail receiveJunkEmail = new ReceiveJunkEmail();
		SendEmail sendEmail = new SendEmail();
		emailService.setReceiveMessage(receiveJunkEmail);
		emailService.setSendMessage(sendEmail);
		ReceiveInternationalSms receiveInternationalSms = new ReceiveInternationalSms();
		SendInternationalSms sendInternationalSms = new SendInternationalSms();
		smsService.setReceiveMessage(receiveInternationalSms);
		smsService.setSendMessage(sendInternationalSms);
		messageService.setEmailService(emailService);
		messageService.setSmsService(smsService);
		messageService.receiveEmailMessage("Hello, this is another email message.", "test2@test.com");
		messageService.sendEmailMessage("Hello, this is another email message.", "test2@test.com");
		messageService.receiveSmsMessage("Hello, this is another SMS message.", 987654321);
		messageService.sendSmsMessage("Hello, this is another SMS message.", 987654321);
		System.out.println();

	}
}

