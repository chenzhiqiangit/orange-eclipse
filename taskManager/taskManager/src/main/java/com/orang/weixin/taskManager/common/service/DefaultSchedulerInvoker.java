package com.orang.weixin.taskManager.common.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DefaultSchedulerInvoker implements
		SchedulerInvoker<SchedulerService> {

	private final Log logger = LogFactory.getLog(this.getClass());
	private List<SchedulerService> serviceList;

	public void setServiceList(List<SchedulerService> serviceList) {
		this.serviceList = serviceList;
	}

	public void doSchedule() {
		logger.info("start schedulling");
		if (serviceList == null || serviceList.size() == 0) {
			return;
		}
		for (SchedulerService ss : serviceList) {
			if (ss == null) {
				continue;
			}
			try {
				ss.scheduler();
			} catch (Exception e) {
				logger.error("schedule error: " + e.getMessage());
			}
		}
		logger.info("end schedulling");

	}
}
