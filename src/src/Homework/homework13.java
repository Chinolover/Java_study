package src.Homework;

import java.util.Scanner;

public class homework13 {
    public static void main(String[] args) {

    }
}

class test2{
    public static void Test2(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名");
        char []chars = input.next().toCharArray();
        if(!(chars.length>=2 && chars.length<=4 ))
            throw new RuntimeException("用户名异常");

    }
}