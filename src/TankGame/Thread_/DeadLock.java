package TankGame.Thread_;

import java.text.DecimalFormat;

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        //模拟死锁
        DeadLockDemo A = new DeadLockDemo(true);
        DeadLockDemo B = new DeadLockDemo(false);
        A.start();
        B.start();
    }
}

class DeadLockDemo extends Thread{
    static Object o1 = new Object();    //这里必须设置静态的，如果不是静态的，新建AB对象用的都是各自的o1和o2，就不会死锁了
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag){
            synchronized (o1){  //对象互斥锁，只有拿到o1资源才会进行下去
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        }else {
            synchronized (o2){
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}