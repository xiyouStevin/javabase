package com.dwh.common.Reflex;

import com.dwh.common.Model.Reflex.Student;

import java.lang.reflect.Constructor;

/**
 * @author: Steven
 * @create: 2024-07-08 17:01
 * @Description:
 */
public class ReflexClassConstructorBaseMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //最为常见，调用Class.forName(String classForName)，参数是类路径，包名.类名
        Class stuClass = Class.forName("com.dwh.common.Model.Reflex.Student");

        getClassDeclaredConstructors(stuClass);

        getStudentConstructors(stuClass);

        getStudentTypeConstructors(stuClass);

        getStudentTypeDeclaredConstructors(stuClass);
    }
    public static void getStudentTypeDeclaredConstructors(Class stuClass) throws NoSuchMethodException {
        System.out.println("----------getDeclaredConstructors----------");
        Constructor constructor = stuClass.getDeclaredConstructor(Integer.class);
        System.out.println("Integrate构造：" + constructor);
        Constructor constructorStrAndInt = stuClass.getDeclaredConstructor(String.class,Integer.class,Boolean.class);
        System.out.println("String和Integer、Boolean构造：" + constructorStrAndInt);
    }

    public static void getStudentTypeConstructors(Class stuClass) throws NoSuchMethodException {
        System.out.println("----------getConstructors----------");
        Constructor constructor = stuClass.getConstructor(null);
        System.out.println("无参构造：" + constructor);
        Constructor constructorStrAndInt = stuClass.getConstructor(String.class,Integer.class);
        System.out.println("String和Integer构造：" + constructorStrAndInt);
    }

    public static void getStudentConstructors(Class stuClass){
        System.out.println("----------getConstructors----------");
        Constructor[] constructors = stuClass.getConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor);
        }
    }

    private static void getClassDeclaredConstructors(Class stuClass) throws ClassNotFoundException {
        System.out.println("----------getDeclaredConstructors----------");
        Constructor[] constructors = stuClass.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor);
        }
    }

}
