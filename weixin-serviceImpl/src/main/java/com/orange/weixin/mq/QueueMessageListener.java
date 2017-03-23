package com.orange.weixin.mq;

import java.util.Map;

import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

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
			if (message instanceof MapMessage) {
				MapMessage mm = (MapMessage) message;
				String taskId = mm.getString("taskId");
				logger.debug("QUEUE监听到消息.........taskID=" + taskId);
				logger.debug("QUEUE消息被对应的任务执行.........begin ");
				schedulerMap.get(taskId).scheduler();
				logger.debug("QUEUE消息被对应的任务执行.........end ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
