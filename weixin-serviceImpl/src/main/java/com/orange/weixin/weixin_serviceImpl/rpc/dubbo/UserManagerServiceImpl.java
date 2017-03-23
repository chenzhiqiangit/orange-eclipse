package com.orange.weixin.weixin_serviceImpl.rpc.dubbo;

import java.util.List;

import com.orange.weixin.mq.LocationSynchronizeService;
import com.orange.weixin.weixin_common.bo.User;
import com.orange.weixin.weixin_service.user.rpc.dubbo.UserManagerService;
import com.orange.weixin.weixin_serviceImpl.user.dao.UserDao;

public class UserManagerServiceImpl implements UserManagerService {

	private UserDao userdao;
	private LocationSynchronizeService sendLocationSynchronizeService;

	public void setSendLocationSynchronizeService(
			LocationSynchronizeService sendLocationSynchronizeService) {
		this.sendLocationSynchronizeService = sendLocationSynchronizeService;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public User findUserById(String userId) {
		return userdao.selectById(userId);
	}

	public List<User> findUserListAll() {
		return userdao.selectAll();
	}

	public void sendLocationSynchronize() {
		sendLocationSynchronizeService.scheduler();
	}

}
