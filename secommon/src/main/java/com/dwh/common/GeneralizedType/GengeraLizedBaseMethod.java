package com.dwh.common.GeneralizedType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Steven
 * @create: 2024-07-12 14:23
 * @Description:
 */
public class GengeraLizedBaseMethod {

    public static void main(String[] args){

        List<String> stringArrayList = new ArrayList<>();
        List<Integer> integerArrayList = new ArrayList<>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if(classIntegerArrayList.equals(classStringArrayList)){
            System.out.println("类型相同");
        }
    }
}
