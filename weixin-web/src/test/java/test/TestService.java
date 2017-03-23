package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orange.weixin.weixin_service.user.rpc.dubbo.UserManagerService;

public class TestService {
	// App a = new App();
	public static void main(String[] args) {
		String[] locations = { "dubbo-consumer.xml" };
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				locations);
		context.start();
		UserManagerService rpcUserManagerService = (UserManagerService) context
				.getBean("rpcUserManagerService");
	}
}
