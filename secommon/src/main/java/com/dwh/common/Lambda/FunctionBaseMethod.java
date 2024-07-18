package com.dwh.common.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author: Steven
 * @create: 2024-07-18 11:00
 * @Description: 函数式编程
 */
public class FunctionBaseMethod {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("输出所有数据:");
        eval(list, p->true);
        System.out.println("输出所有偶数:");
        eval(list, p-> p % 2 == 0);
        System.out.println("输出大于 3 的所有数字:");
        eval(list, p-> p >3);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate){
        list.forEach(p->{
           if(predicate.test(p)){
               System.out.println( p + "");
           }
        });
    }
}
