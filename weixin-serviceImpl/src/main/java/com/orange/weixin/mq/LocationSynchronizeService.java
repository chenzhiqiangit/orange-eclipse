package com.orange.weixin.mq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.orange.weixin.weixin_common.mq.TaskConstant;

/**
 * 同步地点（mdb数据同步） 先接应用服务器点对点的消息，然后发布pub的消息通知所有应用服务器同步地点。
 * 
 * @author chzq
 * 
 */
public class LocationSynchronizeService extends AbstractMqService {

	private final Log logger = LogFactory.getLog(this.getClass());

	public void scheduler() {
		logger.debug("发送给同步服务器通知同步地点..................");
		send(TaskConstant.LOCATION_SYNCHRON);
	}
}
