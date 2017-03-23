package com.orange.weixin.weixin_common.mq;

public interface MqService {

	/**
	 * task 任务ID
	 * 
	 * @param task
	 */
	public void send(final String task);
}
