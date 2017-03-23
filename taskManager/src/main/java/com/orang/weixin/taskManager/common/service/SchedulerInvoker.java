package com.orang.weixin.taskManager.common.service;

import java.util.List;

/**
 * 轮询调用服务接口
 * 
 * @author chzq
 * 
 * @param <T>
 */
public interface SchedulerInvoker<T extends SchedulerService> {
	public void setServiceList(List<T> schedulerServiceList);

	/**
	 * 任务服务调用方法（服务可以对应对个任务）
	 * 
	 */
	public void doSchedule();
}
