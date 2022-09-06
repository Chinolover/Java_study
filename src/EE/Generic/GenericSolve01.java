package EE.Generic;

import java.util.ArrayList;

public class GenericSolve01 {
    public static void main(String[] args) {
        //Java泛型可以保证如果程序在编译时没有发出警告，运行时就不会产生ClassCastException异常.代码更加简洁、健壮
        ArrayList<dog> arrayList = new ArrayList<dog>();

        //使用泛型后，如果编译器发现添加的类型，不满足需求，就会报错
        arrayList.add(new dog("wxh",3));
        arrayList.add(new dog("lcl",4));
        arrayList.add(new dog("wzz",100));

        for (dog o : arrayList) {   //在遍历的时候，可以直接取出Dog类而不是Object
            System.out.println(o);
        }

    }
}



class dog {
    private String name;
    private int age;

    public dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class cat {
    private String name;
    private int age;

    public cat(String name, int age) {
        this.name = name;
        this.age = age;
    }


}