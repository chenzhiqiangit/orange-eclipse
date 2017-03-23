package com.orange.weixin.weixin_serviceImpl.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest2 {
	public static void main(String[] args) {
		String[] locations = { "dubbo-consumer.xml" };
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				locations);
		context.start();

		HelloI helloi = (HelloI) context.getBean("helloi");
		helloi.sayHello();

	}
}
