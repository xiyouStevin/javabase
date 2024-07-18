package com.dwh.common.Customize;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @author: Steven
 * @create: 2024-07-17 16:25
 * @Description:
 */
public class testMyCustomizeAnnotate {

    public static void main(String[] args){
        //反射获取类
        Class userClass = User.class;

        //获取所有字段
        Field[] fields = userClass.getDeclaredFields();
        for (Field field:fields){
            if(field.isAnnotationPresent(MyCustomizeAnnotate.class)){
                MyCustomizeAnnotate myCustomizeAnnotate = field.getAnnotation(MyCustomizeAnnotate.class);
                System.out.println("字段:[" + field.getName() + "],描述：【"+ myCustomizeAnnotate.description() + "】" );
            }
        }
    }
}
