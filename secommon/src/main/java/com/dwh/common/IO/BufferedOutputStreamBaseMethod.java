package com.dwh.common.IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: Steven
 * @create: 2024-06-27 11:13
 * @Description: 向文件写入内容
 */
public class BufferedOutputStreamBaseMethod {
    public static void main(String[] args) throws IOException{
        write();
    }

    public static void write() throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\doc\\查询脚本.txt");

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        bufferedOutputStream.write(97);
        bufferedOutputStream.write(98);
        bufferedOutputStream.write(99);

        bufferedOutputStream.close();
    }
}
