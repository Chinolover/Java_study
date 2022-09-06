package src.Homework;

import java.util.Scanner;

public class homework11 {
    public static void main(String[] args) {
        Produce.Print();
    }
}

class Produce{

    public static void Print(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入商品名");
        String name = input.next();
        System.out.println("请输入价格");
        String price = input.next();
        StringBuffer stringBuffer01 = new StringBuffer(price);

        for (int i = stringBuffer01.lastIndexOf(".")-3; i > 0 ; i = i - 3) {
            stringBuffer01 = stringBuffer01.insert(i-3,",");
        }
        System.out.println(stringBuffer01);
    }
}