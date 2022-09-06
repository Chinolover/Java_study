package TankGame.Thread_;

//用户线程：也叫工作线程，当线程的任务执行完或通知方式结束
//守护线程：一般是为工作线程服务的，当所有的用户线程结束，守护线程自动结束

//垃圾回收机制就是守护线程
public class Daemonthread_and_userthread {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //如果我们希望当主线程结束后，子线程可以自己退出。
        //我们只需将子线程设置为守护线程
        myDaemonThread.setDaemon(true);

        myDaemonThread.start();//这里我们发现，如果不设置守护线程，主线程结束了，子线程依然还在继续


        for (int i = 1; i <= 10; i++) {
            System.out.println("我尼玛~~~~~");
            Thread.sleep(1000);
        }

    }
}

class MyDaemonThread extends Thread{
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("鸡汤来咯~~~~~");
        }
    }
}