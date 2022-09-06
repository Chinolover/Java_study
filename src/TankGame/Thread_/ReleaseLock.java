package TankGame.Thread_;

/*
    以下情况会释放锁：
    1.当前线程的同步方法、同步代码块执行结束
    2.当前线程在同步代码块、同步方法中遇到break、return
    3.当前线程在同步代码块、同步方法中出现了未处理的Error或Exception，导致异常结束
    4.当前线程在同步代码块、同步方法中执行了线程对象的wait()方法，当前线程暂停，并释放锁
 */

/*
    以下情况不会释放锁：
    1.程序调用Thread.sleep()、Thread.yield()方法暂停线程，不会释放锁
    2.线程执行同步代码块时，其他线程调用了该线程的suspend()方法将该线程挂起，该线程不会释放锁
 */
public class ReleaseLock {
    public static void main(String[] args) {

    }
}
