package Regexp;

import java.util.regex.Pattern;

public class Pattern_ {
    public static void main(String[] args) {
        //如果只是想验证一个正则表达式是否满足 整体匹配 使用matches方法更加敏捷
        String text = "398049163";
        String regStr = "^[1-9]\\d{4,9}$";
        boolean matches = Pattern.matches(regStr, text);
        //必须是整体匹配才能返回true,可以不加定位符^$
        //但是如果用find方法必须加^$，因为可能匹配的是一部分，造成错误匹配
        System.out.println(matches?"匹配成功":"匹配失败");
    }
}
