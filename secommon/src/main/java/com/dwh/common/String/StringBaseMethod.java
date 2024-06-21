package com.dwh.common.String;

import java.io.UnsupportedEncodingException;

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
 *  byte[] getBytes();使用平台默认字符集将此String编码为byte序列，并将结果存储到一个新的byte数组中
 *  byte[] getBytes(String charsetName);同上功能一致，只不过能指定字符集
 *  void getChars(int srcBegin, int srcEnd, car[] dst, int dstBegin);将此字符串复制到目标字符数组
 *  int hashCode();返回此字符串的hasCode();
 *  int indexOf(int ch);返回指定字符串在此字符串中第一次出现处的索引
 *  int indexOf(int ch，int fromIndex);返回此字符串中第一次出现指定字符串的索引，从指定的索引开始搜索
 *  int indexOf(String str);返回指定子字符串在此字符串中第一次出现的索引
 *  int indexOf(String str,int fromIndex);返回指定子字符串第一次出现指定字符串的索引，从指定的索引开始搜索
 *  String intern();返回字符串对象的规范化表示形式，用于在运行时将字符串添加到内部的字符串池中，并返回字符串的引用
 *  int lastIndexOf(int ch);返回指定字符串在此字符串中最后一次出现处的索引
 *  int lastIndexOf(int ch，int fromIndex);返回此字符串中最后一次出现指定字符串的索引，从指定的索引开始搜索
 *  int lastIndexOf(String str);返回指定子字符串在此字符串中最后一次出现的索引
 *  int lastIndexOf(String str,int fromIndex);返回指定子字符串最后一次出现指定字符串的索引，从指定的索引开始搜索
 *  int length();返回此字符串的长度
 *  boolean matches(String regex);告知此字符串是否匹配给定的正则表达式
 *  boolean regionMatches(boolean ignoreCase,int toffset,String other,int ooffset,  int len);如果字符串的指定子区域匹配字符串参数的指定子区域，返回true
 *  boolean regionMatches(int toffset,String other,int ooffset,  int len);测试两个字符串区域是否相等
 *  String replace(char oldChar, char newChar);返回一个新的字符串，通过newChar替换此字符串中出现的所有oldChar得到
 *  String replaceAll(String regex, String replacement);使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串
 *  String replaceFirst(String regex, String replacement);使用给定的replacement替换此字符串匹配给定正则表单时的第一次子字符串
 *  String[] split(String regex);根据给定的正则表达式的匹配拆分此字符串
 *  String[] split(String regex, int limit);根据匹配的正则表达式来拆分此字符串
 *  boolean startsWith(String prefix);测试此字符串是否已指定的前缀开始
 *  boolean startsWith(String prefix, int toffset);测试此字符串从指定索引开始的子字符串是否是以指定的前缀开始
 *  CharSequence subSequence(int beginIndex, int endIndex);返回一个新的字符串，他是此序列的一个子序列
 *  String subString(int beginIndex);返回一个新的字符串，他是此字符串的子字符串
 *  String subString(int beginIndex, int endIndex);返回一个新字符串，他是此字符串的一个子字符串
 *  char[] toCharArray();将此字符串转换为一个新的字符数组
 *  String toLowerCase();使用默认语言环境的规则将String转小写
 *  String toLowerCase(Locale locale);指定语言环境的规则将String转小写
 *  String toUpperCase(); 使用默认语言环境的规则将String转大写
 *  String toUpperCase(Locale locale);指定语言环境的规则将String转大写
 *  String toString();返回此对象本身
 *  String trim();返回字符串的副本，忽略前面空白和后面空白
 *  static String valueOf(primitive data type x);返回给定data  type类型x参数的字符串表示形式
 *  contains(CharSequence chars);判断是否包含指定的字符串系列
 *  boolean isEmpty() 判断字符串是否为空
 *
 */
public class StringBaseMethod {

