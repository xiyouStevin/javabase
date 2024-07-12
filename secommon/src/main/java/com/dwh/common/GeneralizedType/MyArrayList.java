package com.dwh.common.GeneralizedType;

/**
 * @author: Steven
 * @create: 2024-07-12 15:17
 * @Description:
 */
public class MyArrayList implements MyList<String>{

    Object[] object = new Object[10];

    int size;

    @Override
    public boolean add(String item) {
        object[size] = item;
        size++;
        return true;
    }
}
