package EE2.Reflection;


public class Reflection05_getClass {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        1.前提:已知一个类的全类名，且该类在类路径下，可通过Class类的静态方法
        forName()获取，可能抛出ClassNotFoundException, 实例: Class cls1 =
        Class.forName( "java.lang.Cat" );
         */
//        应用场景:多用于配置文件，读取类全路径，加载类.

        String path = "EE2.Reflection.Cat";
        Class<?> cls0 = Class.forName(path);
        System.out.println(cls0);

 /*
      2.前提:若已知具体的类，通过类的class获取，该方式最为安全可靠，程序性能
        最高实例: Class cls2 = Cat.class;
  */
//        应用场景:多用于参数传递，比如通过反射得到对应构造器对象.
        Class<Cat> cls2 = Cat.class;
        System.out.println(cls2);

        /*
        3.通过实例对象获取
         */
        Cat cat = new Cat();
        Class<? extends Cat> cls3 = cat.getClass();
        System.out.println(cls3);

        //4.通过类加载器
        ClassLoader classLoader = cat.getClass().getClassLoader();
        Class<?> cls4 = classLoader.loadClass(path);
        System.out.println(cls4);

        //5.基本类型
        Class<Integer> integerClass = int.class;

        //6.基本数据类型对应的包装类，可以通过.TYPE 得到CLass类对象
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);

    }
}
