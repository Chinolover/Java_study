package TankGame.Tankgame01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Mypanel extends JPanel implements KeyListener {
    //定义自己的坦克
    OwnTank ownTank = null;
    public Mypanel() {
        ownTank = new OwnTank(100,100); //初始化自己坦克
        ownTank.setSpeed(2);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);    //填充矩形，默认黑色

        drawTank(ownTank.getX(),ownTank.getY(),g,ownTank.getDirect(),1);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){
            ownTank.setDirect(0);
            ownTank.moveUp();
        }else if(e.getKeyCode() == KeyEvent.VK_D){
            ownTank.setDirect(1);
            ownTank.moveRight();
        }else if(e.getKeyCode() == KeyEvent.VK_S){
            ownTank.setDirect(2);
            ownTank.moveDown();
        }else if(e.getKeyCode() == KeyEvent.VK_A){
            ownTank.setDirect(3);
            ownTank.moveLeft();
        }

        if( ownTank.getX() > 1000 || ownTank.getX()<0 || ownTank.getY()<0 || ownTank.getY()>750){
            ownTank.setX(100);
            ownTank.setY(100);
        }   //设置墙壁

        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    /**
     *
     * @param x 坦克左上角x坐标
     * @param y 坦克左上角y坐标
     * @param g 画笔
     * @param direct 坦克方向(上下左右)
     * @param type 坦克类型
     */
    public void drawTank(int x,int y,Graphics g,int direct,int type){

        switch (type){
            case 0: //我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1: //敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制坦克
        switch (direct){
            case 0: //向上
                g.fill3DRect(x,y,10,60,false);  //画出左边轮子
                g.fill3DRect(x+30,y,10,60,false);   //画出右边轮子
                g.fill3DRect(x+10,y+10,20,40,false);    //画出坦克盖子
                g.fillOval(x+10,y+20,20,20);    //画盖子
                g.drawLine(x+20,y,x+20,y+30);   //炮筒
                break;
            case 1: //向右
                g.fill3DRect(x,y,60,10,false);  //画出左边轮子
                g.fill3DRect(x,y+30,60,10,false);   //画出右边轮子
                g.fill3DRect(x+10,y+10,40,20,false);    //画出坦克盖子
                g.fillOval(x+20,y+10,20,20);    //画盖子
                g.drawLine(x+30,y+20,x+60,y+20);   //炮筒
                break;
            case 2: //向下
                g.fill3DRect(x,y,10,60,false);  //画出左边轮子
                g.fill3DRect(x+30,y,10,60,false);   //画出右边轮子
                g.fill3DRect(x+10,y+10,20,40,false);    //画出坦克盖子
                g.fillOval(x+10,y+20,20,20);    //画盖子
                g.drawLine(x+20,y+30,x+20,y+60);   //炮筒
                break;
            case 3: //向左
                g.fill3DRect(x,y,60,10,false);  //画出左边轮子
                g.fill3DRect(x,y+30,60,10,false);   //画出右边轮子
                g.fill3DRect(x+10,y+10,40,20,false);    //画出坦克盖子
                g.fillOval(x+20,y+10,20,20);    //画盖子
                g.drawLine(x,y+20,x+30,y+20);   //炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }


    }
}
