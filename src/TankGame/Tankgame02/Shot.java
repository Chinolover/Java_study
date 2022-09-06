package TankGame.Tankgame02;

public class Shot implements Runnable{
    int x;
    int y;
    int direct = 0; //子弹初始化方向
    int speed = 2;

    boolean isLive = true;  //后期添加，确定子弹线程是否存活

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {     //射击行为
        while (true){
            //休眠50ms ,否则子弹没有动态效果
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //根据方向来改变x,y坐标
            switch (direct) {       //试用增强switch，貌似不需要break
                case 0 ->//上
                        y -= speed;
                case 1 ->//右
                        x += speed;
                case 2 ->//下
                        y += speed;
                case 3 ->//左
                        x -= speed;
            }

            //如果子弹超出面板，销毁子弹，线程销毁
            if(!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)){
                isLive = false;
                break;
            }
        }
    }
}
