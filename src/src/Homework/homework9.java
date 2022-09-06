package src.Homework;

import java.util.Scanner;

public class homework9 {
    public static void main(String[] args) {
        int IN;
        boolean CHOICE = true;
        while(CHOICE){
            try {
                IN = new Scanner(System.in).nextInt();
                CHOICE = false;
            }catch (Exception e){
                System.out.println(e.getMessage()+"请重新输入");
            }
        }

    }
}

