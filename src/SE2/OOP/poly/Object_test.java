package SE2.OOP.poly;

public class Object_test {
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
        Integer a=10;
        Double b= 10.0;
        System.out.println(a.equals(b));
    }
}

