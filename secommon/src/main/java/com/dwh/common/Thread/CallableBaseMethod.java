package com.dwh.common.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author: Steven
 * @create: 2024-07-01 16:10
 * @Description:
 */
public class CallableBaseMethod implements Callable<Integer> {

    public static void main(String[] args) throws Exception {
        CallableBaseMethod callableBaseMethod = new CallableBaseMethod();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callableBaseMethod);

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "循环变量i的值:" + i);
            if (i == 20){
                new Thread(futureTask,"有返回值的线程").start();
            }
        }

        System.out.println("子线程的返回值"  + futureTask.get());
    }

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (i = 0 ; i < 100 ; i++){
            System.out.println(Thread.currentThread().getName() + "循环变量i的value:" + i);
        }
        return i;
    }
}
