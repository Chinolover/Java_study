package EE2.Reflection;


import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
//使用反射机制可以在不修改源码的情况下，控制程序，如果我们需要调用Cat的另一个方法，只需要修改配置文件即可
//符合设计模式的ocp原则


//反射引入
public class Reflection01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\EE2\\Reflection\\re.properties"));

        String classpath = properties.getProperty("classfullpath");
        String method = properties.getProperty("method");

        //传统的方法无法通过配置文件运行类中的方法。

        //使用反射机制解决
        //(1)加载类，返回Class类型的对象cls
        Class<?> cls = Class.forName(classpath);
        //(2)通过cls得到加载的类Cat的实例对象
        Object cat = cls.newInstance(); //jdk9之后，已过时，但企业大多还是使用jdk8

        //方法二
        Object cat2 = cls.getConstructor().newInstance();   //jdk9之后使用的方法

        //(3)加载方法
        Method method1 = cat.getClass().getMethod(method);

        //(4)调用方法
        method1.invoke(cat);    //传统方法： 对象.方法()    反射机制：方法.invoke(对象)


    }
}
