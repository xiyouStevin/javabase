package com.dwh.common.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: Steven
 * @create: 2024-06-27 11:23
 * @Description: 输入输出
 */
public class FileReaderBaseMethod {

    public static void main(String[] args) throws IOException,ClassNotFoundException,IllegalAccessException {
        FileWriter fileWriter = new FileWriter("D:\\doc\\hello.txt");

        fileWriter.write("hello ");
        fileWriter.write("world java");

        //把流中的数据刷新到文件中，还能继续使用；如果没有 刷新，也没有关闭流的话，数据是不会写入文件的
        fileWriter.flush();

        //关闭流
        fileWriter.close();

        //输出流
        FileReader fileReader = new FileReader("D:\\doc\\hello.txt");
        int len = 0;
        while ((len = fileReader.read()) != -1){
            System.out.println(len);
        }
        //用char数组读数据
        char[] chars = new char[1024];
        while ((len = fileReader.read()) != -1){
            System.out.println(chars);
        }
        fileReader.close();
    }
}
