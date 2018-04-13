package com.wwx.nfc.modules.web.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import com.wwx.nfc.modules.sys.controller.AbstractController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wwx.nfc.modules.web.entity.GoodsEntity;
import com.wwx.nfc.modules.web.service.GoodsService;
import com.wwx.nfc.common.utils.PageUtils;
import com.wwx.nfc.common.utils.R;



/**
 * 货物表
 *
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2018-03-27 09:37:15
 */
@RestController
@RequestMapping("web/goods")
public class GoodsController  extends AbstractController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("web:goods:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = goodsService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("web:goods:info")
    public R info(@PathVariable("id") Long id){
        GoodsEntity goods = goodsService.selectById(id);
        return R.ok().put("goods", goods);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("web:goods:save")
    public R save(@RequestBody GoodsEntity goods){
        goods.setCreateUserId(getUserId());
        goodsService.insert(goods);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("web:goods:update")
    public R update(@RequestBody GoodsEntity goods){
        goods.setCreateUserId(getUserId());
        goodsService.updateById(goods);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("web:goods:delete")
    public R delete(@RequestBody Long[] ids){
        goodsService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

}
