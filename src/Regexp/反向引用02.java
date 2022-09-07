package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 反向引用02 {
    public static void main(String[] args) {
        String text = "我....我要....学学学学....编程java！";

        //1.去掉所有点
        String regStr = "\\.";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll("");
        System.out.println("去点后: "+ text);

        //2.去重复字
        regStr = "(.)\\1+";
        pattern = Pattern.compile(regStr);
        matcher = pattern.matcher(text);
        text = matcher.replaceAll("$1");    //外部反向引用要使用$符号+匹配组数

        System.out.println(text);
    }
}
