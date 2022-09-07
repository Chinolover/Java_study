package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 限定符 {
    public static void main(String[] args) {
        String text = "1111111111aaaaa";

//        String regStr = "a{3}";     //表示匹配aaa
//        String regStr = "1{4}";     //表示匹配1111
//        String regStr = "\\d{2}";   //匹配任意两位数字
//        String regStr = "a{3,4}";   //表示匹配aaa或者aaaa
        //注意: java匹配默认贪婪匹配，尽可能匹配多的
//        String regStr = "\\d{2,5}"; //匹配2-5位数字
//        String regStr = "1+";   //匹配一到多个个1
//        String regStr = "1*";   //匹配零到多个1
        String regStr = "1a?";  //匹配1a或者1
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
