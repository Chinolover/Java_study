package SE2;

//过了jdk1.8出了很多新功能
public class NewInterface {
    public static void main(String[] args) {

    }
}

class Animals implements Monkey{

    @Override
    public void demo2() {

    }

    //这里注意被default修饰的方法，我们既可以选择实现接口，也可以选择不实现，增强了拓展性
}

interface Monkey{
    public static void demo1(){
        System.out.println("窝嫩叠");
    }

    public void demo2();

    static int a = 3;

    default void demo3(){
        System.out.println("嘟嘟嘟嘟");
    }
}