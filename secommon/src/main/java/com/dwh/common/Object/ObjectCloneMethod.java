package com.dwh.common.Object;

/**
 * @author: Steven
 * @create: 2024-06-19 14:33
 * @Description: clone():创建并返回一个对象的拷贝;这个是浅拷贝，对象内属性引用的对象只会拷贝引用地址，
 *                      而不会将引用的对象重新分配内存，相对应的深拷贝则会连引用的对象也重新创建。
 */
public class ObjectCloneMethod implements Cloneable{
    String name;
    int likes;

    public static void main(String[] args){
        ObjectCloneMethod obj = new ObjectCloneMethod();
        obj.name = "ObjectCommonMethod对象";
        obj.likes = 1916;

        System.out.println(obj.name);
        System.out.println(obj.likes);

        try {
            ObjectCloneMethod objTest = (ObjectCloneMethod)obj.clone();
            System.out.println(objTest.name);
            System.out.println(objTest.likes);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
