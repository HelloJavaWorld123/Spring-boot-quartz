package com.jzy.quartz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author : RXK
 * Date : 2019/6/14 10:25
 * Version: V1.0.0
 * Desc: 自定义定时任务线程池
 **/
@Configuration
public class CustomSchedulerConfig implements SchedulingConfigurer {


	private final AsyncErrorHandler errorHandler;

	public CustomSchedulerConfig(AsyncErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}


	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(taskScheduler());
	}

	@Bean
	public TaskScheduler taskScheduler(){
		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
		scheduler.setPoolSize(10);
		scheduler.setErrorHandler(errorHandler);
		scheduler.setWaitForTasksToCompleteOnShutdown(true);
		scheduler.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy());
		scheduler.setThreadNamePrefix("jzy-quartz-");
		scheduler.initialize();
		return scheduler;
	}

}
