package com.dwh.common.Proxy;

/**
 * @author: Steven
 * @create: 2024-07-12 16:43
 * @Description: 目标类
 */
public class UserManagerImpl implements UserManager{

    @Override
    public void addUser(String userId, String userName) {
        System.out.println("addUser");
    }
}
