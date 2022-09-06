package EE.Collection_.Set_;

import java.util.LinkedHashSet;

public class LinkedHashSet_ {
    public static void main(String[] args) {
        //LinkedHashSet 是 HashSet的子类，底层是LinkedHashMap，底层维护了一个数组+双向链表！！！
        //LInkedHashSet根据元素的hashCode值来决定元素的存储位置，同时使用链表维护元素的次序
        //LinkedHashSet同样不允许添加同样元素
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        //个人理解：
        //它是一个Hash表，然后存入数组，但不会像哈希表那样一个结点存入就到下一个结点，而是进入当前结点的链表中
        //然后根据添加进去的顺序再创建一个双向链表
        //所以，添加和删除的顺序应该是一致的
        linkedHashSet.add("wxh");
        linkedHashSet.add(123);
        linkedHashSet.add(true);
        linkedHashSet.add(new Object());    //可以看出添加顺序即为输出顺序
        System.out.println(linkedHashSet);
    }
}
