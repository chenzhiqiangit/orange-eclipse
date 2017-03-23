package com.orange.weixin.weixin_service.user;

import java.util.List;

import com.orange.weixin.weixin_common.bo.User;

public interface UserManagerService {
	public User findUserById(String userId);

	public List<User> findUserListAll();
}
