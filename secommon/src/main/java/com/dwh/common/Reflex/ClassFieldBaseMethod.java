package com.dwh.common.Reflex;

import java.lang.reflect.Field;

/**
 * @author: Steven
 * @create: 2024-07-08 17:57
 * @Description:
 */
public class ClassFieldBaseMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class stuClass = Class.forName("com.dwh.common.Model.Reflex.Student");

        Field[] fields = stuClass.getFields();
        //获取Student中所有的public字段
        for (Field field : fields) {
            System.out.println(field);
        }
        //获取公共的特定字段
        Field fieldSex = stuClass.getField("sex");
        System.out.println(fieldSex);

        //获取特定字段
        Field fieldName = stuClass.getDeclaredField("name");
        System.out.println(fieldName);
    }
}
