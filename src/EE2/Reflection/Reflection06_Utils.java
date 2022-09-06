package EE2.Reflection;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//通过反射获取类的结构信息
//第一组API
public class Reflection06_Utils {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = Class.forName("EE2.Reflection.Cat");

//        1. getName:获取全类名
        System.out.println("全类名为 " + cls.getName());
//        2. getSimpleName:获取简单类名
        System.out.println("简单类名为" + cls.getSimpleName());
//        3. getFields:获取所有public修饰的属性，包含本类以及父类的
        Field[] fields = cls.getFields();
        System.out.println("获取所有public修饰的属性，包含本类以及父类的如下");
        for (Field field :
                fields) {
            System.out.println(field.getName());
        }
//        4. getDeclaredFields:获取本类中所有属性
        Field[] fields1 = cls.getDeclaredFields();
        System.out.println("获取本类中所有属性(包括私有属性)");
        for (Field field :
                fields1) {
            System.out.println(field.getName());
        }
//        5. getMethods:获取所有public修饰的方法，包含本类以及父类的
        Method[] methods = cls.getMethods();
        System.out.println("获取所有public修饰的方法，包含本类以及父类的");
        for (Method method :
                methods) {
            System.out.println(method.getName());
        }
//        6. getDeclaredMethods:获取本类中所有方法
        Method[] methods2 = cls.getMethods();
        System.out.println("获取本类中所有方法(包括私有方法)");
        for (Method method :
                methods2) {
            System.out.println(method.getName());
        }
//        7. getConstructors:获取所有public修饰的构造器，包含本类
        Constructor<?>[] constructors = cls.getConstructors();
        System.out.println("获取所有public修饰的构造器，包含本类以及父类的");
        for (Constructor<?> constructor :
                constructors) {
            System.out.println(constructor);
        }

//        8. getDeclaredConstructors:获取本类中所有构造器

//        9. getPackage:以Package形式返回包信息
        System.out.println("以Package形式返回包信息");
        System.out.println(cls.getPackage());
//        10.getSuperClass:以Class形式返回父类信息
        System.out.println("以Class形式返回父类信息");
        System.out.println(cls.getSuperclass());
//        11.getInterfaces:以Class[]形式返回接口信息
//        12.getAnnotations:以Annotation[]形式返回注解信息
        System.out.println("以Annotation[]形式返回注解信息");
        Annotation[] annotations = cls.getAnnotations();
        for (Annotation a :
                annotations) {
            System.out.println(a);
        }
    }
}
