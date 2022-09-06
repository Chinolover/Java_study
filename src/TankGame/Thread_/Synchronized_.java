package TankGame.Thread_;
//同步的局限性：导致程序的执行效率要降低

//同步方法（非静态）的锁可以是this，也可以是其他对象（要求是同一对象）
//同步方法（静态）的锁为当前类本身
//加锁(非公平锁)

/*
    使用方法：
    1.同步代码块
    synchronized(对象){   得到对象的锁，才能操作同步代码
        //需要被同步的代码;
    {

    2.synchronized还可以放在方法声明中，表示整个方法为同步方法
        public synchronized void m(){
        //需要被同步的代码;
       }
 */

//线程同步，即当有一个线程在对内存进行操作时，其他线程都不可以对这个内存地址进行操作，直到该线程完成操作
//其他线程才能对该内存地址进行操作
public class Synchronized_ {
    public  static int inc = 0;

    public /*synchronized*/ void increase(){ //这里如果不添加synchronized关键字我们会发现，计算的最终结果并不准确
        //因为在叠加时，会发生线程抢夺，比如 inc = 3 ,两个线程同时收到，+1后变为4，将返回值赋给inc，导致
        //只叠加了一次，所以会出现。但是一旦加入关键字，就会确保线程安全，任何时刻只能有一个线程访问
        synchronized (this) {
            inc++;
        }   //也可以写成代码块
    }
    //静态方法中实现同步：

    //①  public synchronized static void m2(){
    public static void m2(){
        synchronized (Synchronized_.class) {    //也可以写成静态代码块，静态代码块的锁为当前类本身
            System.out.println("窝嫩叠");  //如果在静态方法中
        }
    }

    public static void main(String[] args) {
        Synchronized_ test = new Synchronized_();
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    test.increase();
                    System.out.println(test.inc);
                }
            }).start();
        }
    }
}
