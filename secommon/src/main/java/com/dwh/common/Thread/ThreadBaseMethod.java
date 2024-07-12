package com.dwh.common.Thread;

/**
 * @author: Steven
 * @create: 2024-07-01 15:58
 * @Description:
 */
public class ThreadBaseMethod extends Thread{

    public static void main(String[] args){
        new ThreadBaseMethod().start();
    }

    public void run(){
        System.out.println("我是一个Thread");
    }

}
