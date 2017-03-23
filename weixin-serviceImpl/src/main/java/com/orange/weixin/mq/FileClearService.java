package com.orange.weixin.mq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FileClearService extends AbstractMqService implements
		SchedulerService {

	private final Log logger = LogFactory.getLog(this.getClass());

	public void scheduler() {
		logger.debug("接收到清理文件请求，开始清理..................");
	}
}
