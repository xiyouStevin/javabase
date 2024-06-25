package com.dwh.common.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author: Steven
 * @create: 2024-06-25 15:23
 * @Description: ByteArrayInputStream基础使用方法
 */
public class ByteArrayInputStreamBaseMethod {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write('h');
        byteArrayOutputStream.write('e');
        byteArrayOutputStream.write('l');
        byteArrayOutputStream.write('l');
        byteArrayOutputStream.write('o');

        //一个字节数组的写入数据
        byteArrayOutputStream.write(" world".getBytes());

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        //从这个流中读取数据
        int b = 0;
        while ((b = byteArrayInputStream.read()) != -1){
            System.out.println(b);
        }
        byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        byte[] bs = new byte[10];
        //从这个流中一次性读取bs.length的数据
        while ((b = byteArrayInputStream.read(bs)) != -1) {
            for (int i = 0; i < b; i++) {
                System.out.print((char) bs[i]);
            }
            System.out.println();
        }
    }
}
