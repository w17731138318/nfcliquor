

package com.wwx.nfc.modules.app.form;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 注册表单
 *
 * @email w17731138318@126.com
 * @since 3.1.0 2018-01-25
 */
public class RegisterForm {
    @NotBlank(message="手机号不能为空")
    private String mobile;

    @NotBlank(message="密码不能为空")
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
