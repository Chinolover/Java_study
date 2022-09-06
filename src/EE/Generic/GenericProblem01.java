package EE.Generic;

import java.util.ArrayList;

public class GenericProblem01 {
    public static void main(String[] args) {
        //使用传统方法的问题：
        //1.不能对加入到集合ArrayList中的数据类型进行约束(不安全)
        //2.遍历的时候，需要进行类型转换，如果集合中的数据量较大，对效率有影响

        ArrayList arrayList = new ArrayList();
        //思考一个问题，如果我添加了许多狗，不小心添加了一只猫影响就会很大
        arrayList.add(new dog("旺财",10));
        arrayList.add(new dog("发财",1));
        arrayList.add(new dog("钢镚",13));

        arrayList.add(new cat("招财猫",8));

//        for (Object o : arrayList) {        //这里
//            System.out.println((dog)o); //会影响遍历
//        }

    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
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

class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }


}