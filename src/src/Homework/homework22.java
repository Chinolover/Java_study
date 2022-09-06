package src.Homework;

import java.util.*;
import java.util.Map.Entry;

public class homework22 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);

        m.replace("jack",650,2600);
        Set values = m.keySet();
        for (Object o :values) {
            m.put(o,(int)m.get(o)+100);
        }
        Set keyset = m.keySet();
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        Set enterset = m.entrySet();
        for (Object o :enterset) {
            Map.Entry entry = (Map.Entry)o;
            System.out.println(entry.getValue());
        }


    }
}
