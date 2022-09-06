package Object;

import java.util.Objects;

public class Hashcode {
    //hashCode()返回该对象的哈希码值，支持此方法是为了提高哈希表的性能
    //两个引用，如果指向同一个对象，hashCode一定相等，哈希码值主要由地址决定
    public static void main(String[] args) {
        AA a = new AA();
        AA b = new AA();
        AA c = b;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

    }
}

class AA{}