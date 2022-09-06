package src.Homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class homework15 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        list.add(2,"韩顺平教育");
        System.out.println(list.get(5));

        list.remove(6);
        list.set(7,"huahuahua");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }
    }
}
