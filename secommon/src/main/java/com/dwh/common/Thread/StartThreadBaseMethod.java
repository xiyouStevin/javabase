package com.dwh.common.Thread;

/**
 * @author: Steven
 * @create: 2024-07-01 16:23
 * @Description:
 */
public class StartThreadBaseMethod {

    public static void main(String[] args){
        Runnable runnable = ()->{
            System.out.println(Thread.currentThread().getName());
        };
        runnable.run();

        new Thread(runnable).start();
    }
}
