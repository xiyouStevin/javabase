package com.dwh.common.Customize;

/**
 * @author: Steven
 * @create: 2024-07-17 16:10
 * @Description: 注解必须和使用的为同一路径
 */
public class User {

    @MyCustomizeAnnotate(description="主键Id",length=36)
    private String id;

    @MyCustomizeAnnotate(description="用户账户",length=50)
    private String userAccount;

    @MyCustomizeAnnotate(description="用户名",length=100)
    private String userName;

    @MyCustomizeAnnotate(description="密码",length=200)
    private String password;
}
