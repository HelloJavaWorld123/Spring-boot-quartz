package com.jzy.quartz.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : RXK
 * Date : 2019/6/18 15:41
 * Version: V1.0.0
 * Desc:
 **/
@Slf4j
public class LogUtils {

	public static void infoLog(String msg){
		log.info("----------------"+msg+"-------------------");
	}

	public static void errorLog(String msg){
		log.error("---------------"+msg+"--------------------");
	}

}