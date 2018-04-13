package com.wwx.nfc.modules.web.service.impl;

import com.wwx.nfc.modules.web.entity.BottleEntity;
import com.wwx.nfc.modules.web.service.BottleService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wwx.nfc.common.utils.PageUtils;
import com.wwx.nfc.common.utils.Query;

import com.wwx.nfc.modules.web.dao.GoodsDao;
import com.wwx.nfc.modules.web.entity.GoodsEntity;
import com.wwx.nfc.modules.web.service.GoodsService;


/**
 * @author Administrator
 */
@Service("goodsService")
public class GoodsServiceImpl extends ServiceImpl<GoodsDao, GoodsEntity> implements GoodsService {

    @Autowired
    private BottleService bottleService;
    @Override
    public boolean insert(GoodsEntity entity) {
        if(super.insert(entity)){
            List<BottleEntity> list  = new ArrayList<>();
            for (int i = 0; i < entity.getIndexes(); i++) {
                list.add(new BottleEntity(entity.getId(),entity.getBatch()).nfcCode());
            }
            return bottleService.insertBatch(list);
        }
        return false;
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String goodsName = (String)params.get("goodsName");
        String goodsType = (String)params.get("goodsType");
        String productionDate = (String)params.get("productionDate");
        String batch = (String)params.get("batch");
        String indexes = (String)params.get("indexes");
        Page<GoodsEntity> page = this.selectPage(
                new Query<GoodsEntity>(params).getPage(),
                new EntityWrapper<GoodsEntity>()
                        .like(StringUtils.isNotBlank(goodsName),"goods_name", goodsName)
                        .like(StringUtils.isNotBlank(goodsType),"goods_type", goodsType)
                        .eq(StringUtils.isNotBlank(productionDate),"production_date", productionDate)
                        .eq(StringUtils.isNotBlank(batch),"batch", batch)
                        .eq(StringUtils.isNotBlank(indexes),"indexes", indexes)
        );

        return new PageUtils(page);
    }

}
