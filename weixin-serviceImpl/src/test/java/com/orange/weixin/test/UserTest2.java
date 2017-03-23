package com.orange.weixin.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orange.weixin.weixin_common.bo.User;
import com.orange.weixin.weixin_service.user.rpc.dubbo.UserManagerService;

public class UserTest2 {
	public static void main(String[] args) {
		String[] locations = { "dubbo-consumer.xml" };
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				locations);
		UserManagerService userService = (UserManagerService) context
				.getBean("rpcUserManagerService");
		List<User> list = userService.findUserListAll();
		for (User u : list) {
			System.out.println(u.getUserLoginName());
		}
		System.out.println("好了");
	}
}
