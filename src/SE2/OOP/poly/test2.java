package SE2.OOP.poly;

public class test2 {
    public static void main(String[] args) {
        A a = new B();
        A b = new A();
        //属性只看编译类型，即 ＝ 左边的
        System.out.println(a.age);
        System.out.println(b.age);

    }
}

class A{
    public int age = 10;
}

class B extends A{
    public int age = 20;
}