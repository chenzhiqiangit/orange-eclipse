package com.orang.weixin.taskManager;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class ConsumerQueueTest {
	public static void main(String[] args) {
		String[] locations = { "activeMQ.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(
				locations);

		JmsTemplate jmsTemplate = (JmsTemplate) context
				.getBean("jmsQueueTemplate");
		TextMessage tm = (TextMessage) jmsTemplate.receive("q.notify");
		try {
			System.out.println(tm.getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
