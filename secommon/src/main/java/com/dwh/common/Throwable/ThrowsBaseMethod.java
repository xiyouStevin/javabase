package com.dwh.common.Throwable;

import java.io.FileNotFoundException;

/**
 * @author: Steven
 * @create: 2024-06-25 10:25
 * @Description: Throws
 */
public class ThrowsBaseMethod {
    public static void main(String[] args) {
        try {
            //手动抛出异常
            ThrowsBaseMethod throwable = new ThrowsBaseMethod();
            throwable.setAgeTest();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void setAge(int age) throws FileNotFoundException {
        if(age < 0){
            throw new FileNotFoundException("输入的年龄不能小于零");
        }
    }

    public void setAgeTest() throws FileNotFoundException {
        setAge(-2);
    }
}
