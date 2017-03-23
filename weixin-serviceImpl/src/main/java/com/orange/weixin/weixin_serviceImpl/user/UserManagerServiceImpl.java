package com.orange.weixin.weixin_serviceImpl.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orange.weixin.weixin_common.bo.User;
import com.orange.weixin.weixin_service.user.UserManagerService;
import com.orange.weixin.weixin_serviceImpl.user.dao.UserDao;

@Service
public class UserManagerServiceImpl implements UserManagerService {

	@Autowired
	private UserDao userdao;

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public User findUserById(String userId) {
		return userdao.selectById(userId);
	}

	public List<User> findUserListAll() {
		return userdao.selectAll();
	}
}
