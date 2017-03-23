package com.orang.weixin.taskManager.common.service;

public interface MqService {

	/**
	 * task 任务ID
	 * 
	 * @param task
	 */
	public void send(final String task);
}
