

package com.wwx.nfc.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wwx.nfc.modules.sys.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @email w17731138318@126.com
 * @since 3.1.0 2018-02-10
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
