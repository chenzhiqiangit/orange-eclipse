package com.orang.weixin.taskManager.common.service.task;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.orang.weixin.taskManager.common.service.AbstractMqService;
import com.orang.weixin.taskManager.common.service.SchedulerService;

/**
 * 凌晨1点，发布清理临时文件任务任务
 * 
 * @author chzq
 * 
 */
public class FileClearService extends AbstractMqService implements
		SchedulerService {

	private final Log logger = LogFactory.getLog(this.getClass());

	public void scheduler() {
		logger.debug("凌晨1点，通过MQ向集群的应用服务器发送清理临时文件任务，Task=="
				+ TaskConstant.FILE_CLEAR);
		send(TaskConstant.FILE_CLEAR);
	}
}
