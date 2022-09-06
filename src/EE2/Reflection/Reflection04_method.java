package EE2.Reflection;

import java.lang.reflect.Field;

public class Reflection04_method {
    public static void main(String[] args) throws Exception {
        String classPath = "EE2.Reflection.Cat";

        Class<?> cls = Class.forName(classPath);
        //1.输出cls
        System.out.println(cls);
        System.out.println(cls.getName());
        System.out.println(cls.getSimpleName());
        System.out.println(cls.getPackage().getName());

        //2.创建对象实例
        Cat cat = (Cat) cls.getConstructor(String.class).newInstance("hyn");
        System.out.println(cat);

        //3.通过反射获取属性
        Field field = cls.getField("age");
        System.out.println(field.get(cat));

        //4.通过反射给属性赋值
        field.set(cat,21);
        System.out.println(field.get(cat));

        //5.得到所有属性
        Field[] fields = cls.getFields();
        for (Field f :
                fields) {
            System.out.println(f.getName());
        }
    }
}
