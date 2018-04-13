

package com.wwx.nfc.modules.sys.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wwx.nfc.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 * 
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2017-03-08 10:40:56
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
