package com.wwx.nfc.modules.web.service.impl;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wwx.nfc.common.utils.PageUtils;
import com.wwx.nfc.common.utils.Query;

import com.wwx.nfc.modules.web.dao.BottleDao;
import com.wwx.nfc.modules.web.entity.BottleEntity;
import com.wwx.nfc.modules.web.service.BottleService;


@Service("bottleService")
public class BottleServiceImpl extends ServiceImpl<BottleDao, BottleEntity> implements BottleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BottleEntity> page = this.selectPage(
                new Query<BottleEntity>(params).getPage(),
                new EntityWrapper<BottleEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public BottleEntity selectByNfcCode(String nfcCode) {
        BottleEntity bottleEntity = baseMapper.queryByUserName(nfcCode);
        this.updateById(bottleEntity);
        return bottleEntity;
    }

}
