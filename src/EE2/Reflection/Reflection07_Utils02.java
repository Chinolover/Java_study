package EE2.Reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection07_Utils02 {
    public static void main(String[] args) {

    }

    @Test
    public void Field_() throws ClassNotFoundException {
        Class<?> cls = Class.forName("EE2.Reflection.Cat");
//        1. getModifiers:以int形式返回修饰符
//                [说明:默认修饰符是0，public 是1，private是2 , protected是4,
//                static是8，final 是16] , public(1) + static (8) = 9
//        2. getType:以Class形式返回类型
//        3. getName:返回属性名

        Field[] fields = cls.getFields();
        for (Field field :
                fields) {
            System.out.println("名字为="+ field.getName() + " 修饰符值为 " + field.getModifiers()
                    + " 该属性类型为" + field.getType());
        }
    }

    @Test
    public void Method_() throws ClassNotFoundException {
        Class<?> cls = Class.forName("EE2.Reflection.Cat");
//        1. getModifiers:以in形式返回修饰符
//                [说明:默认修饰符是0，public 是1 , private是2 , protected是4,
//                static是8，final 是16]
//        2. getReturnType:以Class形式获取返回类型
//        3. getName:返回方法名
//        4. getParameter Types:以Class[]返回参数类型数组
        Method[] methods = cls.getDeclaredMethods();
        for (Method method :
                methods) {
            System.out.println("名字为="+ method.getName() + " 返回类型为" + method.getReturnType()
            + " 修饰符值为 " + method.getModifiers());
        }
    }

    @Test
    public void Constructor_() throws ClassNotFoundException {
        Class<?> cls = Class.forName("EE2.Reflection.Cat");
//        1. getModifiers:以int形式返回修饰符
//        2. getName:返回构造器名(全类名)
//        3. getParameterTypes:以Class[]返回参数类型数组
        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor<?> c :
                constructors) {
            System.out.println("构造器名字为" + c.getName() + "修饰赋值为" + c.getModifiers());
        }
    }
}
