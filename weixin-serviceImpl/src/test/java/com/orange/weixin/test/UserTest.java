package com.orange.weixin.test;

import java.io.IOException;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orange.weixin.weixin_common.bo.User;
import com.orange.weixin.weixin_service.user.UserManagerService;

public class UserTest extends TestCase {

	public void testFindUserById() {
		String[] locations = { "applicationContext.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(
				locations);
		UserManagerService dao = (UserManagerService) context
				.getBean("userManagerService");
		User user = dao.findUserById("1");
		System.out.println(user.toString());
	}

	public static void main(String[] args) throws IOException {
		String[] locations = { "applicationContext.xml", "mybatis-config.xml",
				"dubbo-provider.xml" };
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				locations);
		context.start();
		System.out.println("按任意键退出");
		System.in.read();

	}
}
