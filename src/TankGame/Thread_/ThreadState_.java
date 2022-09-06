package TankGame.Thread_;

public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        U u = new U();
        System.out.println(u.getName() + "状态" + u.getState());
        u.start();

        while (Thread.State.TERMINATED != u.getState()){
            System.out.println(u.getName() + "状态" + u.getState());
            Thread.sleep(1000);
        }

    }
}

class U extends Thread{
    @Override
    public void run() {
        while (true){
            for (int i = 0; i < 10; i++) {
                System.out.println("hi" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}