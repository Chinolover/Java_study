package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 非贪婪匹配 {
    public static void main(String[] args) {
        //正则表达式默认贪婪匹配，设置非贪婪匹配加？
        String text = "ac111111111111";

//        String regStr = "\\d+?";    //加？为费贪婪匹配
        String regStr = "^1[3|4|5|8]\\d{9}$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
