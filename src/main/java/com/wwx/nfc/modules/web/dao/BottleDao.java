package com.wwx.nfc.modules.web.dao;

import com.wwx.nfc.modules.web.entity.BottleEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2018-03-28 14:11:16
 */
@Mapper
public interface BottleDao extends BaseMapper<BottleEntity> {

	BottleEntity queryByUserName(String nfcCode);
}
