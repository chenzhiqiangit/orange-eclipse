package com.orang.weixin.taskManager.common.service.task;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.orang.weixin.taskManager.common.service.AbstractMqService;
import com.orang.weixin.taskManager.common.service.SchedulerService;

/**
 * 同步地点（mdb数据同步） 先接应用服务器点对点的消息，然后发布pub的消息通知所有应用服务器同步地点。
 * 
 * @author chzq
 * 
 */
public class LocationSynchronizeService extends AbstractMqService implements
		SchedulerService {

	private final Log logger = LogFactory.getLog(this.getClass());

	public void scheduler() {
		logger.debug("发布同步地点的消息，Task==" + TaskConstant.LOCATION_SYNCHRON);
		send(TaskConstant.LOCATION_SYNCHRON);
	}
}
