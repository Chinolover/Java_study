package Object;

public class finalize_ {
    public static void main(String[] args) {
        //finalize就是C++中的析构函数
        //默认调用Object类中的finalize什么都不做
        Car car = new Car("奔驰",131);
        car = null;
        //当对象被回收时，系统自动调用finalize方法，自由当否个对象没有任何引用时，jvm会认为这个对象是一个
        //垃圾对象，就会用垃圾回收器回收该对象。

        System.gc();//主动调用垃圾回收器，但是不会造成程序阻塞，也就是会先执行下面的程序
        System.out.println("输出完毕");

    }
}

class Car{
    private String name;
    private int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("crossover");
        System.out.println("垃圾回收执行成功");
    }
}