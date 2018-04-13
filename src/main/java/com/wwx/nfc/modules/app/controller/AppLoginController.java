package com.wwx.nfc.modules.app.controller;


import com.wwx.nfc.common.utils.R;
import com.wwx.nfc.common.validator.ValidatorUtils;
import com.wwx.nfc.modules.app.form.LoginForm;
import com.wwx.nfc.modules.app.service.UserService;
import com.wwx.nfc.modules.app.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * APP登录授权
 *
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/app")
public class AppLoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtUtils jwtUtils;

    /**
     * 登录
     */
    @PostMapping("login")
    public R login(@RequestBody LoginForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);

        //用户登录
        long userId = userService.login(form);

        //生成token
        String token = jwtUtils.generateToken(userId);

        Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        map.put("expire", jwtUtils.getExpire());

        return R.ok(map);
    }

}
