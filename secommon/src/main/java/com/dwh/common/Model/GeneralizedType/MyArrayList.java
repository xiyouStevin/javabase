package com.dwh.common.Model.GeneralizedType;

/**
 * @author: Steven
 * @create: 2024-07-12 14:56
 * @Description: 泛型类
 */
public class MyArrayList<T> {
    Object[] obj = new Object[10];

    int size;

    public boolean add(T t){
        obj[size++] = t;
        size ++ ;
        return true;
    }

    public T get(int index){
        return (T)obj[index];
    }
}
