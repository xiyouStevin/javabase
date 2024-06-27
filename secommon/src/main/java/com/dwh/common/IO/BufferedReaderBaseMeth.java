package com.dwh.common.IO;

import java.io.*;

/**
 * @author: Steven
 * @create: 2024-06-27 11:30
 * @Description:
 */
public class BufferedReaderBaseMeth {

    public static void main(String[] args) throws IOException,ClassNotFoundException,IllegalAccessException{
        //从控制台得到输入流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //创建文件
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\doc\\closeWriter.txt"));
        String input = null;
        while (!(input = bufferedReader.readLine()).equals("exit")){
            //将从控制台得到的数据写入文件
            bufferedWriter.write(input);
            //写入一个当前系统下的空行
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
