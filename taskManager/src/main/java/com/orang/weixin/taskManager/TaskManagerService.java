package com.orang.weixin.taskManager;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 任务服务入口
 * 
 * @author chzq
 * 
 */
public class TaskManagerService {

	private final static Log logger = LogFactory.getLog("TaskManagerService");

	public static void main(String[] args) throws IOException {
		String[] locations = { "activeMQ.xml", "taskSchedule.xml" };
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				locations);
		logger.debug("任务消息服务启动.....................");
		context.start();
		System.out.println("按任意键退出 ");
		System.in.read();
	}
}
