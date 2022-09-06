package src.Homework;

import java.util.Scanner;

public class homework14 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String []test = str.split(" ");

        char[]model = test[1].toCharArray();
        String last = test[2] + ',' + test[0]+ '.' + String.valueOf(model[0]).toUpperCase();
        System.out.println(last);
    }
}
