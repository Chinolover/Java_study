package src.Homework;

import java.util.ArrayList;

public class homework21 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Cars("特斯拉",88888));
        arrayList.add(new Cars("沃尔沃",100000));
        arrayList.add(new Cars("劳斯莱斯",1300000));
        arrayList.remove(0);
        System.out.println(arrayList.contains(new Cars("劳斯莱斯",1300000)));

        System.out.println(arrayList.size());

        System.out.println(arrayList.isEmpty());
    }
}

class Cars{
    private String name;
    private double price;

    public Cars(String name, double price) {
        this.name = name;
        this.price = price;
    }
}