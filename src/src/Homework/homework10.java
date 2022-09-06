package src.Homework;

import java.util.Scanner;

public class homework10 {
    public static void main(String[] args) {
        System.out.println(EcmDef.cal());
    }
}

class EcmDef{

    public static int cal(){
        try {
            System.out.println("请输入两个数相除");
            int n1 = new Scanner(System.in).nextInt();
            int n2 = new Scanner(System.in).nextInt();
            return n1/n2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
