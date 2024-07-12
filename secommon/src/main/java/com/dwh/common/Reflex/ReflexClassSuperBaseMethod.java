package com.dwh.common.Reflex;

/**
 * @author: Steven
 * @create: 2024-07-12 11:41
 * @Description:
 */
public class ReflexClassSuperBaseMethod {

    public static void main(String[] args){
        System.out.println("-------------获取继承-----------");
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());
        System.out.println("-------------获取当前类直接实现的接口，不包含父类实现的接口类型-----------");
        Class[] is = i.getInterfaces();
        for (Class item : is){
            System.out.println(item);
        }
    }
}
