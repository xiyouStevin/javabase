package com.dwh.common.String;

/**
 * @author: Steven
 * @create: 2024-06-19 15:27
 * @Description: String基础方法
 * charAt(int index);返回索引出的字符，从0开始，中文也一样；
 * compareTo();这个方法用于两种方式的比较,返回值是整型，如果字符串相等返回0；如果此字符串小于字符串参数，小于0，反之，此字符串大于字符串参数，大于0
 *     1、字符串与对象的比较 compareTo(Object o);
 *     2、按字典顺序比较两个字符串 compareTo(String anotherString);
 *  compareToIgnoreCase();按字典顺序比较两个字符串，不考虑大小写
 *  concat();将两个字符串拼接
 *  contentEquals()；用于将此字符串与指定的StringBuffer比较
 *  copyValueOf(char[] data);是String类的静态方法，他将指定字符数组中的所有字符复制到一个新的字符数组中，并返回一个新的字符串，该方法与String类中的valueOf(char[] data);
 *  非常相似，但它将返回一个新的字符数组，而不是使用输入数组中的字符创建一个新的字符串，他有两个重载形式
 *      1、String copyValueOf(char[] data);返回指定数组中表示该字符序列的字符串
 *      2、String copyValueOf(char[] data,int offset,int count);返回指定数组中表示该字符串序列的字符串
 *  endsWith(String suffix);用于测试字符串是否以指定的后缀结束
 *  equals(Object obj);将字符串与指定的对象比较；String类重写了equals()方法用于比较两个字符串内容是否相等
 *  equalsIgnoreCase(Object anotherObject);将此 String 与另一个 String 比较，不考虑大小写。
 */
public class StringBaseMethod {

    public static void main(String[] args){
        System.out.println("--------endsWith----------");
        String Str = new String("你好，java .net");
        boolean retVal;

        retVal = Str.endsWith( "java" );
        System.out.println("返回值 = " + retVal );

        retVal = Str.endsWith( "net" );
        System.out.println("返回值 = " + retVal );

        System.out.println("--------copyValueOf----------");
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a'};
        String Str2 = "";

        Str2 = Str2.copyValueOf( Str1 );
        System.out.println("返回结果：" + Str2);

        Str2 = Str2.copyValueOf( Str1, 2, 6 );
        System.out.println("返回结果：" + Str2);

        System.out.println("--------contentEquals----------");
        String strContentEquals = "你好";
        String strContentEqualsTest = "你好 java";
        StringBuffer strbufferEquals = new StringBuffer("你好");
        System.out.println(strContentEquals.contentEquals(strbufferEquals));
        System.out.println(strContentEqualsTest.contentEquals(strbufferEquals));

        System.out.println("--------concat----------");
        String strConcat = "你好";
        strConcat = strConcat.concat(" java");
        System.out.println(strConcat);

        System.out.println("--------charAt----------");
        String str = "www.baidu.com";
        char result = str.charAt(6);
        System.out.println(result);

        System.out.println("--------compareTo----------");
        String str1 =  "你好";
        String str2 =  "你好";
        String str3 =  "你好啊";
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str1));

        System.out.println("--------compareToIgnoreCase----------");
        String str4 =  "hello";
        String str5 =  "HELLO";
        String str6 =  "Hello java";
        System.out.println(str4.compareToIgnoreCase(str5));
        System.out.println(str5.compareToIgnoreCase(str6));
        System.out.println(str6.compareToIgnoreCase(str4));
    }
}
