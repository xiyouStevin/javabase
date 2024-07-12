package com.dwh.common.Model.Reflex;

import lombok.Data;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author: Steven
 * @create: 2024-07-08 16:29
 * @Description:
 */
@Data
public class Student {

    public Student(){
        System.out.println("用public修饰的无参构造器");
    }

    Student(String name){
        System.out.println("用default修饰的Student的含有一个String参数的构造器：" + name);
    }

    public Student(String name,Integer age){
        System.out.println("用public修饰的含有两个参数的构造器：" + name + age);
    }

    public Student(Boolean sex){
        System.out.println("用public修饰的Student的含有一个Boolean参数的构造器：" + sex);
    }

    protected Student(Integer age){
        System.out.println("用protected修饰的Student的含有一个Integer参数的构造器：" + age);
    }

    private Student(String name,Integer age,Boolean sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("用private修饰的含有三个参数的构造器：" + name + age + sex);
    }

    private String id;

    private String name;

    public String code;

    public Boolean sex;

    public Integer age;

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", age=" + age + ", sex=" + sex + "]";
    }

    protected void getStudentUserInfo(String name,Boolean sex,Integer age){
        System.out.println("获取学生基本信息");
    }


    public void getStudentUserSexInfo(String name,Boolean sex){
        System.out.println("获取每个学生的性别");
    }

    void getStudentUserName(){
        System.out.println("随便来");
    }

    private void getStudentUserAge(Integer age){
        System.out.println("获取年龄" + age);
    }

    public static void main(String[] args){
        System.out.println("Student中的main方法");
        System.out.println(Arrays.toString(args));
    }
}
