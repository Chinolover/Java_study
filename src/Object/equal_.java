package Object;

public class equal_ {
    public static void main(String[] args) {
       /* ==用法
       1.既可以判断基本类型，又可以判断引用类型
       2.判断基本类型，即为值的判断
       3.判断引用类型，判断的是地址是否相等
        */

        /*equals：用法
        1.是Object类中的方法，只能判断引用类型
        2.默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等
        比如Integer,String
         */
        Integer a = new Integer(10);
        //Integer a = 10这两种写法在使用== 时结果不同，在上面的用法时为false，使用Integer a =10时，就位true
        Integer b = new Integer(10);
        System.out.println(a == b);//判断两个地址是否相同
        System.out.println(a.equals(b));//判断两个值是否相同

        String c = "abcde";
        String d = "abcde";

        System.out.println( c == d);
        System.out.println( c.equals(d));

    }
}
