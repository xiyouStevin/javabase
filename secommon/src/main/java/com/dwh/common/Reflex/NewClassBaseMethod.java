package com.dwh.common.Reflex;

import com.dwh.common.Model.Reflex.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/**
 * @author: Steven
 * @create: 2024-07-08 17:27
 * @Description:
 */
public class NewClassBaseMethod {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class stuClass = Class.forName("com.dwh.common.Model.Reflex.Student");
        Constructor constructorStrAndInt = stuClass.getDeclaredConstructor(String.class,Integer.class,Boolean.class);
        constructorStrAndInt.setAccessible(true);
        Object obj = constructorStrAndInt.newInstance("郭龙",17,true);
        Student student = (Student) obj;
        if(!Objects.isNull(student.getSex())) {
            String isSex = student.getSex() ? "是" : "否";
            System.out.println("学生：" + student.getName() + "年龄：" + student.getAge().toString() + "是否为男性：" + isSex);
        }
    }
}
