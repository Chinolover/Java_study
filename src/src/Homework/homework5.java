package src.Homework;

import java.util.HashSet;
import java.util.List;

public class homework5 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet2 = new HashSet<>();
        Integer[] integer2 = new Integer[5];
        Integer []integer = new Integer[]{0,1,3,4,5,7,9};
        HashSet<Integer> hashSet = new HashSet<>(List.of(integer));
        for(int i=9975;i<=100000;i=i+75){
            int k;
            int j = i;
            hashSet2.clear();
            do {
                k=j%10;
                j=j/10;
                hashSet2.add(k);
            }while (j!=0);
            if(hashSet.containsAll(hashSet2)){
                System.out.println(i);
            }
        }
    }
}
