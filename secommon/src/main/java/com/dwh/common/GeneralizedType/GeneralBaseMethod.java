package com.dwh.common.GeneralizedType;

import java.util.ArrayList;

/**
 * @author: Steven
 * @create: 2024-07-12 15:04
 * @Description: 泛型方法
 */
public class GeneralBaseMethod {

    public GeneralBaseMethod(){

    }

    public static<T> void addAll(ArrayList<T> list , T t1, T t2, T t3) {
        list.add(t1);
        list.add(t2);
        list.add(t3);
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        GeneralBaseMethod.addAll(list,"张三","李四","王五");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        GeneralBaseMethod.addAll(list1,1,12,23);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
