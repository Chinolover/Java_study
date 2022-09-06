package SE2.OOP.Access_Modifier;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []a = new int [8];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i+"\t");
        }



    }
}
