package com.jzy.quartz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;


/**
 * @author : RXK
 * 该项目用于执行定时任务
 *
 */
@EnableScheduling
@EnableTransactionManagement
@MapperScan(annotationClass = Repository.class,basePackages = "com.jzy.quartz.mapping")
@SpringBootApplication(scanBasePackages = {"com.jzy"})
public class QuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuartzApplication.class, args);
	}

}
