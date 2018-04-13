package com.wwx.nfc.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class WebUtils {

	/**
	 * 生成UUID
	 * @return
	 */
	public static String uuid() {
		return UUID.randomUUID().toString().replace("-", "");//用来生成id;
	}
	/**
	 * 当前时间yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String nowTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

}
