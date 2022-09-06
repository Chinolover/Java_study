package TankGame.Thread_;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        /*
        yield:线程的礼让。让出CPU，让其他线程执行，但礼让的时间不确定，所以不一定礼让成功，
        也许CPU认为资源充足，则礼让会失败，取决于底层操作系统

        join:线程的插队，不会失败，插队的线程一旦插队成功，则肯定先执行完插入的线程所有的任务
         */
        Test01 test01 = new Test01();
        Thread t0 = new Thread(test01);
        t0.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("hi" + i);
            Thread.sleep(1000);
            if (i == 4)
                t0.join();  //这里直接让子线程插队
        }
    }
}

class Test01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("hello" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
