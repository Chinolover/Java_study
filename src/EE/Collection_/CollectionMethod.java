package EE.Collection_;

import java.util.ArrayList;
import java.util.List;

//Collection是个接口，接口中有许多方法，我们用ArrayList举例

@SuppressWarnings({"all"})  //警告太多，看着烦

public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        //add : 添加
        list.add("jack");
        list.add(10);
        list.add(true);
        list.add(0);
        System.out.println(list);
        //remove : 删除
        list.remove(true);//  删除一个指定元素，位置和值均可
        System.out.println(list);
        //contains: 查看元素是否存在
        System.out.println(list.contains("jack"));
        //size:获取元素个数
        System.out.println(list.size());
        //isEmpty:判断是否为空
        System.out.println(list.isEmpty());
        //clear: 清空
        list.clear();
        System.out.println(list);
        //addAll:添加多个元素(传入一个集合)
        //containsAll:查找多个元素是否都存在
        //removeAll:删除多个元素
    }
}
