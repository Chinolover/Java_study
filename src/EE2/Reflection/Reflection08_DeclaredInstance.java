package EE2.Reflection;

import java.lang.reflect.Constructor;

public class Reflection08_DeclaredInstance {
    public static void main(String[] args) throws Exception {
        //1.获取类的Class对象
        Class cls = Class.forName("EE2.Reflection.Cat");
        //2.通过public的无参构造器创建实例
        Cat cat01 =(Cat) cls.getConstructor().newInstance();
        System.out.println(cat01);
        //3.通过public的有参构造器创建实例
        Cat cat02 =(Cat) cls.getConstructor(String.class).newInstance("wxh");
        System.out.println(cat02);
        //4.通过非public的有参构造器创建实例
            //使用反射可以访问private构造器/方法/属性，反射面前，都是纸老虎
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);    //反射爆破，使反射可以通过private构造器创建对象
        Object lcl = declaredConstructor.newInstance("lcl", 18);
        System.out.println(lcl);

    }
}