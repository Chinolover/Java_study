package EE.Collection_.Map_;

import java.util.*;
/*
    containsKey:查找键是否存在
    keySet:获取所有的键
    entrySet:获取所有关系k-v
    values:获取所有的值
 */

public class Map遍历 {
    public static void main(String[] args) {
        //Map八种遍历方式

        Map map = new HashMap();
        map.put("no1","wxh");
        map.put("no2","lcl");
        map.put("no3","lwx");
        map.put("no4","yxc");
        map.put("no5","lpf");
        map.put(null,null);

        //第一组:先取出所有的Key,通过Key取出对应Value
        Set keyset = map.keySet();
        for (Object key : keyset) {
            System.out.println(key +"-"+ map.get(key));
        }

        Iterator iterator =keyset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next + "-" + map.get(next));
        }

        System.out.println("------------第二组-------------");
        //第二种：把所有的values取出
        Collection values = map.values();

        for (Object value : values) {
            System.out.println(value);
        }

        Iterator iterator1 =values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }

        System.out.println("-------------第三种--------------");
        //第三种: 通过EntrySet 来获取k-v
        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
            //因为需要用Map.Entry（内部类）特有方法，所以我们需要进行类型转换
            System.out.println(m.getKey() + "--" + m.getValue());
        }

        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            Map.Entry mm = (Map.Entry) next;
            System.out.println(mm.getKey() + "--" + mm.getValue());
        }
    }
}
