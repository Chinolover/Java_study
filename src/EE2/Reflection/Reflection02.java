package EE2.Reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection02 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\EE2\\Reflection\\re.properties"));

        //获取
        String classpath = properties.getProperty("classfullpath");
        String method = properties.getProperty("method");

        //获取类
        Class<?> cls = Class.forName(classpath);

        Object cat = cls.getConstructor().newInstance();

        //java.lang.reflect.Field 代表类的成员变量，Field对象表示某个类的成员变量
        //注意getField不能得到私有属性
        Field nameField = cls.getField("age");
        System.out.println(nameField.get(cat));     //反射是反向实现的

        //java.lang.reflect.Method 代表类的方法，Method对象表示某个类的方法
        Method method1 = cls.getMethod(method);
        method1.invoke(cat);

        //java.lang.reflect.Constructor:代表类的构造方法，Constructor对象表示构造器
        Constructor<?> constructor = cls.getConstructor(); //()中可以指定构造器参数类型，返回无参构造器
        //通过构造器创建对象
        Object cat02 = cls.getConstructor(String.class).newInstance("abc"); //()中可以指定构造器参数类型，返回无参构造器
        System.out.println(constructor);


    }
}
