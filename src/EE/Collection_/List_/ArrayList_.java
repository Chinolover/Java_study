package EE.Collection_.List_;

import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {
        //底层是一个Object数组
        //ArrayList是由数组来实现数据存储的，基本等同于Vector。除了ArrayList是线程不安全的(执行效率高)
        //在多数情况下，不建议使用ArrayList

        //ArrayList 使用无参构造器创建时，初始为空，第一次扩容为10，之后每次扩容会按照1.5倍扩容

        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList(10);    //设置初始大小，之后每次1.5倍扩容

    }
}
