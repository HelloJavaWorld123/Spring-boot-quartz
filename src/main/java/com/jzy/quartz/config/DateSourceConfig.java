package com.jzy.quartz.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.wall.WallConfig;
import com.alibaba.druid.wall.WallFilter;
import com.jzy.quartz.config.properties.DatasourceProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @author : RXK
 * Date : 2019/6/13 11:38
 * Version: V1.0.0
 * Desc: 数据库配置
 **/
@Slf4j
@Configuration
@EnableConfigurationProperties(value = {DatasourceProperties.class, DatasourceProperties.DatasourceDruid.class})
public class DateSourceConfig {

	@Autowired
	private DatasourceProperties datasourceProperties;

	@Autowired
	private DatasourceProperties.DatasourceDruid datasourceDruid;


	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(datasourceProperties.getUrl());
		dataSource.setUsername(datasourceProperties.getUserName());
		dataSource.setPassword(datasourceProperties.getPassword());
		dataSource.setDriverClassName(datasourceProperties.getDriverClassName());

		dataSource.setMaxActive(datasourceDruid.getMaxActive());
		dataSource.setMinIdle(datasourceDruid.getMinIdle());
		dataSource.setInitialSize(datasourceDruid.getInitialSize());
		dataSource.setTestWhileIdle(datasourceDruid.getTestWhileIdle());
		dataSource.setTestOnReturn(datasourceDruid.getTestOnReturn());
		dataSource.setTestOnBorrow(datasourceDruid.getTestOnBorrow());
		dataSource.setValidationQuery(datasourceDruid.getValidationQuery());
		dataSource.setTimeBetweenEvictionRunsMillis(datasourceDruid.getTimeBetweenEvictionRunsMillis());
		dataSource.setMinEvictableIdleTimeMillis(datasourceDruid.getMinEvictableIdleTimeMillis());
		dataSource.setAsyncInit(datasourceDruid.getAsyncInit());
		try {
			dataSource.setFilters(datasourceDruid.getFilters());

			List<Filter> proxyFilters = dataSource.getProxyFilters();
			for (Filter filter : proxyFilters) {
				if (filter instanceof WallFilter) {
					((WallFilter) filter).setConfig(wallConfig());
				}
			}
		} catch (SQLException e) {
			log.info("配置数据库过滤器出现异常:", e);
		}


		return dataSource;
	}


	@Bean
	public DataSourceTransactionManager manager() {
		return new DataSourceTransactionManager(dataSource());
	}


	@Bean
	public WallFilter wallFilter() {
		WallFilter filter = new WallFilter();
		filter.setConfig(wallConfig());
		filter.setDbType("mysql");
		return filter;
	}


	@Bean
	public WallConfig wallConfig() {
		WallConfig wallConfig = new WallConfig();
		wallConfig.setDeleteWhereAlwayTrueCheck(Boolean.TRUE);
		wallConfig.setDropTableAllow(Boolean.FALSE);
		wallConfig.setMultiStatementAllow(Boolean.TRUE);
		return wallConfig;
	}

	@Bean
	@Profile(value = {"!prod"})
	public ServletRegistrationBean registrationBean() {
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new StatViewServlet());
		registrationBean.addUrlMappings("/druid/*");
		registrationBean.addInitParameter("allow", "127.0.0.1");
		registrationBean.addInitParameter("loginUsername", "admin");
		registrationBean.addInitParameter("loginPassword", "admin");
		registrationBean.addInitParameter("resetEnable", "false");
		return registrationBean;
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean(new WebStatFilter());
		registrationBean.addUrlPatterns("/*");
		registrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		return registrationBean;
	}


}
