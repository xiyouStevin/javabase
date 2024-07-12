package com.dwh.common.Reflex;

import java.lang.reflect.Method;

/**
 * @author: Steven
 * @create: 2024-07-12 11:36
 * @Description:
 */
public class InvokeBaseMethod {

        public static void main(String[] args) throws Exception {

            Class classType = InvokeBaseMethod.class;
            Object invokeBaseMethod = classType.getConstructor().newInstance();

            //获取Method类对象
            Method m = classType.getMethod("add", new Class[] {int.class,int.class});

            /**
             * Method的invoke(Object obj,Object[] args) 该方法接收的参数必须为对象
             * 如果参数为基本数据类型,使用相应的包装类对象 返回的结果总是一个对象(其结果代表调用该方法后的返回值)
             */
            //如果add方法是静态方法，那么可以这样写：Object object = m.invoke(null, new Integer(10), new Integer(20));
            Object object = m.invoke(invokeBaseMethod,10, 20);
            System.out.println(object);
        }

        public int add(int param1,int param2) {
            return param1+param2;
        }

}
