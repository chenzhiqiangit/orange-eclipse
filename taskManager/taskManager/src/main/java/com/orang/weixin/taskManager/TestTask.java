package com.orang.weixin.taskManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.orang.weixin.taskManager.common.service.SchedulerService;

public class TestTask implements SchedulerService {

	private final Log logger = LogFactory.getLog(this.getClass());

	public void scheduler() {
		logger.info("测试任务。。。。。。。。。。定时执行............");
	}
}
