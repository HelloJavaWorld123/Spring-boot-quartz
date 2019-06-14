package com.jzy.quartz.utils;

import org.springframework.http.HttpEntity;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author : RXK
 * Date : 2019/6/14 11:08
 * Version: V1.0.0
 * Desc: Http请求工具类
 **/
public class HttpUtil {


	public static String post(String url,Map<String, String> param) {
		Assert.isTrue(!CollectionUtils.isEmpty(param),"参数不能为空");
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Map<String, String>> httpEntity = new HttpEntity<>(param);
		return restTemplate.patchForObject(url, httpEntity, String.class);
	}

}
