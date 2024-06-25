package com.dwh.common.Throwable;

import java.util.Scanner;

/**
 * @author: Steven
 * @create: 2024-06-25 10:02
 * @Description: 异常
 */
public class ThrowableBaseMethod {

    public static void main(String[] args){

        String str = "abc";

        try {
            int i = Integer.parseInt(str);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("运行完毕");
        }

        System.out.println("--------------ArrayIndexOutOfBoundException------------");
        ArrayIndexOutOfBoundExceptionDemo();

        System.out.println("--------------NumberFormatException------------");
        NumberFormatExceptionDemo();

        System.out.println("--------------NullPointerException------------");
        NullPointerExceptionDemo();

        System.out.println("--------------InputMismatchException------------");
        InputMismatchExceptionDemo();

        System.out.println("--------------ClassCastException------------");
        ClassCastExceptionDemo();

        System.out.println("--------------ArithmeticException------------");
        ArithmeticExceptionDemo();
    }

    /**
     * ArrayIndexOutOfBoundException:用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引
     */
    public static void ArrayIndexOutOfBoundExceptionDemo(){
        int[] arr = new int[3];
        System.out.println(arr[3]);

        String str = "abc";
        System.out.println(str.charAt(3));
    }

    /**
     * NumberFormatException: 应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常。
     */
    public static void NumberFormatExceptionDemo(){
        String str = "abc";
        int a = Integer.parseInt(str);
    }

    /**
     * NullPointerException: 空指针异常
     */
    public static void NullPointerExceptionDemo(){
       int[] arr = null;
       System.out.println(arr[3]);
    }

    /**
     * InputMismatchException:输入不匹配异常，输入的值数据类型与设置的值数据类型不能匹配
     */
    public static void InputMismatchExceptionDemo(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
    }

    /**
     * ClassCastException:当试图将对象强制转换为不是实例的子类时，抛出该异常。
     */
    public static void ClassCastExceptionDemo(){
        Object obj = new Double(1);
        String str = (String) obj;
    }

    /**
     * ArithmeticException：整数除以零的异常
     */
    public static void ArithmeticExceptionDemo(){
        int a = 10;
        int b = 0;
        int c = a / b;
    }
}
