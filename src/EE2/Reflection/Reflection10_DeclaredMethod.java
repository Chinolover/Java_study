package EE2.Reflection;

import java.lang.reflect.Method;

public class Reflection10_DeclaredMethod {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("EE2.Reflection.Cat");
        Object o = cls.getConstructor().newInstance();

        Method declaredMethod = cls.getDeclaredMethod("Bitch", int.class);

        declaredMethod.setAccessible(true); //爆破，突破权限
        System.out.println("declaredMethod.invoke(o,13) = " + declaredMethod.invoke(o, 13));

    }
}
