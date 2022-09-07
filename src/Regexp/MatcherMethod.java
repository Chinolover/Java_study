package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMethod {
    public static void main(String[] args) {
        String text = "lcl 123456 wxhlcl 89lcl";

        String regStr = "lcl";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(text.substring(matcher.start(), matcher.end()));
            String newContent = matcher.replaceAll("刘琮琳"); // 注意返回的才是新的字符串
            System.out.println(newContent);
        }
    }
}
