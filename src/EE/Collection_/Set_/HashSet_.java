package EE.Collection_.Set_;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HashSet_ {
    public static void main(String[] args) {
        //HashSet 实际上是HashMap(源码说明) HashMap底层是(数组，链表，红黑树)

        HashSet set = new HashSet();

        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));    //False
        System.out.println(set.add("jack"));
        System.out.println(set.add("Rose"));
        System.out.println(set);
        set.clear();

        set.add(new Pig("lcl"));
        set.add(new Pig("lcl"));
        System.out.println(set);    //我们这里发现同时添加的两个对象名字重复

        set.add(new String("wxh"));
        set.add(new String("wxh")); //这里缺添加失败了
        System.out.println(set);

    }
}

class Pig{
    public String name;

    public Pig(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                '}';
    }

}