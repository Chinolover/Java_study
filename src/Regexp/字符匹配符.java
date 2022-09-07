package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 字符匹配符 {
    public static void main(String[] args) {
        String text = "a11c8ab cAB_C";

//        String regStr = "[a-z]"; //匹配a-z
//          String regStr = "[A-Z]";  //匹配A-Z
//            String regStr = "abc"; //匹配abc字符串
//        String regStr = "(?i)abc";  //匹配abc字符串不区分大小写
//            String regStr = "a(?i)bc";  //表示bc不区分大小写
//        String regStr = "[0-9]";    //匹配0-9之间任意一个字符
//        String regStr = "[^a-z]";   //匹配不在a-z之间的元素
//        String regStr = "[^0-9]";   //匹配不在a-z之间的元素
//        String regStr = "[abcd]";   //匹配abcd之间的元素
//            String regStr = "\\d";  //[0-9]
//        String regStr = "\\D";   //[^0-9]
//        String regStr = "\\w";   //[a-zA-Z0-9]
//        String regStr = "\\W";   //[^a-zA-Z0-9]
//        String regStr = "\\s";   //匹配任何空白字符(空格，制表符等)
//        String regStr = "\\S";   //匹配任何非空白字符(空格，制表符等)
        String regStr = ".";   //匹配出\n之外的所有字符,如果要匹配本身则需要使用\\.




        Pattern pattern = Pattern.compile(regStr);
//        Pattern pattern = Pattern.compile(regStr,Pattern.CASE_INSENSITIVE);//或者创建Pattern对象是添加不敏感参数
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
