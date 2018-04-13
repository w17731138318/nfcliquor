package com.wwx.nfc.modules.app.controller;


import com.wwx.nfc.common.utils.R;
import com.wwx.nfc.common.validator.ValidatorUtils;
import com.wwx.nfc.modules.app.entity.UserEntity;
import com.wwx.nfc.modules.app.form.RegisterForm;
import com.wwx.nfc.modules.app.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 注册
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2017-03-26 17:27
 */
@RestController
@RequestMapping("/app")
public class AppRegisterController {
    @Autowired
    private UserService userService;

    @PostMapping("register")
    public R register(@RequestBody RegisterForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);

        UserEntity user = new UserEntity();
        user.setMobile(form.getMobile());
        user.setUsername(form.getMobile());
        user.setPassword(DigestUtils.sha256Hex(form.getPassword()));
        user.setCreateTime(new Date());
        userService.insert(user);

        return R.ok();
    }
}
