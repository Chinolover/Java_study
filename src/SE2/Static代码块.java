package SE2;

/*
1.static代码块也叫做静态代码块，作用就是对类进行初始化，而且它着类的加载而执行，
并且只会执行一次，而如果是普通代码块，每创建一个对象，都会执行一次
2.类被加载的时候：
    ①创建对象实例new
    ②创建子类对象实例，父类也会被加载
    ③使用类的静态成员时
  */
public class Static代码块 {
    public static void main(String[] args) {

        System.out.println(STU.a);

    }
}

class STU{
     static {
        System.out.println("PR被调用");
    }
    static int a= 3;

    public STU() {
        System.out.println("构造方法被调用");
    }
}