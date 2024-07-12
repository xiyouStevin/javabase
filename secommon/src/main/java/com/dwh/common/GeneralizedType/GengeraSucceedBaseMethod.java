package com.dwh.common.GeneralizedType;

import java.util.ArrayList;

/**
 * @author: Steven
 * @create: 2024-07-12 15:25
 * @Description:
 */
public class GengeraSucceedBaseMethod {

    public static void method(ArrayList<? extends GrandFather> list){

    }

    public static void main(String[] args){
        //定义一个泛型为GrandFather的list对象
        ArrayList<GrandFather> grandFathers = new ArrayList<>();

        //定义一个泛型为Fathers的list对象
        ArrayList<Fathers> fathers = new ArrayList<>();

        //定义一个泛型为Son的list对象
        ArrayList<Son> sons = new ArrayList<>();

        method(grandFathers);
        method(fathers);
        method(sons);
    }
}

/**
 * 定义爷爷类
 */
class GrandFather{}

/**
 * 定义父亲类继承爷爷类
 */
class Fathers extends GrandFather{}

/**
 * 定义儿子类继承父亲类
 */
class Son extends Fathers{}
