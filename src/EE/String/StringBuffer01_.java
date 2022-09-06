package EE.String;

public class StringBuffer01_ {
    public static void main(String[] args) {
        //StringBuffer常用方法

        StringBuffer s = new StringBuffer("hello");

        //增
        s.append(',');
        s.append("Jason");
        s.append("啊对对对").append(100).append(true).append(10.2);
        System.out.println(s);

        //删
        s.delete(0,4);    //删除索引位置[0,4)
        System.out.println(s);

        //改
        s.replace(9,11,"窝嫩叠窝嫩叠窝嫩叠");
        System.out.println(s);

        //查
        System.out.println(s.indexOf("窝嫩叠")); //查找指定子串在字符串第一次出现的索引，找不到返回-1

        //插入
        s.insert(3,"Fuck");
        System.out.println(s);

        //长度
        System.out.println(s.length());

    }
}
