package com.wwx.nfc.modules.web.controller;

import java.util.Arrays;
import java.util.Map;

import com.wwx.nfc.modules.web.entity.GoodsEntity;
import com.wwx.nfc.modules.web.service.GoodsService;
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
public class NfcController {
	@Autowired
	private BottleService bottleService;
	@Autowired
	private GoodsService goodsService;
	/**
	 * 信息By nfc
	 */
	@RequestMapping("/nfc/{nfcCode}")
	public R nfc(@PathVariable("nfcCode") String nfcCode){
		BottleEntity bottle = bottleService.selectByNfcCode(nfcCode);
		GoodsEntity goods = goodsService.selectById(bottle.getGoodsId());
		return R.ok().put("bottle", bottle).put("goods", goods);
	}

}
