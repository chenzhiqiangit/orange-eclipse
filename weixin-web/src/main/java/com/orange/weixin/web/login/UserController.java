package com.orange.weixin.web.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.orange.weixin.weixin_common.bo.User;
import com.orange.weixin.weixin_service.user.UserManagerService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserManagerService userManagerService;

	@RequestMapping(value = "/userList")
	public String userList() {
		// String[] locations = { "dubbo-consumer.xml" };
		// ApplicationContext context = new ClassPathXmlApplicationContext(locations);
		// UserManagerService rpcUserManagerService = (UserManagerService) context.getBean("rpcUserManagerService");
		List<User> list = userManagerService.findUserListAll();
		ModelAndView mode = new ModelAndView();
		mode.addObject("userList", list);
		return "userList";
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/findUser")
	@ResponseBody
	public User getUser(HttpServletRequest r) {
		User user = new User();
		user.setChangeLoginName("test");
		user.setCity("上海");
		return user;
	}

	@RequestMapping("/locationSynchron")
	public String locationSynchron(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request.getParameter("username"));
		// userManagerService.sendLocationSynchronize();
		ModelAndView mode = new ModelAndView();
		return "locationOk";
	}
}
