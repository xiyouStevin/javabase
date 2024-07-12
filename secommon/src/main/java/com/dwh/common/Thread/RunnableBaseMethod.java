package com.dwh.common.Thread;

/**
 * @author: Steven
 * @create: 2024-07-01 15:56
 * @Description:
 */
public class RunnableBaseMethod implements Runnable{

    public static void main(String[] args){
        new Thread(new RunnableBaseMethod()).start();
    }


    @Override
    public void run() {
        System.out.println("我是一个Runnable");
    }
}
