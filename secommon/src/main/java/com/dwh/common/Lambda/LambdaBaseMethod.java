package com.dwh.common.Lambda;

import java.lang.reflect.Field;

/**
 * @author: Steven
 * @create: 2024-07-17 18:08
 * @Description:
 */
public class LambdaBaseMethod {
    public static void main(String[] args){
        //带有类型声明的表达式
        MathOperation add = (a,b) -> a + b;

        //没有类型声明的表达式
        MathOperation sub = (a,b) -> a - b;

        //带有大括号，带有返回语句的表达式
        MathOperation mul = (int a,int b) -> { return a * b; };

        //没有大括号和返回语句的表达式
        MathOperation div = (int a, int b) -> a / b;

        System.out.println(" 10 + 5 = " + operator(10,5,add));
        System.out.println(" 10 - 5 = " + operator(10,5,sub));
        System.out.println(" 10 * 5 = " + operator(10,5,mul));
        System.out.println(" 10 / 5 = " + operator(10,5,div));

    }

    private static int operator(int a, int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
