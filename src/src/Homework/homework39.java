package src.Homework;

import java.io.File;
import java.lang.reflect.Constructor;

public class homework39 {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("java.io.File");

        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor<?> c :
                constructors) {
            System.out.println(c);
        }

        File file = (File) cls.getConstructor(String.class).newInstance("d:\\aa.txt");
        cls.getMethod("createNewFile").invoke(file);
    }
}
