package com.dwh.common.Reflex;

import com.dwh.common.Model.Reflex.Student;

import java.lang.reflect.Method;

/**
 * @author: Steven
 * @create: 2024-07-12 10:48
 * @Description:
 */
public class ReflexClassMeansBaseMethod {

    public static void main(String[] args) throws Exception {
        Class stuClass = Class.forName("com.dwh.common.Model.Reflex.Student");

        //获取所有公共的方法（包含父类的方法）
        Method[] methods = stuClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-----------获取该类中所有方法---------------");
        //获取该类中的所有方法，以数组返回
        Method[] methodList = stuClass.getDeclaredMethods();
        for (Method method : methodList) {
            System.out.println(method);
        }

        System.out.println("-----------获取特定的共有方法---------------");
        Method publicMethod = stuClass.getMethod("getStudentUserSexInfo",String.class,Boolean.class);
        System.out.println(publicMethod);

        System.out.println("-----------获取特定的方法可以是私有的---------------");
        Method method = stuClass.getDeclaredMethod("getStudentUserAge",Integer.class);
        System.out.println(method);

        System.out.println("-----------获取私有的并执行---------------");
        Object obj = stuClass.getConstructor().newInstance();
        method.setAccessible(true);
        Object result = method.invoke(obj,20);
        System.out.println(result);

        System.out.println("-----------调用主方法---------------");
        Method mainMethod = stuClass.getMethod("main", String[].class);
        Object object = mainMethod.invoke(null,(Object)new String[]{"a","b","c"});
        System.out.println(object);
    }
}
