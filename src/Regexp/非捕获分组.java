package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 非捕获分组 {
    public static void main(String[] args) {
        //非捕获分组，虽然分组，但不会捕获，不可以用group(1).....
        String text = "hello韩顺平教育 jack韩顺平老师 韩顺平同学hello";

//        String regStr = "韩顺平(?:教育|老师|同学)";    //等价于(韩顺平教育|韩顺平老师|韩顺平同学|)
//        String regStr = "韩顺平(?=教育|老师)";     //这个会匹配后面有教育和老师的韩顺平
        String regStr = "韩顺平(?!教育|老师)";     //和第二种相反
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
