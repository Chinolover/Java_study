package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 正则转义符 {
    public static void main(String[] args) {
        String s = "abc(123(qwe$(";
        //假如要匹配字符串中的(
        String zz = "\\(";  //如果直接"\\("就会出错，所以需要转义字符\\
        String zz2 = "\\.";  //同理匹配.也需要
        Pattern compile = Pattern.compile(zz);

        Matcher matcher = compile.matcher(s);

        while (matcher.find()){
            System.out.println("找到" + " " + matcher.group(0));
        }
    }
}
