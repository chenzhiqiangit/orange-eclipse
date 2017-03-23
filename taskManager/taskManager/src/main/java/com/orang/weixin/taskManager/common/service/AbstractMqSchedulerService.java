package com.orang.weixin.taskManager.common.service;

/**
 * actionQM 任务 接口
 * 
 * @author chzq
 * 
 */
public abstract class AbstractMqSchedulerService implements SchedulerService {

	// 消息ID
	protected String taskId;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
}
