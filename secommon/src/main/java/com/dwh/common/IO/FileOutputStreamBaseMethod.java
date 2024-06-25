package com.dwh.common.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: Steven
 * @create: 2024-06-25 14:50
 * @Description: 使用FileOutputStream往D盘下面hello.txt里面输入hello world
 */
public class FileOutputStreamBaseMethod {
    public static void main(String[] args) throws IOException {
        //根据文件夹的名字来创建对象
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\hello.txt");
        //插入字符
        fileOutputStream.write('h');
        fileOutputStream.write('e');
        fileOutputStream.write('l');
        fileOutputStream.write('l');
        fileOutputStream.write('o');
        String str = " world";
        //往文件夹中的字节叔叔写入文件
        fileOutputStream.write(str.getBytes());
        fileOutputStream.close();

        //传文件夹的名字来创建对象
        FileInputStream fileInputStream = new FileInputStream("D:\\hello.txt");
        int by = 0;
        //一个一个字节读取数据
        while ((by = fileInputStream.read()) != -1){
            System.out.println(by);
        }
        //关闭流
        fileInputStream.close();
        //通过file对象来创建对象
        fileOutputStream = new FileOutputStream(new File("D:\\hello.txt"));
        byte[] bytes = new byte[10];
        while ((by = fileInputStream.read()) != -1){
            for (int i = 0 ; i < by; i++) {
                System.out.println(bytes[i]);
            }
        }
        fileInputStream.close();
    }
}
