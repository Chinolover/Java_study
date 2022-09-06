package EE.Collection_.Map_;

import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class Hashtable_ {
    public static void main(String[] args) {
        //同样存放K-V 但是Hashtable的键和值都不能为null，否则会抛出NullPointerException
        //hashTable和HashMap方法基本一样
        //HashTable是线程安全的(synchronized),而HashMap是线程不安全的，但是HashMap效率相对较高

        Map map = new Hashtable();
        map.put("no1","wxh");
        map.put("no2","lcl");
        map.put("no1","lcc"); //如果有相同的key，value被替换
        System.out.println(map.values());


        //Properties 类继承自Hashtable类并且实现了Map接口，也是一种键值对的形式保存
        //Properties还可用于从xxx.properties文件中，加载数据到Properties类对象，并进行读取和修改
        //说明：工作后，xxx.properties文件通常作为配置文件

        Hashtable hashtable = new Properties();

    }
}
