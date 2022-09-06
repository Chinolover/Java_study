package SE2.OOP.Extends;

//这里注意继承细节，子类构造方法中，如果没有this或者super
//则默认存在一个super()（存在父类）

//super还可以访问父类的构造器，但只能放在构造器第一句！！

public class homework {
    public static void main(String[] args) {
        C test =new C();
    }
}

class A{
    public A(){
        System.out.println("我是A类");
    }
}

class B extends A{
    public B(){
        System.out.println("我是B类的无参构造");
    }
    public B(String name){
        System.out.println(name+"我是B类的有参构造");
    }
}

class C extends B{
    public C(){
        this("Hello");
        System.out.println("我是C类的无参构造");
    }
    public C(String name){
        super("Haha");
        System.out.println("我是C类的有参构造");
    }
}