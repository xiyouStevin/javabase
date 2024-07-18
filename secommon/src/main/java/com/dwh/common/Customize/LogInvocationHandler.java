package com.dwh.common.Customize;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: Steven
 * @create: 2024-07-12 17:44
 * @Description:在invoke()方法中，编写代理逻辑，如前置处理、方法调用、后置处理等：
 */
public class LogInvocationHandler implements InvocationHandler {

    private Object target;

    public LogInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("Calling method:" + method.getName());
        //方法调用前的日志记录或其他操作
        long start = System.currentTimeMillis();
        //调用目标方法
        Object result = method.invoke(target,args);
        //方法调用后的日志记录或其他操作
        long duration = System.currentTimeMillis() - start;
        System.err.println("Method " +method.getName()+ "  executed in "+duration);
        return result;
    }
}
