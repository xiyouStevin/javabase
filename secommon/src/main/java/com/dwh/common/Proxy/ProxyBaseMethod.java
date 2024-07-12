package com.dwh.common.Proxy;

/**
 * @author: Steven
 * @create: 2024-07-12 16:43
 * @Description:
 */
public class ProxyBaseMethod {

    public static void main(String[] args){
        LogHandler logHandler = new LogHandler();
        UserManager userManager = (UserManager) logHandler.newProxyInstance(new UserManagerImpl());
        userManager.addUser("0001","张三");

    }
}
