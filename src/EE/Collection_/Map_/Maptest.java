package EE.Collection_.Map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maptest {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","刘德华");
        map.put("no2","张学友");
        map.put("no3","周润发");
        map.put("no2","李白");
        map.put("no4","刘德华");
        map.put(null,null);
        System.out.println(map);//我们这里发现HashMap同样无序，且Key不同无法添加，Value相同可以添加

        System.out.println(map.get("no2"));

        //k-v 为了方便程序员的遍历，还会创建EntrySet集合，该集合存放的元素的类型Entry
        //getKey getValue

        Set set = map.entrySet();
        System.out.println(set.getClass()); //HashMap$EntrySet
        for (Object o : set) {
            System.out.println(o);
        }
        for(Object obj : set){
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        map.remove("no1");  //根据键删除映射关系

        Object val = map.get("no3");
        System.out.println(val);    //根据键获取值

        System.out.println(map.size());
        //size：获取元素个数

        System.out.println(map.isEmpty());  //判断个数是否为0
        //clear ：清楚
        //containsKey :查找键是否存在
        System.out.println(map.containsKey("no4"));
    }
}


