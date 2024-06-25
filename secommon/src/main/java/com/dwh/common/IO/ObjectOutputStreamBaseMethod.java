package com.dwh.common.IO;

import java.io.*;

/**
 * @author: Steven
 * @create: 2024-06-25 15:32
 * @Description:
 */
public class ObjectOutputStreamBaseMethod {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Data w = new Data(2);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("baidu.com"));
        //序列化对象，把对象写到baidu.com里面
        objectOutputStream.writeObject("bing storage\n");
        //序列化对象，把对象写到baidu.com里面
        objectOutputStream.writeObject(w);
        objectOutputStream.close();
        //从baidu.com里面读取对象
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("baidu.com"));
        //读取String对象
        String str = objectInputStream.readObject().toString();
        Data d = (Data)objectInputStream.readObject();
        System.out.println(str + "Data =" + d);
    }
}
class Data implements Serializable {
    private int number;
    public Data(int number) {
        this.number = number;
    }

    @Override
    public String toString(){
        return Integer.toHexString(number);
    }
}
