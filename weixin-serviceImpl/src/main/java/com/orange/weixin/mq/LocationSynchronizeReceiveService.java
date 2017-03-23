package com.orange.weixin.mq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 同步地点（mdb数据同步） 先接应用服务器点对点的消息，然后发布pub的消息通知所有应用服务器同步地点。
 * 
 * @author chzq
 * 
 */
public class LocationSynchronizeReceiveService extends AbstractMqService
		implements SchedulerService {

	private final Log logger = LogFactory.getLog(this.getClass());

	public void scheduler() {
		logger.debug("收到同步地点操作............................");
	}
}
