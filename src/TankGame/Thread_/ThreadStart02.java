package TankGame.Thread_;

//java是单继承，所以如果已经继承但又想实现多线程就可以实现Runnable接口

//实现Runnable接口方式更适合多个线程共享一个资源的情况，并且避免了单继承的限制
public class ThreadStart02 {
    public static void main(String[] args) {
        Dog lcl = new Dog();
        Catt wxh = new Catt();
        //这里没有start方法，无法实现，所以需要.....
        Thread t0 = new Thread(lcl);
        t0.start();//通过这种方式实现，底层使用了【代理模式】（设计模式）
        wxh.start();
    }
}

class Dog implements Runnable{
    int count = 0;

    @Override
    public void run() {
        while (true){
            System.out.println("刘琮琳的第" + (count++) +"个孩子出生啦！"+ Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(count == 20)
                break;
        }
    }
}

class Catt extends Thread{
    int count = 0;

    @Override
    public void run() {
        while (true){
            System.out.println("王兴华的第" + (count++) +"个孩子出生啦！"+ Thread.currentThread().getName());

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(count == 20)
                break;
        }
    }
}
