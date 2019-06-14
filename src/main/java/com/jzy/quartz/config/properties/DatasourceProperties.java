package com.jzy.quartz.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author : RXK
 * Date : 2019/6/13 11:39
 * Version: V1.0.0
 * Desc: 数据库属性相关配置
 **/
@Data
@ConfigurationProperties(prefix = "spring.datasource")
public class DatasourceProperties {


	private String url;

	private String userName;

	private String password;

	private String driverClassName;


	@Data
	@ConfigurationProperties(prefix = "spring.datasource.druid")
	public class DatasourceDruid {

		private Integer initialSize;

		private Integer maxActive;

		private Long maxWait;

		private Integer minIdle;


		private Boolean testOnBorrow;

		private Boolean testOnReturn;

		private Boolean testWhileIdle;

		private String validationQuery;

		private Long validationQueryTimeOut;

		private Long timeBetweenEvictionRunsMillis;

		private Long minEvictableIdleTimeMillis;

		private Boolean poolPreparedStatements;

		private Boolean asyncInit;

		private String filters;
	}


}
