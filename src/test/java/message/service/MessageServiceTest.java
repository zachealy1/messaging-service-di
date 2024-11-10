package message.service;

import message.service.email.EmailService;
import message.service.email.receive.ReceiveEmail;
import message.service.email.send.ForwardEmail;
import message.service.sms.SmsService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MessageServiceTest {

	@Mock
	ReceiveEmail receiveEmail;
	@Mock
	ForwardEmail forwardEmail;
	@Mock
	EmailService emailService;
	@Mock
	SmsService smsService;

	MessageService messageService;

	@Before
	public void setUp() {
		emailService = Mockito.spy(new EmailService(receiveEmail, forwardEmail));
		messageService = new MessageService(smsService, emailService);
	}

	@Test
	public void testSendEmailMessage() {
		messageService.sendEmailMessage("Hello, this is an email message.", "test@test.com");

		Mockito.verify(forwardEmail).sendMessage("From: test@test.com\n" + "Message: Hello, this is an email message.");
		Mockito.verify(emailService).sendMessage("Hello, this is an email message.", "test@test.com");
	}
}
