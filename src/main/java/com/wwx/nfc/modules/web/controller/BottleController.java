package com.wwx.nfc.modules.web.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wwx.nfc.modules.web.entity.BottleEntity;
import com.wwx.nfc.modules.web.service.BottleService;
import com.wwx.nfc.common.utils.PageUtils;
import com.wwx.nfc.common.utils.R;



/**
 * 
 *
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2018-03-28 14:11:16
 */
@RestController
@RequestMapping("web/bottle")
public class BottleController {
    @Autowired
    private BottleService bottleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("web:bottle:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bottleService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("web:bottle:info")
    public R info(@PathVariable("id") Long id){
        BottleEntity bottle = bottleService.selectById(id);
        return R.ok().put("bottle", bottle);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("web:bottle:save")
    public R save(@RequestBody BottleEntity bottle){
        bottleService.insert(bottle);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("web:bottle:update")
    public R update(@RequestBody BottleEntity bottle){
			bottleService.updateById(bottle);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("web:bottle:delete")
    public R delete(@RequestBody Long[] ids){
			bottleService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
