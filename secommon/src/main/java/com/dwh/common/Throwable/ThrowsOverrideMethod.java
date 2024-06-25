package com.dwh.common.Throwable;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author: Steven
 * @create: 2024-06-25 10:32
 * @Description: 重写异常
 */
public class ThrowsOverrideMethod {

    public static void main(String[] args){
        ThrowsOverrideMethod overrideMethod = new ThrowsOverrideMethod();
        overrideMethod.display(new SubClass());
    }

    public void display(SuperClass s){
        try{
            s.method();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

class SuperClass{
    public void method()throws IOException{
        System.out.println("super");
    }
}
class SubClass extends SuperClass{
    public void method()throws FileNotFoundException {
        System.out.println("sub");
    }
}
