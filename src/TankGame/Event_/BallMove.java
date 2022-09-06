package TankGame.Event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{
    Mypanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove(){
        mp = new Mypanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//监听器
class Mypanel extends JPanel implements KeyListener {

    int x=10 , y=10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);    //默认黑色
    }

    //有字符输出就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键按下，该方法会触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char)e.getKeyCode() + "被按下");

        //java中，会给每一个键，分配一个(int)
        if(e.getKeyCode() == KeyEvent.VK_DOWN){ //KeyEvent.VK_DOWN这个就是小键盘↓键
            y++;
        } else if(e.getKeyCode() == KeyEvent.VK_UP){
            y--;
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }



        //面板重绘
        this.repaint();
    }

    //当某个键释放，该方法会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}