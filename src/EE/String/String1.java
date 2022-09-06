package EE.String;

public class String1 {
    public static void main(String[] args) {
        //String 实现了Serializable接口，说明String可以串行化(可以网络传输)
        //String 实现了Comparable接口,说明String对象可以比较
        //使用Unicode，一个字符占两个字节
        //String 构造器很多，可以查看源码
        //查看源码发现String的本质仍是char数组

        final char []a1 = {'a','b','c'};
        a1[1] = 't';    //这里注意没有报错，因为final实质是地址无法修改

//        String创建方法一：直接赋值  二：调用构造器

        String a ="abc";
        String b = new String("abc");

        System.out.println(a.equals(b));


    }
}
