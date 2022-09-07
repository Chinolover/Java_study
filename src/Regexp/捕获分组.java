package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 捕获分组 {
    public static void main(String[] args) {
        String text = "lcl da1234  sha5678zi";
// 下面就是非命名分组
//        matcher.group(0)得到匹配到的字符串
//        matcher.group(1)得到匹配到的字符串的第1个分组内容
//        matcher.group(2)得到匹配到的字符串的第2个分组内容

//        String regStr = "(\\d\\d)(\\d\\d)";
        String regStr = "(?<g1>\\d\\d)(?<g2>\\d\\d)";   //为分组取名分组
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("找到:" + matcher.group(0));
            System.out.println("找到第一分组:" + matcher.group(1));
            System.out.println("找到第二分组:" + matcher.group(2));

            System.out.println("g1分组内容:" + matcher.group("g1"));
            System.out.println("g2分组内容:" + matcher.group("g2"));
        }
    }
}
