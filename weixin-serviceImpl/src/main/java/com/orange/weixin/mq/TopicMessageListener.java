package com.orange.weixin.mq;

import java.util.Map;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TopicMessageListener implements MessageListener {
	private final Log logger = LogFactory.getLog(this.getClass());
	private Map<String, SchedulerService> schedulerMap;

	public void setSchedulerMap(Map<String, SchedulerService> schedulerMap) {
		this.schedulerMap = schedulerMap;
	}

	public void onMessage(Message message) {
		try {
			logger.debug("TOPiC监听到消息.........");
			if (message instanceof TextMessage) {
				TextMessage mm = (TextMessage) message;
				String taskId = mm.getText();
				logger.debug("TOPiC消息被对应的任务执行.........begin.........." + taskId);
				schedulerMap.get(taskId).scheduler();
				logger.debug("TOPiC消息被对应的任务执行.........end............" + taskId);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
