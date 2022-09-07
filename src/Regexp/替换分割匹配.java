package Regexp;

public class 替换分割匹配 {
    public static void main(String[] args) {
        String text = "2000年5月，JDK1.3、JDK1.4、JDK1.5相继发布";

        //使用正则表达式，将JDK1.3、JDK1.4、JDK1.5替换为JDK
         text = text.replaceAll("JDK1\\.(?:3|4|5)","JDK");
        System.out.println(text);

        text = "13888889999";
        if(text.matches("1(38|39)\\d{8}")){ //这样也可以验证
            System.out.println("验证成功");
        }else{
            System.out.println("验证失败");
        }

        text = "hello#abc-jack12smith~北京";
        String []split = text.split("#|-|~|\\d+");
        for (String s : split){
            System.out.println(s);
        }

    }
}
