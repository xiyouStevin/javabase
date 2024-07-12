package com.dwh.common.Reflex;

import com.dwh.common.Model.Reflex.Student;

/**
 * @author: Steven
 * @create: 2024-07-08 16:31
 * @Description:
 */
public class ReflexClassBaseMethod {

    public static void main(String[] args) throws ClassNotFoundException {
        Student student = new Student();
        //这种方法基本不用,与反射机制相悖，已经有Student还去反射Class类没有意义，多此一举
        getStudentClass(student);
        //方式简单，需要导包，不然会报错
        getStudentClass();
        //最为常见，调用Class.forName(String classForName)，参数是类路径，包名.类名
        getStudentClass("com.dwh.common.Model.Reflex.Student");

    }

    private static void getStudentClass(String classForName) throws ClassNotFoundException {
        Class stuClass = Class.forName(classForName);
        System.out.println("调用Class.forName静态方法获取");
        System.out.println(stuClass);
    }

    private static void getStudentClass(){
        Class stuClass = Student.class;
        System.out.println("调用Class静态属性获取");
        System.out.println(stuClass);
    }

    private static void getStudentClass(Object obj){
        Class stuClass = obj.getClass();
        System.out.println("直接通过类对象获取");
        System.out.println(stuClass);
        System.out.println(stuClass.getName());
    }
}