    public static void main(String[] args){
        System.out.println("-------- trim ----------");
        String trimStr = " baidu ";
        System.out.print("返回值 :" );
        System.out.println( trimStr.trim() );


        System.out.println("-------- toLowerCase --- toUpperCase ----------");
        String toLowerCaseStr = new String("WWW.BAIDU.COM");

        System.out.print("返回值 :" );
        System.out.println( toLowerCaseStr.toLowerCase() );

        String toUpperCaseStr = new String("www.baidu.com");

        System.out.print("返回值 :" );
        System.out.println( toUpperCaseStr.toUpperCase() );

        System.out.println("--------toCharArray----------");
        String charArrayStr = new String("www.baidu.com");

        System.out.print("返回值 :" );
        System.out.println( charArrayStr.toCharArray() );


        System.out.println("--------subString----------");
        String subStringStr = new String("This is text");

        System.out.print("返回值 :" );
        System.out.println(subStringStr.substring(4) );

        System.out.print("返回值 :" );
        System.out.println(subStringStr.substring(4, 10) );

        System.out.println("--------subSequence----------");
        String subSequenceStr = new String("www.baidu.com");

        System.out.print("返回值 :" );
        System.out.println(subSequenceStr.subSequence(4, 10) );;

        System.out.println("--------startsWith----------");
        String startWithStr = new String("www.baidu.com");

        System.out.print("返回值 :" );
        System.out.println(startWithStr.startsWith("www") );

        System.out.print("返回值 :" );
        System.out.println(startWithStr.startsWith("baidu") );

        System.out.print("返回值 :" );
        System.out.println(startWithStr.startsWith("baidu", 4) );

        System.out.println("--------split----------");
        String splitStr = new String("Welcome-to-baidu");

        System.out.println("- 分隔符返回值 :" );
        for (String retval: splitStr.split("-")){
            System.out.println(retval);
        }

        System.out.println("- 分隔符设置分割份数返回值 :" );
        for (String retval: splitStr.split("-", 2)){
            System.out.println(retval);
        }

        String splitStrText = new String("www.baidu.com");
        System.out.println("转义字符返回值 :" );
        for (String retval: splitStrText.split("\\.", 3)){
            System.out.println(retval);
        }
        String splitStrText1 = new String("acount=? and uu =? or n=?");
        System.out.println("多个分隔符返回值 :" );
        for (String retval: splitStrText1.split("and|or")){
            System.out.println(retval);
        }


        System.out.println("--------replace----------");
        String replaceStr = new String("www.baidu.com");
        System.out.print("返回值 :" );
        System.out.println(replaceStr.replace('a', 'b'));

        System.out.print("返回值 :" );
        System.out.println(replaceStr.replace('u', 'S'));

        System.out.print("匹配成功返回值 :" );
        System.out.println(replaceStr.replaceAll("(.*)baidu(.*)", "bing" ));
        System.out.print("匹配失败返回值 :" );
        System.out.println(replaceStr.replaceAll("(.*)taobao(.*)", "bing" ));

        String replaceFirstStr = new String("hello baidu，I am from baidu。");

        System.out.print("返回值 :" );
        System.out.println(replaceFirstStr.replaceFirst("baidu", "google" ));
        System.out.print("返回值 :" );
        System.out.println(replaceFirstStr.replaceFirst("(.*)baidu(.*)", "google" ));


        System.out.println("--------regionMatches----------");
        String regionMatchesStr = new String("www.baidu.com");
        String regionMatchesTest = new String("baidu");
        String regionMatchesTest1 = new String("BAIDU");

        System.out.print("返回值 :" );
        System.out.println(regionMatchesStr.regionMatches(4, regionMatchesTest, 0, 5));

        System.out.print("返回值 :" );
        System.out.println(regionMatchesStr.regionMatches(4, regionMatchesTest1, 0, 5));

        System.out.print("返回值 :" );
        System.out.println(regionMatchesStr.regionMatches(true, 4, regionMatchesTest1, 0, 5));

        System.out.println("--------matches----------");
        String matchesStr = new String("www.baidu.com");

        System.out.print("返回值 :" );
        System.out.println(matchesStr.matches("(.*)baidu(.*)"));

        System.out.print("返回值 :" );
        System.out.println(matchesStr.matches("(.*)google(.*)"));

        System.out.print("返回值 :" );
        System.out.println(matchesStr.matches("www(.*)"));

        System.out.println("--------intern----------");
        /**
         * 以上实例中，internStr 是直接赋值的字符串常量，它会被自动添加到字符串池中。
         * internStrTest 是通 过new String() 创建的新字符串对象，它不会自动添加到字符串池中。
         * 然后，通过调用 intern() 方法，将 internStrTest 添加到字符串池中，并返回字符串池中的引用，保存在 internStrTest1 中。
         * 注意，== 运算符用于比较引用是否相等。在上面的示例中，internStr == internStrTest1 返回 true，这是因为它们都引用字符串池中的同一个对象。
         * 使用 intern() 方法可以在需要比较字符串内容时节省内存，因为它可以确保相同内容的字符串共享同一个对象。
         * 然而，过度使用 intern() 方法可能导致字符串池的增长，消耗大量内存。因此，应谨慎使用 intern() 方法，只在必要时使用。
         */
        String internStr = "baidu";
        String internStrTest = new String("baidu");
        String internStrTest1 = internStrTest.intern();

        System.out.println(internStr == internStrTest);  // false
        System.out.println(internStr == internStrTest1);  // true

        System.out.println("--------indexOf----------");
        String indexOfStr = "aaa456ac";
        //查找指定字符是在字符串中的下标。在则返回所在字符串下标；不在则返回-1.
        System.out.println(indexOfStr.indexOf("b")); // indexOf(String str); 返回结果：-1，"b"不存在

        // 从第四个字符位置开始往后继续查找，包含当前位置
        System.out.println(indexOfStr.indexOf("a",3));//indexOf(String str, int fromIndex); 返回结果：6

        //（与之前的差别：上面的参数是 String 类型，下面的参数是 int 类型）参考数据：a-97,b-98,c-99

        // 从头开始查找是否存在指定的字符
        System.out.println(indexOfStr.indexOf(99));//indexOf(int ch)；返回结果：7
        System.out.println(indexOfStr.indexOf('c'));//indexOf(int ch)；返回结果：7

        //从fromIndex查找ch，这个是字符型变量，不是字符串。字符a对应的数字就是97。
        System.out.println(indexOfStr.indexOf(97,3));//indexOf(int ch, int fromIndex); 返回结果：6
        System.out.println(indexOfStr.indexOf('a',3));//indexOf(int ch, int fromIndex); 返回结果：6

        System.out.println("--------getChars----------");
        String charsStr = new String("www.baidu.com");
        char[] charsStrTest = new char[6];

        try {
            charsStr.getChars(4, 10, charsStrTest, 0);
            System.out.print("拷贝的字符串为：" );
            System.out.println(charsStrTest );
        } catch( Exception ex) {
            System.out.println("触发异常...");
        }


        System.out.println("--------getBytes----------");
        String StrByte = new String("shcool");

        try{
            byte[] StrByteTest = StrByte.getBytes();
            System.out.println("返回值：" + StrByteTest );

            StrByteTest = StrByte.getBytes( "UTF-8" );
            System.out.println("返回值：" + StrByteTest );

            StrByteTest = StrByte.getBytes( "ISO-8859-1" );
            System.out.println("返回值：" + StrByteTest );
        } catch (UnsupportedEncodingException e){
            System.out.println("不支持的字符集");
        }

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
