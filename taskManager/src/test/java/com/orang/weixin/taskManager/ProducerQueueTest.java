package com.orang.weixin.taskManager;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class ProducerQueueTest {
	public static void main(String[] args) {
		String[] locations = { "activeMQ.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(
				locations);

		JmsTemplate jmsTemplate = (JmsTemplate) context
				.getBean("jmsQueueTemplate");
		jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage("快快快快快................");
			}
		});
		System.out.println("ok..................");
	}
}
