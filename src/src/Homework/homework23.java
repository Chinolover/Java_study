package src.Homework;

import java.util.Comparator;
import java.util.TreeSet;

public class homework23 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet<>(new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        treeSet.add(new Person());
    }
}

class Person{}