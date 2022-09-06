package EE.Collection_.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        //Set 接口无序，添加和取出的顺序不一致，没有索引
        //不允许重复元素，所以最多包含一个null

        //!!!!
        //Set 遍历可以使用迭代器和增强for，但是不可以使用索引

        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");    //重复
        set.add("jack");
        set.add(null);
        set.add(null);  //再次添加null
        System.out.println(set);
            //我们发现添加的顺序和输出的顺序并不一样，且不会出现重复元素
        //取出的顺序虽然不是添加的数据，但是他是固定的，是不会变的

        //遍历
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }   //迭代器方式

        for (Object o : set) {
            System.out.println(o);
        }   //增强for


    }
}
