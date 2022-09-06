package EE.Collection_;

public @interface 集合类使用 {
    //开发中，选择什么集合实现类，主要取决于业务操作特点

    /*
    一组对象：Collection接口
        允许重复：List
            增删多：LinkedList【底层维护了一个双向链表】
            改查多：ArrayList【底层维护Object类型的可变数组】    (Vector)线程安全
        不允许重复：Set
            无序：HashSet【底层是HashMap，维护了一个哈希表，数组+链表+红黑树】
            有序：TreeSet
            插入和取出顺序一致：LinkedHashSet，维护数组+双向链表
     */

    /*
    一组键值对：Map接口
        键无序：HashMap 【底层 jdk7：数组+链表 jdk8：数组+链表+红黑树】
        键排序：TreeMap
        键插入和取出顺序一致：LinkHashMap
        读取文件：Properties
     */
}
