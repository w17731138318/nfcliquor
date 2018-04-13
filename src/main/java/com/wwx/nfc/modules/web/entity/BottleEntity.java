package com.wwx.nfc.modules.web.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.wwx.nfc.common.utils.WebUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2018-03-28 14:11:16
 */
@TableName("tb_bottle")
public class BottleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 本批次物品信息ID
	 */
	private Long goodsId;
	/**
	 * NFC编码
	 */
	private String nfcCode;
	/**
	 * 鉴定次数
	 */
	@TableField(update = "%s+1")
	private Integer checks;
	/**
	 * 最后鉴定时间
	 */
	@TableField(fill = FieldFill.UPDATE)
	private Date lastCheckTime;
	/**
	 * 生产批次号
	 */
	private String batch;

	public BottleEntity() {
	}

	public BottleEntity(Long goodsId, String batch) {
		this.goodsId = goodsId;
		this.checks = 0;
		this.batch = batch;
	}
	public BottleEntity nfcCode(){
		this.nfcCode = WebUtils.uuid();
		return this;
	}
	/**
	 * 设置：ID
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：ID
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：本批次物品信息ID
	 */
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * 获取：本批次物品信息ID
	 */
	public Long getGoodsId() {
		return goodsId;
	}
	/**
	 * 设置：NFC编码
	 */
	public void setNfcCode(String nfcCode) {
		this.nfcCode = nfcCode;
	}
	/**
	 * 获取：NFC编码
	 */
	public String getNfcCode() {
		return nfcCode;
	}
	/**
	 * 设置：鉴定次数
	 */
	public void setChecks(Integer checks) {
		this.checks = checks;
	}
	/**
	 * 获取：鉴定次数
	 */
	public Integer getChecks() {
		return checks;
	}
	/**
	 * 设置：最后鉴定时间
	 */
	public void setLastCheckTime(Date lastCheckTime) {
		this.lastCheckTime = lastCheckTime;
	}
	/**
	 * 获取：最后鉴定时间
	 */
	public Date getLastCheckTime() {
		return lastCheckTime;
	}
	/**
	 * 设置：生产批次号
	 */
	public void setBatch(String batch) {
		this.batch = batch;
	}
	/**
	 * 获取：生产批次号
	 */
	public String getBatch() {
		return batch;
	}
}
