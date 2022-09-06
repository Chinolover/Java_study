package EE.PackageClass;

public class PackageClass1 {
    public static void main(String[] args) {
//        jdk3之前，手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        int i = integer.intValue();

//        jdk5之后，可以自动装箱和自动拆箱
//        自动装箱底层用的是valueOf
        int n2 =200;
        Integer integer2 = n2;
        int n = integer2;
    }
}
