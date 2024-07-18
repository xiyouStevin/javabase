package com.dwh.common.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author: Steven
 * @create: 2024-07-18 10:34
 * @Description: 方法引用
 */
public class ClassImportBaseMethod {
    public static void main(String[] args){
        //构造器引用
        final Car car = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car);
        //静态方法引用
        cars.forEach(Car::collide);
        //特定类的任意对象的方法引用
        cars.forEach(Car::repair);
        //特定对象的方法引用
        cars.forEach(car::follow);
    }
}

class Car{
    //Supplier也是JDK1.8的接口，这里和Lambda一起使用
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }
    public static void collide(final Car car) {
       System.out.println("collide:" + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("follow the:" + another.toString());
    }

    public void repair(){
        System.out.println("repair the:" + this.toString());
    }
}