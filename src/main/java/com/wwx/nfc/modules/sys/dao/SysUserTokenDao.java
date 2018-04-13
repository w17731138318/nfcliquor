package com.wwx.nfc.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wwx.nfc.modules.sys.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 * 
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2017-03-23 15:22:07
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);
	
}
