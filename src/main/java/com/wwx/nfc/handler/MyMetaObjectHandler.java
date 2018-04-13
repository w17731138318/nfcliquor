package com.wwx.nfc.handler;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-04-09 16:28
 * @see
 **/
public class MyMetaObjectHandler extends MetaObjectHandler {

	protected final static Logger logger = LoggerFactory.getLogger(MyMetaObjectHandler.class);

	@Override
	public void insertFill(MetaObject metaObject) {
		Object createTime = getFieldValByName("createTime", metaObject);
		if (createTime == null) {
			setFieldValByName("createTime", new Date(), metaObject);
		}
	}

	@Override
	public void updateFill(MetaObject metaObject) {
		Object lastCheckTime = getFieldValByName("lastCheckTime", metaObject);
		if (lastCheckTime == null) {
			setFieldValByName("lastCheckTime", new Date(), metaObject);
		}
	}
}
