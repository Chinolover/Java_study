package EE.Generic;

public class Generic05{
    public static void main(String[] args) {
        //接口中，静态成员也不能使用泛型
        //泛型接口的类型，在继承接口或者实现接口时确定
        //没有指定类型，默认为Object

    }
}

interface Monkey<T,U,R>{
    R get(U u);

    default R method(U u){
        return null;
    }
}