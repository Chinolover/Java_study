package EE.Generic;

import java.util.ArrayList;

//类似模板类
public class Generic02 {
    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>("wxh");
        Person<Integer> integerPerson = new Person<Integer>(13);

    }
}

class Person<E> {
    E s ; //E表示 s的数据类型,该数据类型定义Person对象时候指定，即在编译期间，就确定E是什么类型

    public Person(E s){
        this.s = s;
    }

    public E f(){
        return s;
    }
}