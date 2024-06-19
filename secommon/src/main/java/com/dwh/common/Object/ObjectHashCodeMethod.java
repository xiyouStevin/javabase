package com.dwh.common.Object;

/**
 * @author: Steven
 * @create: 2024-06-19 14:50
 * @Description: hashCode():获取对象的hash值
 */
public class ObjectHashCodeMethod {

    public static void main(String[] args){
        ObjectHashCodeMethod hashCodeMethod = new ObjectHashCodeMethod();
        System.out.println("hashCodeMethod hashCode:" + hashCodeMethod.hashCode());

        //如果两个对象相等，那么他们的哈希值也是相等的
        ObjectHashCodeMethod hashCodeMethodTest = hashCodeMethod;
        System.out.println("hashCodeMethodTest hashCode:" + hashCodeMethodTest.hashCode());

        String str = new String();
        System.out.println("str hashCode:" + str.hashCode());



    }
}
