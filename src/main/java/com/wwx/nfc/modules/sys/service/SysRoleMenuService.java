package com.wwx.nfc.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.wwx.nfc.modules.sys.entity.SysRoleMenuEntity;

import java.util.List;



/**
 * 角色与菜单对应关系
 * 
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2016年9月18日 上午9:42:30
 */
public interface SysRoleMenuService extends IService<SysRoleMenuEntity> {
	
	void saveOrUpdate(Long roleId, List<Long> menuIdList);
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
	
}
