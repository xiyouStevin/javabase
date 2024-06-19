package com.dwh.common.Object;

import java.util.GregorianCalendar;

/**
 * @author: Steven
 * @create: 2024-06-19 14:39
 * @Description: finalize():用户实例被垃圾回收器回收的时候触发的操作;当GC确定不存在对该对象有更多的引用时，对象的垃圾回收器就会调用这个方法
 */
public class ObjectFinalizeMethod extends GregorianCalendar {

    public static  void main(String[] args){
        try {

            ObjectFinalizeMethod finalizeMethod = new ObjectFinalizeMethod();
            System.out.println("" + finalizeMethod.getTime());

            System.out.println("确定。。");
            finalizeMethod.finalize();
            System.out.println("确定！");
        }catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
