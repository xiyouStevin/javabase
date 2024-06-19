package com.dwh.common.Object;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Steven
 * @create: 2024-06-19 14:54
 * @Description: notify()：用于唤醒一个在此对象监听器上等待的线程；
 *                  如果所有的线程都在此对象上等待，那么只会随机选择一个线程，并在对实现做出决定时发生
 *                  一个线程在对象监视器上等待可以调用wait()方法
 *                  notify()方法只能被作为此对象监视器的所有者的线程来调用。
 *                  一个线程想要成为对象监视器的所有者，有一下三种方法：
 *                  一、执行对象的同步实例方法
 *                  二、使用synchronized内置锁
 *                  三、对于class类型的对象，执行同步静态方法
 *                  如果当前线程不是此对象监视器的所有者的话会抛出IllegalMonitorStateException异常
 *               notifyAll():用于唤醒在该对象上等待的所有线程；他和notify()方法一样，区别在于notifyAll()方法唤醒再次对象监听器上等待的所有线程；。报错信息同上
 *               wait():让当前线程进入等待状态，直到其他线程调用此对象的notify()方法或notifyAll()方法。报错信息同上
 *               wait(long timeout):让当前线程处于等待状态，到其他线程调用此对象的notify()方法或notifyAll()方法。或者超过参数timeout设置的超过时间
 *               wait(long timeout,int nanos):与上面方法类似，多了一个nanos参数，表示额外时间也就是说在timeout时间超过后还得加上nanos的时间，值是纳秒
 */
public class ObjectNotifyMethod {

    private List syncedList;

    public ObjectNotifyMethod(){
        //创建一个同步列表
        syncedList = Collections.synchronizedList(new LinkedList<>());
    }

    /**
     * 删除列表中的元素
     * @return
     * @throws InterruptedException
     */
    public String removeElement() throws InterruptedException{
        synchronized (syncedList){

            //列表为空就等待
            while (syncedList.isEmpty()){
                System.out.println("列表是否为空");
                syncedList.wait();
                System.out.println("等待");
            }
            String element = (String) syncedList.remove(0);

            return element;
        }
    }

    /**
     * 添加元素到列表
     */
    public void addElement(String element){
        System.out.println("开始");

        synchronized (syncedList){
            syncedList.add(element);
            System.out.println("新增元素：" + element);

            syncedList.notify();
            System.out.println("通知所有");
        }
        System.out.println("关闭");
    }

    public static void main(String[] args){
        final ObjectNotifyMethod notifyMethod = new ObjectNotifyMethod();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                try{
                    String item = notifyMethod.removeElement();
                    System.out.println(" " + item);
                }catch (Exception e){
                    System.out.println("错误");
                }
            }
        };

        Runnable runTest = new Runnable() {
            @Override
            public void run() {
                notifyMethod.addElement("你好");
            }
        };

        try{
            Thread thread = new Thread(run,"Google");
            thread.start();

            Thread.sleep(500);

            Thread threadTwo = new Thread(run,"Edge");
            threadTwo.start();

            Thread.sleep(500);

            Thread threadTest = new Thread(runTest,"FirFix");
            threadTest.start();

            Thread.sleep(500);

            thread.interrupt();
            threadTwo.interrupt();

        }catch (InterruptedException e){

        }
    }
}
