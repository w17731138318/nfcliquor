package com.wwx.nfc.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.wwx.nfc.common.utils.R;
import com.wwx.nfc.modules.sys.entity.SysUserTokenEntity;

/**
 * 用户Token
 * 
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2017-03-23 15:22:07
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}
