package TankGame.Thread_;

//实现多线程两种方式：继承Thread or 实现Runnable接口
public class ThreadStart01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();    //程序执行到这里并不会等到结束再往下执行，区别run方法，run方法是串行化方法

        //主线程的提前结束并不会导致其他线程的结束
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程" + i);
            Thread.sleep(1000);
        }
        //可以在终端通过jconsole监控线程

    }
}
/*
1.当一个类继承了Thread类，该类就可以当线程使用
2.我们会重写run方法，实现自己的业务逻辑
 */
class Cat extends Thread{

    int times = 0;

    @Override
    public void run() {
        while(true){
            System.out.println("窝嫩叠" + (++times) + "线程名=" + Thread.currentThread().getName());

            try{
                Thread.sleep(1000);     //1s
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            if(times == 80){
                break;
            }
        }
    }
}
