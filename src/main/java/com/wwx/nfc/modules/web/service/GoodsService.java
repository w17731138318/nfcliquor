package com.wwx.nfc.modules.web.service;

import com.baomidou.mybatisplus.service.IService;
import com.wwx.nfc.common.utils.PageUtils;
import com.wwx.nfc.modules.web.entity.GoodsEntity;

import java.util.Map;

/**
 * 货物表
 *
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2018-03-27 09:37:15
 */
public interface GoodsService extends IService<GoodsEntity> {

    PageUtils queryPage(Map<String, Object> params);

    @Override
    boolean insert(GoodsEntity entity);
}

