package EE.Collection_.Set_;

public @interface HashSet底层 {
    //HashSet底层是HashMap,第一次添加时，table数组扩容到16，临界值=16*加载因子(0.75)=12,防止一次添加过多元素导致阻塞
    //添加一个元素值，会先得到hash值 - 会转成索引值
    //找到存储数据表table，看这个索引位置是否已经存放的有元素，有的话调用equals比较，如果相同放弃添加，不相同，则添加到最后

    //java8中，如果一条链表的元素个数超过TREEIFY_THRESHOLD=8 并且table大小大于64，则会进行树化，由链表变为红黑树

    //就是散列表，当后续链表长度过长时，链表会自动树化
}
