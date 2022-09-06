package EE.Generic;

public class Generic04 {
    //自定义泛型
    public static void main(String[] args) {
        //泛型标识符可以有多个
        //普通成员可以使用泛型(属性，方法)
        //如果在创建对象时，没有指定类型，默认为Object
        //静态方法中不能使用类的泛型
    }
}

class Tiger<T,R,M>{
    T t;
    R r;
    M m;

    public Tiger(T t, R r, M m) {
        this.t = t;
        this.r = r;
        this.m = m;
    }

    T[] ts; //使用泛型的数组，不能初始化
}