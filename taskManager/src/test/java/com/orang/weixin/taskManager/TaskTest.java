package com.orang.weixin.taskManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaskTest {
	public void testTask() {
	}

	public static void main(String[] args) {
		String[] locations = { "taskSchedule.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(
				locations);
	}
}
