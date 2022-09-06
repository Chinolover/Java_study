package TankGame.Tankgame02;

import java.util.Vector;

public class OwnTank extends Tank {
    Shot shot = null;   //这里为了体现面向对象，我们将射击归为坦克行为
    Vector<Shot> shots = new Vector<>();

    public OwnTank(int x, int y) {
        super(x, y);
    }

    public void fireShot() {

        //面板上中最多发射5颗
        if (shots.size() == 5) {
            return;
        }

        switch (getDirect()){
            case 0->    //向上
                    shot = new Shot(getX() + 20 , getY() , 0);
            case 1->    //向右
                    shot = new Shot(getX() + 60 , getY()+20 ,1);
            case 2->    //向下
                    shot = new Shot(getX() + 20 , getY()+60 ,2);
            case 3->    //向左
                    shot = new Shot(getX() , getY()+20 ,3 );
        }

        shots.add(shot);
        //启动Shot线程
        new Thread(shot).start();
    }
}
