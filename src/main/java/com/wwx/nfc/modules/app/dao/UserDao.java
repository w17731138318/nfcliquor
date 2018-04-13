

package com.wwx.nfc.modules.app.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wwx.nfc.modules.app.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * 
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2017-03-23 15:22:06
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
