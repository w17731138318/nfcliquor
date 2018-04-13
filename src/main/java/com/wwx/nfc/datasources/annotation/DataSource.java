package com.wwx.nfc.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 * @author 王伟鑫
 * @email w17731138318@126.com
 * @date 2017/9/16 22:16
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
