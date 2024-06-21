package com.dwh.common.Math;

/**
 * @author: Steven
 * @create: 2024-06-21 14:33
 * @Description: Math类
 * xxxValue();将Number对象转换为xxx数据类型的值并返回
 * compareTo();将number对象与参数比较
 * equals();判断number是否与参数相等
 * valueOf();返回一个number对象指定的内置数据类型
 * toString();以字符串形式返回值
 * parseInt();将字符串解析为int类型
 * abs();返回参数的绝对值
 * ceil();返回大于等于给定参数的最小整数，类型为双精度浮点型
 * floor();与ceil相反
 * rint()；返回与参数最接近的整数，返回类型为double
 * round();表示四舍五入，算法为Math.floor(x+0.5);所以 Math.round(11.5) 结果为12 ，Math.round(-11.5)结果为-11
 * min();返回两个参数中的最小值
 * max();返回两个参数中的最大值
 * exp();返回自然数底数e的参数次方
 * log();返回参数的自然数底数的对数值
 * pow();返回第一个参数的第二个参数次方
 * sqrt();求参数的算术平方根
 * sin();求指定double类型参数的正弦值
 * cos()；求指定double类型参数的余弦值。
 * tan()求指定double类型参数的正切值。
 * asin()求指定double类型参数的反正弦值。
 * acos()求指定double类型参数的反余弦值。
 * atan() 求指定double类型参数的反正切值。
 * atan2() 将笛卡尔坐标转换为极坐标，并返回极坐标的角度值。
 * toDegrees() 将参数转化为角度。
 * toRadians()  将角度转换为弧度。
 * random() 返回一个随机数。
 *
 */
public class MathBaseMethod {
    public static void main(String[] args){
        System.out.println("-------- random ----------");
        System.out.println( Math.random() );
        System.out.println( Math.random() );


        System.out.println("-------- sqrt ----------");
        double sqrtNumTest = 4;

        System.out.printf("e 的值为 %.4f%n", Math.E);
        System.out.printf("sqrt(%.3f) 为 %.3f%n", sqrtNumTest, Math.sqrt(sqrtNumTest));

        System.out.println("-------- pow ----------");
        double powNum = 2;
        double powNumTest = 3;

        System.out.printf("e 的值为 %.4f%n", Math.E);
        System.out.printf("pow(%.3f, %.3f) 为 %.3f%n", powNum, powNumTest, Math.pow(powNum, powNumTest));


        System.out.println("-------- log ----------");
        double logNum = 11.635;
        System.out.printf("e 的值为 %.4f%n", Math.E);
        System.out.printf("log(%.3f) 为 %.3f%n", logNum, Math.log(logNum));

        System.out.println("-------- exp ----------");
        double expNum = 11.635;
        System.out.printf("e 的值为 %.4f%n", Math.E);
        System.out.printf("exp(%.3f) 为 %.3f%n", expNum, Math.exp(expNum));

        System.out.println("-------- round -- min -- max ----------");
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));

        System.out.println(Math.max(12.123, 18.456));
        System.out.println(Math.min(12.123, 18.456));


        System.out.println("-------- toString -- parseInt -- abs -- ceil -- floor -- rint----------");
        Integer str = 5;
        String strNum = "10";
        Integer strNumText = -100;
        System.out.println(str.toString());
        System.out.println(Integer.parseInt(strNum));
        System.out.println("绝对值：" + Math.abs(strNumText));
        double d = 100.675;
        double e = 100.500;
        float f = -90;

        System.out.println(Math.ceil(d));
        System.out.println(Math.ceil(f));
        System.out.println(Math.floor(d));
        System.out.println(Math.floor(f));
        System.out.println(Math.rint(d));
        System.out.println(Math.rint(e));

        System.out.println("-------- valueOf ----------");
        Integer x =Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");

        Integer b = Integer.valueOf("444",16);   // 使用 16 进制

        System.out.println(x);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------- xxxValue ----------");
        Integer valueNum = 5;
        // 返回 byte 原生数据类型
        System.out.println( valueNum.byteValue() );

        // 返回 double 原生数据类型
        System.out.println(valueNum.doubleValue());

        // 返回 long 原生数据类型
        System.out.println( valueNum.longValue() );

        System.out.println("-------- compareTo ----------");

        Integer compareNum = 5;
        System.out.println(compareNum.compareTo(3)); //1
        System.out.println(compareNum.compareTo(5)); //0
        System.out.println(compareNum.compareTo(8)); //-1
    }
}
