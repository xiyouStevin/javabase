package com.dwh.common.Date;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author: Steven
 * @create: 2024-06-21 15:16
 * @Description:
 *  boolean after(Date date);若当调用此方法的Date对象在指定日期之后返回true,否则返回false
 *  boolean before(Date date);若当调用此方法的Date对象在指定日期之前返回true,否则返回false
 *  Object clone()；返回此对象的副本
 *  int compareTo(Date date)；比较当调用此方法的Date对象和指定日期。两者相等时候返回0。调用对象在指定日期之前则返回负数。调用对象在指定日期之后则返回正数。
 *  int compareTo(Object obj)；若obj是Date类型则操作等同于compareTo(Date) 。否则它抛出ClassCastException。
 *  boolean equals(Object date)；当调用此方法的Date对象和指定日期相等时候返回true,否则返回false。
 *  long getTime()；返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
 *  int hashCode()；返回此对象的哈希码值。
 *  void setTime(long time)；用自1970年1月1日00:00:00 GMT以后time毫秒数设置时间和日期。
 *  String toString()；把此 Date 对象转换为以下形式的 String： dow mon dd hh:mm:ss zzz yyyy 其中： dow 是一周中的某一天 (Sun, Mon, Tue, Wed, Thu, Fri, Sat)。
 */
public class DateBaseMethod {
    public static void main(String[] args){
        System.out.println("-------- after -- before ----------");
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH,11);
        c.set(Calendar.DATE,05);
        c.set(Calendar.YEAR,2023);
        Date dateTest = c.getTime();
        System.out.println(date.after(dateTest) );
        System.out.println(date.before(dateTest) );
        System.out.println(date.compareTo(dateTest) );
        System.out.println(date.equals(dateTest) );

        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n",date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n",date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n",date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR",date);

        //b的使用，月份简称
        String str=String.format(Locale.US,"英文月份简称：%tb",date);
        System.out.println(str);
        System.out.printf("本地月份简称：%tb%n",date);
        //B的使用，月份全称
        str=String.format(Locale.US,"英文月份全称：%tB",date);
        System.out.println(str);
        System.out.printf("本地月份全称：%tB%n",date);
        //a的使用，星期简称
        str=String.format(Locale.US,"英文星期的简称：%ta",date);
        System.out.println(str);
        //A的使用，星期全称
        System.out.printf("本地星期的简称：%tA%n",date);
        //C的使用，年前两位
        System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n",date);
        //y的使用，年后两位
        System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n",date);
        //j的使用，一年的天数
        System.out.printf("一年中的天数（即年的第几天）：%tj%n",date);
        //m的使用，月份
        System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n",date);
        //d的使用，日（二位，不够补零）
        System.out.printf("两位数字的日（不足两位前面补0）：%td%n",date);
        //e的使用，日（一位不补零）
        System.out.printf("月份的日（前面不补0）：%te",date);


        Calendar c1 = Calendar.getInstance();
        // 获得年份
        int year = c1.get(Calendar.YEAR);
        // 获得月份
        int month = c1.get(Calendar.MONTH) + 1;
        // 获得日期
        int date1 = c1.get(Calendar.DATE);
        // 获得小时
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        // 获得分钟
        int minute = c1.get(Calendar.MINUTE);
        // 获得秒
        int second = c1.get(Calendar.SECOND);
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = c1.get(Calendar.DAY_OF_WEEK);
    }
}
