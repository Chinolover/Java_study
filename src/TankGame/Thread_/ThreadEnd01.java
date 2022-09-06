package TankGame.Thread_;

//线程终止有两种方式：
//1.当线程完成任务后，会自动退出
//2.还可以通过使用变量来控制run方法退出的方式停止线程，即通知方式
public class ThreadEnd01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();

        Thread.sleep(10000);    //主线程休眠10s后，退出t线程
        t.setLoop(false);
    }
}

class T extends Thread{
    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T运行中");
        }
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}