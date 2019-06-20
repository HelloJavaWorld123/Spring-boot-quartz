package com.jzy.quartz.config;

import com.jzy.quartz.utils.LogUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ErrorHandler;

/**
 * @author : RXK
 * Date : 2019/6/20 9:52
 * Version: V1.0.0
 * Desc:
 **/
@Component
public class AsyncErrorHandler implements ErrorHandler{

	@Override
	public void handleError(Throwable t) {
		LogUtils.errorLog("任务执行中执行出现异常：",t);
	}
}
