package TankGame.Thread_;

import java.util.concurrent.ThreadPoolExecutor;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.setName 设置线程名称，使之与参数name相同
        2.getName 返回线程名称
        3.start 执行线程，java虚拟机底层调用该线程的start()方法
        4.run 调用线程对象run方法，但不会启动新线程
        5.setPriority 更改线程的优先级
        6.getPriority 获取线程的优先级
        7.sleep 在指定的毫秒数内让当前正在执行的线程休眠
        8.interrupt 中断线程：并没有真正的结束线程，！！所以一般用于中断正在休眠线程
         */
        E e = new E();
        e.setName("wxh");   //设置线程名称
        e.setPriority(Thread.MIN_PRIORITY); //线程优先级设置为最小

        e.start();
        System.out.println(e.getName() + "线程的优先级为" + e.getPriority());    //获取线程名称


        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }
        e.interrupt();  //中断休眠，提前结束休眠
    }
}

class E extends Thread{
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子~~" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中~~~~");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                //当线程执行到一个interrupt方法时，就会catch一个异常，可以加入自己的业务逻辑
                //InterruptedException是捕获到一个中断信号
                System.out.println(Thread.currentThread().getName() + "被interrupt了");
            }
        }
    }
}
