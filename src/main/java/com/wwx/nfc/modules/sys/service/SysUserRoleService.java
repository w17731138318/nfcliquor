package com.wwx.nfc.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.wwx.nfc.modules.sys.entity.SysUserRoleEntity;

import java.util.List;



/**
 * 用户与角色对应关系
 * 
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2016年9月18日 上午9:43:24
 */
public interface SysUserRoleService extends IService<SysUserRoleEntity> {
	
	void saveOrUpdate(Long userId, List<Long> roleIdList);
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
