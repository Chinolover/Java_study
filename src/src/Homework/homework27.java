package src.Homework;

public class homework27 {
    public static void main(String[] args) {
        PersonQU personQU = new PersonQU();
        Thread thread01 = new Thread(personQU);
        Thread thread02 = new Thread(personQU);

        thread01.start();
        thread02.start();
    }
}

class PersonQU implements Runnable{
    private static int money = 10000;

    @Override
    public /*synchronized*/ void run() {
        while (money > 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                if (money > 0) {
                    money = money - 1000;
                    System.out.println("取款1000 剩余" + money);
                }
            }
        }
    }
}
