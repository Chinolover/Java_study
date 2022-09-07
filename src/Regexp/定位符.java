package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 定位符 {
    public static void main(String[] args) {
//        String text = "123abc12";
        String text = "hanliuli liuhan lihan";

//        String regStr = "^[0-9]+[a-z]*"; //以至少一个数字开头，后接任意个字母的字符串
//        String regStr = "^[0-9]//-[a-z]+$";   //以一个数字开头后连接字符-，并以至少一个小写字母结尾的字符串
//        String regStr = "han\\b";   //匹配字符串后边界，中间可以有空格。
        String regStr = "han\\B";   //匹配字符串前边界，中间可以有空格
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
