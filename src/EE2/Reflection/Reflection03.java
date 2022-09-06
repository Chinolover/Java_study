package EE2.Reflection;

import EE2.Reflection.Cat;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Set;

public class Reflection03 {
    public static void main(String[] args) throws Exception {
        //优点:可以动态的创建和使用对象(也是框架底层核心)，使用灵活，没有反射机制，框架技术就失去底层支撑。
        //缺点:使用反射基本是解释执行，对执行速度有影响.
        m1();
        m2();
        //我们会发现时间差距很大

        //可以进行反射调用优化，关闭访问检查，我们发现Field、Constructor、Method（反射类）均可调用此方法

    }

    public static void m1(){
        Cat cat = new Cat();
        long l = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.fuck();
        }
        long l1 = System.currentTimeMillis();
        System.out.println("消耗时间为"+(l1-l)+"ms");
    }

    public static void m2() throws Exception{
        Class<?> aClass = Class.forName("EE2.Reflection.Cat");
        Object o = aClass.getConstructor().newInstance();
        Method method = aClass.getMethod("fuck");
        //取消方法调用时的访问检查
//        method.setAccessible(true); //true为取消检查
        long l = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            method.invoke(o);
        }
        long l1 = System.currentTimeMillis();
        System.out.println("消耗时间为"+(l1-l)+"ms");

    }
}
