package EE.Collection_.List_;

import java.util.LinkedList;

public class LinkedList_ {
    public static void main(String[] args) {
        //底层实现了双向链表和双端队列特点
        //可以添加任意元素(元素可以重复)，包括null
        //线程不安全，没有实现同步

        //LinkedList中维护了两个属性first和last分别指向首节点和尾节点
        //每个节点(Node对象)，里面又维护了prev、next、item三个属性，其中通过prev指向前一个。next指向后一个节点，实现双向链表

        //LinkedList的元素的添加和删除，不是通过数组完成的，相对效率较高

        LinkedList linkedList = new LinkedList();

        //ArrayList 改查效率高，增删效率低
        //LinkedList增删效率高，改查效率低
    }
}
