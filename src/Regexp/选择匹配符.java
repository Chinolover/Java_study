package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 选择匹配符 {
    public static void main(String[] args) {
        String text = "wxh 王兴华 我歇会 adasda";

        String regStr = "wxh|王兴华|我歇会";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("找到:" + matcher.group(0));
        }
    }
}
