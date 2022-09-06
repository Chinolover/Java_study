package src.Homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.PrivateKey;

public class homework38 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cls = Class.forName("src.Homework.PrivateTest");
        Object o = cls.getConstructor().newInstance();

        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"wxh");

        System.out.println(((PrivateTest) o).getName());

    }
}
