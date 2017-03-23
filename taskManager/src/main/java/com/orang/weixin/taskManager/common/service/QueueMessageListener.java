package com.orang.weixin.taskManager.common.service;

import java.util.Map;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class QueueMessageListener implements MessageListener {
	private final Log logger = LogFactory.getLog(this.getClass());
	private Map<String, SchedulerService> schedulerMap;

	public void setSchedulerMap(Map<String, SchedulerService> schedulerMap) {
		this.schedulerMap = schedulerMap;
	}

	public void onMessage(Message message) {
		try {
			logger.debug("QUEUE监听到消息.........");
			if (message instanceof TextMessage) {
				TextMessage mm = (TextMessage) message;
				String taskId = mm.getText();
				logger.debug("QUEUE消息被对应的任务执行.........begin.........." + taskId);
				schedulerMap.get(taskId).scheduler();
				logger.debug("QUEUE消息被对应的任务执行.........end............" + taskId);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
