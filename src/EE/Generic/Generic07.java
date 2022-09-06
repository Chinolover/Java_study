package EE.Generic;

import java.util.ArrayList;
import java.util.List;

//泛型通配
public class Generic07 {
    public static void main(String[] args) {
//        List<Object>list = new ArrayList<String>();   //错误，泛型不具备继承性
        /*
        <?>:支持任意泛型类型
        <? extends A>:支持A类以及A类的子类，规定了泛型的上限
        <? super A>:支持A类以及A类的父类，不限于直接父类，规定了泛型的下限  */

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

        printCollection1(list1);        //List<?> c 统配均可调用
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

//        printCollection2(list1);      //前两句无法调用，因为list1和list2泛型类型不是AA或AA的子类
//        printCollection2(list2);
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        printCollection3(list1);
//        printCollection3(list2);      //list2、4、5无法调用，因为齐泛型类不是AA或AA的父类
        printCollection3(list3);
//        printCollection3(list4);
//        printCollection3(list5);

    }

    public static void printCollection1(List<?> c){
        for (Object o :c) {
            System.out.println(o);
        }
    }

    public static void printCollection2(List<? extends AA> c){
        for (Object o :c) {
            System.out.println(o);
        }
    }

    public static void printCollection3(List<? super AA> c){
        for (Object o :c) {
            System.out.println(o);
        }
    }



}

class AA{}

class BB extends AA{}

class CC extends BB{}
