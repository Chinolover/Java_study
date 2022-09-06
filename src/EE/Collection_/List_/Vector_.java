package EE.Collection_.List_;

import java.util.Vector;

public class Vector_ {
    public static void main(String[] args) {
        //Vector 底层同样是Object数组，但相比ArrayList具有线程安全
        //扩容机制为 无参的话，默认为10，满后按照2倍扩容，如果指定大小，直接按照两倍扩容

        Vector vector = new Vector();
        for (int i = 0; i < 11; i++) {
            vector.add(i);
        }
    }
}
