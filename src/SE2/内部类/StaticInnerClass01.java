package SE2.内部类;

//静态内部类
public class StaticInnerClass01 {
    public static void main(String[] args) {
        //方式1
        Outer10.Inter10 inter10 = new Outer10.Inter10();    //注意这里new的位置和内部类的区别
        inter10.say();
        //方式2  ：类似单例模式，在类中编写一个方法，可以返回静态内部类的对象实例
    }
}

class Outer10{
    private int n1 = 10;
    private static String name = "刘琮琳";
    //Inner10是静态内部类
    //1.放在外部类的成员位置
    //2.使用static修饰
    //3.可以直接访问外部类的所有静态成员,包含私有的,但不能直接访问非静态成员
    //4.可以添加任意访问修饰符(public,protected,默认，private)，因为它的地位就是一个成员
    //5.作用域：同其他的成员，为整个整体
    public static class Inter10{
        public void say(){
            System.out.println(name);
        }
    }
}
