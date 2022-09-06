package EE.String;
//String 在输入时 如果需要输入空格使用nextline
public class String2 {
    public static void main(String[] args) {
        /*  常见方法一
        equals 区分大小写，判断内容是否相等
        equalslgnoreCase 忽略大小写判断内容是否相等
        length 获取字符个数，字符串长度
        indexOf 获取字符在字符串中第一次出现的索引，索引从0开始，找不到返回-1
        lastIndexOf 获取字符在字符串中最后一次出现的索引，索引从0开始，找不到返回-1
        substring 截取指定范围的子串
        trim 去前后空格
        charAt 获取某索引处的字符，注意不能使用Str[index]这种方式
         */
        /*  常见方法二
        replace 字符串替换
        toUpperCase 换大写
        toLowerCase 换小写
         */
        System.out.println("abc bcd def".replace("bcd","替换成功"));

        //split 分割作用
        String poem = "锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦";
        String []poemsplit = poem.split("，");
        for (String temp:poemsplit
             ) {
            System.out.println(temp);   //这里把逗号全部分割为空格
        }

        //toCharArray 转成字符数组
        String s = "happy";
        char []chs = s.toCharArray();
        for (char sh:chs) {
            System.out.println(sh); //这里就转型了String->char []
        }

        //compareTo 比较两个字符串的大小，如果前者大，则返回正数，后者大，返回负数，相等返回0
        String a2 = "jchn";
        String a3 = "jack";
        System.out.println(a2.compareTo(a3));

        //format 类似c语言scanf，比直接拼接增强了复用性
        String name = "华华公主";
        int age = 18;
        double score = 100/3;
        char gender = '男';
        String info2 = String.format("我的姓名是%s 年龄%d 成绩%.2f 性别%c",name,age,score,gender);
        System.out.println(info2);
    }
}

