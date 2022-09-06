package EE.Collection_.Set_;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSet_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(12);
        set.add(31);
        set.add(7);
        set.add(68);


        System.out.println(set);    //我们这里发现默认是从小到大的


        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (int)o2-(int)o1;
            }
        });

        treeSet.add(12);
        treeSet.add(31);
        treeSet.add(7);
        treeSet.add(68);
        System.out.println(treeSet);
    }
}
