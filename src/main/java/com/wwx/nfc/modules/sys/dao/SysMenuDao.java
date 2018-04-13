

package com.wwx.nfc.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wwx.nfc.modules.sys.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 菜单管理
 * 
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2016年9月18日 上午9:33:01
 */
@Mapper
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {
	
	/**
	 * 根据父菜单，查询子菜单
	 * @param parentId 父菜单ID
	 */
	List<SysMenuEntity> queryListParentId(Long parentId);
	
	/**
	 * 获取不包含按钮的菜单列表
	 */
	List<SysMenuEntity> queryNotButtonList();

}
