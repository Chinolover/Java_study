package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkTest {
    public static void main(String[] args) {
        //http://www.sohu.com:8080/abc/index.htm
        //要求得到协议是什么?
        //域名是什么?
        //端口是什么?
        //文件名是什么?

        String text = "http://www.sohu.com:8080/abc/index.htm";
        String regStr = "^(https?)://([a-zA-z.]+):(\\d+)[\\w-]*/([\\w.])+$";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(text);

        if (matcher.matches()){  //整体匹配
            System.out.println("整体匹配=" + matcher.group(0));
            System.out.println("协议: " + matcher.group(1));
            System.out.println("域名: " + matcher.group(2));
            System.out.println("端口: " + matcher.group(3));
            System.out.println("文件名: " + matcher.group(4));
        }

    }
}
