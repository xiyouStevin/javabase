package com.dwh.common.Customize;

import java.lang.annotation.*;

/**
 * @author: Steven
 * @create: 2024-07-17 16:04
 * @Description: 自定义注解
 */
@Target(ElementType.FIELD) //注解运用到字段上
@Retention(RetentionPolicy.RUNTIME) //保留到运行时，通过注解获取
public @interface MyCustomizeAnnotate {
    String description();
    int length();
}
