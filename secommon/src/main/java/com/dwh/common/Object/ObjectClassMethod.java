package com.dwh.common.Object;

/**
 * @author: Steven
 * @create: 2024-06-19 14:47
 * @Description: getClass():用于获取对象运行时的对象的类型
 */
public class ObjectClassMethod {

    public static void main(String[] args){
        ObjectClassMethod classMethod = new ObjectClassMethod();
        System.out.println("classMethod 的类型为" + classMethod.getClass());
        String str = new String();
        System.out.println("str 的类型为" + str.getClass());
    }
}
