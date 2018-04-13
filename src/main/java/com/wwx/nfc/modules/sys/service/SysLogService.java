

package com.wwx.nfc.modules.sys.service;


import com.baomidou.mybatisplus.service.IService;
import com.wwx.nfc.common.utils.PageUtils;
import com.wwx.nfc.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 * 
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2017-03-08 10:40:56
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
