package com.wwx.nfc.modules.web.service;

import com.baomidou.mybatisplus.service.IService;
import com.wwx.nfc.common.utils.PageUtils;
import com.wwx.nfc.modules.web.entity.BottleEntity;

import java.util.Map;

/**
 * 
 *
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2018-03-28 14:11:16
 */
public interface BottleService extends IService<BottleEntity> {

    PageUtils queryPage(Map<String, Object> params);

	BottleEntity selectByNfcCode(String nfcCode);
}

