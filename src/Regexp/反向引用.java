package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 反向引用 {
    public static void main(String[] args) {
        String text = "Hello jack11 tom22 55555 1331 6556";

//        String regStr = "(\\d)\\1"; //匹配两个连续相同的数字   \\1\\2表示分组引用，\\1为第一个分组....
//        String regStr = "(\\d)\\1{4}";  //匹配五个连续相同数字
          String regStr = "(\\d)(\\d)\\2\\1";  //匹配abba

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("找到:" + matcher.group(0));
        }
    }
}
