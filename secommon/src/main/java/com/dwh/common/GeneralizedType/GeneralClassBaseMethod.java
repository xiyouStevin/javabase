package com.dwh.common.GeneralizedType;

import com.dwh.common.Model.GeneralizedType.MyArrayList;

/**
 * @author: Steven
 * @create: 2024-07-12 14:52
 * @Description:泛型类
 */
public class GeneralClassBaseMethod {
    public static void main(String[] args){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("张三");
        System.out.println(list);
    }
}
