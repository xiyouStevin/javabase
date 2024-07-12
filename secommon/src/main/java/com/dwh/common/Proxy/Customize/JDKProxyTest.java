package com.dwh.common.Proxy.Customize;

import java.lang.reflect.Proxy;

/**
 * @author: Steven
 * @create: 2024-07-12 17:51
 * @Description:
 */
public class JDKProxyTest {

    public static void main(String[] args){
        ICalculatorService proxy = (ICalculatorService)Proxy.newProxyInstance(ICalculatorService.class.getClassLoader(),
                new Class<?>[]{ICalculatorService.class},
                new LogInvocationHandler(new CalculatorService()));
        int add = proxy.add(1,3);
        System.err.println(add);
    }
}
