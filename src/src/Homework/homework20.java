package src.Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class homework20 {
    public static void main(String[] args) {
        New aNew = new New("新冠确诊病例超千万，数百万印度教信徒奔赴恒河”圣浴“引民众担忧");
        New aNew1 = new New("男子突然想起两个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        ArrayList arrayList = new ArrayList();
        arrayList.add(aNew);
        arrayList.add(aNew1);

        Collections.reverse(arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            New next = (New) iterator.next();
            if(next.getTitle().length() > 15){
                String a = next.getTitle().substring(0,15);
                next.setTitle(a + "...");
            }
            System.out.println(next);
            
        }



    }
}

class New{
    private String title;
    private String working;

    public New(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    @Override
    public String toString() {
        return "New{" +
                "title='" + title + '\'' +
                '}';
    }
}