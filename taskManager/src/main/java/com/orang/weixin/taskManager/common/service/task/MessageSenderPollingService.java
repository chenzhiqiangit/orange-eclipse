package com.orang.weixin.taskManager.common.service.task;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.orang.weixin.taskManager.common.service.SchedulerService;

/**
 * 定时轮询发送短信任务
 * 
 * @author chzq
 * 
 */
public class MessageSenderPollingService implements SchedulerService {

	private final Log logger = LogFactory.getLog(this.getClass());

	public void scheduler() {
		logger.debug("轮询发短信，15秒一次............................");
	}
}
