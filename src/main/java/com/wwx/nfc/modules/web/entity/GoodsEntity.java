package com.wwx.nfc.modules.web.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;

import java.io.Serializable;
import java.util.Date;

/**
 * 货物表
 * 
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2018-04-10 11:08:32
 */
@TableName("tb_goods")
public class GoodsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 品名
	 */
	private String goodsName;
	/**
	 * 产品类型
	 */
	private String goodsType;
	/**
	 * 详情
	 */
	private String details;
	/**
	 * 容量
	 */
	private Integer volume;
	/**
	 * 度数
	 */
	private Integer proof;
	/**
	 * 生产日期
	 */
	private String productionDate;
	/**
	 * 状态
	 */
	@TableLogic
	private Integer status;
	/**
	 * 创建人ID
	 */
	@TableField(fill = FieldFill.INSERT)
	private Long createUserId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 生产批次号
	 */
	private String batch;
	/**
	 * NFC数量
	 */
	private Integer indexes;
	/**
	 * 客商名称
	 */
	private String company;
	/**
	 * 产地
	 */
	private String place;
	/**
	 * 包装规格
	 */
	private String packing;

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
	 * 设置：品名
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * 获取：品名
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * 设置：产品类型
	 */
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	/**
	 * 获取：产品类型
	 */
	public String getGoodsType() {
		return goodsType;
	}
	/**
	 * 设置：详情
	 */
	public void setDetails(String details) {
		this.details = details;
	}
	/**
	 * 获取：详情
	 */
	public String getDetails() {
		return details;
	}
	/**
	 * 设置：容量
	 */
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	/**
	 * 获取：容量
	 */
	public Integer getVolume() {
		return volume;
	}
	/**
	 * 设置：度数
	 */
	public void setProof(Integer proof) {
		this.proof = proof;
	}
	/**
	 * 获取：度数
	 */
	public Integer getProof() {
		return proof;
	}
	/**
	 * 设置：生产日期
	 */
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	/**
	 * 获取：生产日期
	 */
	public String getProductionDate() {
		return productionDate;
	}
	/**
	 * 设置：状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：创建人ID
	 */
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	/**
	 * 获取：创建人ID
	 */
	public Long getCreateUserId() {
		return createUserId;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
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
	/**
	 * 设置：NFC数量
	 */
	public void setIndexes(Integer indexes) {
		this.indexes = indexes;
	}
	/**
	 * 获取：NFC数量
	 */
	public Integer getIndexes() {
		return indexes;
	}
	/**
	 * 设置：客商名称
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * 获取：客商名称
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * 设置：产地
	 */
	public void setPlace(String place) {
		this.place = place;
	}
	/**
	 * 获取：产地
	 */
	public String getPlace() {
		return place;
	}
	/**
	 * 设置：包装规格
	 */
	public void setPacking(String packing) {
		this.packing = packing;
	}
	/**
	 * 获取：包装规格
	 */
	public String getPacking() {
		return packing;
	}
}
