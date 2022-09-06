package SE2.OOP.OOP;

import java.util.Scanner;
import java.util.Random;

//石头剪刀布，0为石头，1为剪刀，2为步
//输入游戏次数，模拟游戏，输出a赢得次数

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        new Tom(size).print();

    }
}
 

class Tom {
    int size;
    private int win;

    public Tom(int size) {
        this.size = size;
        this.win = 0;
    }

    private boolean winner(int a, int b) {
        if ((a == 0 & b == 1) | (a == 1 & b == 2) | (a == 2 & b == 0))
            return true;
        else
            return false;
    }

    public void start(int size) {
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            int a = r.nextInt(3);
            int b = r.nextInt(3);
            if (winner(a, b))
                win++;
        }
    }

    public void print() {
        start(size);
        System.out.println(win);
    }
}