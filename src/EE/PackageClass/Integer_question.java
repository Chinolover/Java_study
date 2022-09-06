package EE.PackageClass;

public class Integer_question {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
        //这里因为是两个对象

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);

        //这里查看源码，我们发现，只有当对象值在 -128 ~ 127之间，才会是值的比较，否则均创建新对象
    }
}
