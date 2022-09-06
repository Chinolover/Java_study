package src.Homework;

import java.util.Random;
import java.util.Scanner;

public class homework25 {
    public static void main(String[] args) throws InterruptedException {
        Test111 test = new Test111();
        test.setDaemon(true);

        test.start();

        boolean choice = true;
        while (choice){
            char c = new Scanner(System.in).next().charAt(0);
            if(c == 'Q')
                choice = false;
        }
    }
}

class Test111 extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(new Random().nextInt(100));
        }
    }
}