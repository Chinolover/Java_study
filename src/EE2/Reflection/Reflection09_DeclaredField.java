package EE2.Reflection;

import java.lang.reflect.Field;

public class Reflection09_DeclaredField {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("EE2.Reflection.Cat");
        Object o = cls.getConstructor().newInstance();

        Field field = cls.getDeclaredField("Boom");
        field.setAccessible(true);  //爆破

        field.set(null,"爆破成功"); //这里因为Boom属性是静态的，所以类加载直接为null，所有类共享对象。
        System.out.println(field.get(null));
    }
}
