package com.jzy.quartz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.*;

/**
 * @author : RXK
 * Date : 2019/6/14 10:25
 * Version: V1.0.0
 * Desc: 自定义定时任务线程池
 **/
@Configuration
public class CustomSchedulerConfig implements SchedulingConfigurer {


	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(taskExecutor());
	}

	@Bean
	public Executor  taskExecutor(){
		return new ScheduledThreadPoolExecutor(10,threadFactory(),rejectedExecutionHandler());
	}

	@Bean
	public RejectedExecutionHandler rejectedExecutionHandler(){
		return new ThreadPoolExecutor.CallerRunsPolicy();
	}

	@Bean
	public ThreadFactory threadFactory(){
		return Executors.defaultThreadFactory();
	}

}
