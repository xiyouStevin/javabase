package com.dwh.common.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: Steven
 * @create: 2024-06-27 10:37
 * @Description: 字节缓冲输入流
 */
public class BufferedInputStreamBaseMethod {

    public static void main(String[] args) throws IOException{
        read();
    }

    public static void read() throws IOException {
        //创建一个文件字节输入流FieInputStream
        FileInputStream fileInputStream  = new FileInputStream("D:\\doc\\查询脚本.txt");
        //创建一个缓冲输入流BufferedInputStream实例，底层输入流使用FileInputStream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        System.out.println(bufferedInputStream.read());
        bufferedInputStream.close();
    }
}
