package EE.PackageClass;

public class PackageClass2 {
    public static void main(String[] args) {
//        Integer->String
        Integer i = 100;
        String str1 = i + "";        //第一种
        String str2 = i.toString();  //第二种
        String str3 =String.valueOf(i);//第三种
//        String->Integer
        String j ="12345";
        Integer int2 = Integer.valueOf(j);//第一种
        Integer int3 = Integer.parseInt(j);//第二种

//常用方法(Integer和Character)
        System.out.println(Integer.MAX_VALUE);//返回最大值
        System.out.println(Integer.MIN_VALUE);//返回最小值

        System.out.println(Character.isDigit('a'));//判断是不是数字
        System.out.println(Character.isLetter('a'));//判断是不是字母
        System.out.println(Character.isUpperCase('a'));//判断是不是大写
        System.out.println(Character.isLowerCase('a'));//判断是不是小写

        System.out.println(Character.isWhitespace('a'));//判断是不是空格
        System.out.println(Character.toUpperCase('a'));//转成大写
        System.out.println(Character.toLowerCase('A'));//转成小写

    }
}
