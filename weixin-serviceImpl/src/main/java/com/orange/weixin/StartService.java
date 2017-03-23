package com.orange.weixin;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartService {
	public static void main(String[] args) throws IOException {
		String[] locations = { "activeMQ.xml", "dubbo-provider.xml", "applicationContext.xml", "mybatis-config.xml" };
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(locations);
		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}
}
