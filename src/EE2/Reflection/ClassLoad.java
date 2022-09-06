package EE2.Reflection;

import EE2.IO.ObjectStream.Dog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassLoad {
    /*
    反射机制是java实现动态语言的关键，也就是通过反射实现类动态加载。
            1.静态加载:编译时加载相关的类，如果没有则报错，依赖性太强
            2.动态加载:运行时加载需要的类，如果运行时不用该类，即使不存在该类，则不报
              错，降低了依赖性
    */

//1.当创建对象时(new) //静态加载
//2.当子类被加载时,父类也加载//静态加载
//3.调用类中的静态成员时//静态加载
//4.通过反射//动态加载

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String choice = new Scanner(System.in).next();
        /*
        Cat如果没有的话，程序直接编译，但是Dog类没有的话只要不输入2就可以运行
         */
        switch (choice) {
            case "1" -> {
                Cat cat = new Cat();    //静态加载
                cat.fuck();
            }
            case "2" -> {
                Class<?> cls = Class.forName("Dog");    //动态加载
                Object o = cls.getConstructor().newInstance();
                Method m = cls.getMethod("Kick");
                m.invoke(o);
            }
            default -> System.out.println("Do nothing");
        }
    }
}
