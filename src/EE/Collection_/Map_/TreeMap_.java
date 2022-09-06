package EE.Collection_.Map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("kristina","克里斯缇娜");
        treeMap.put("smith","史密斯");

        System.out.println(treeMap);    //默认从Key小到大排序

        TreeMap treeMap1 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).compareTo((String)o1 );
            }
        });
        treeMap1.put("jack","杰克");
        treeMap1.put("tom","汤姆");
        treeMap1.put("kristina","克里斯缇娜");
        treeMap1.put("smith","史密斯");
        System.out.println(treeMap1);
    }
}

