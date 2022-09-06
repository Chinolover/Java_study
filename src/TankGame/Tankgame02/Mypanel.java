package TankGame.Tankgame02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

@SuppressWarnings({"all"})
public class Mypanel extends JPanel implements KeyListener,Runnable {
    //定义自己的坦克
    OwnTank ownTank = null;
    //定义敌人坦克,放入Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //Vector存放炸弹
    //当子弹击中，加入bomb对象
    Vector<Bomb> bombs = new Vector<>();
    int enemyTanksSize = 3;


    //定义三张炸弹图片
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public Mypanel() {
        Recorder.setEnemyTanks(enemyTanks);
        ownTank = new OwnTank(500,100); //初始化自己坦克
        ownTank.setSpeed(2);

        for (int i = 0; i < enemyTanksSize ; i++) {
            EnemyTank enemyTank = new EnemyTank(100*(i+1),0);
            //将enemyTanks传给每个enemyTank
            enemyTank.setEnemyTanks(enemyTanks);
            enemyTank.setDirect(2);
            new Thread(enemyTank).start();
            //加入子弹
            Shot shot = new Shot(enemyTank.getX() + 20 ,enemyTank.getY() + 60, enemyTank.getDirect());
            enemyTank.shots.add(shot);
            //启动Shot对象
            new Thread(shot).start();
            //添加敌人坦克进集合

            enemyTanks.add(enemyTank);
        }
        image1 = Toolkit.getDefaultToolkit().getImage(Mypanel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Mypanel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Mypanel.class.getResource("/bomb_3.gif"));

        new AePlayWave("src\\111.wav").start();
//          image1 = new ImageIcon("/bomb_1.gif").getImage();
//          image2 = new ImageIcon("/bomb_2.gif").getImage();
//          image3 = new ImageIcon("/bomb_3.gif").getImage();
    }

    public void showInfo(Graphics g){
        //画出玩家的总成绩
        g.setColor(Color.BLACK);
        Font font = new Font("宋体",Font.BOLD,25);
        g.setFont(font);

        g.drawString("您累计击毁敌方坦克",1020,30);
        drawTank(1020,60,g,0,0);
        g.setColor(Color.BLACK);
        g.drawString(String.valueOf(Recorder.getAllEnemyTankNum()),1080,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);    //填充矩形，默认黑色

        showInfo(g);
        if(ownTank.isLive && ownTank!=null){
        drawTank(ownTank.getX(),ownTank.getY(),g,ownTank.getDirect(),1);
        }
        for (int i = 0; i < enemyTanksSize; i++) {

            if(enemyTanks.get(i).isLive==true){
            drawTank(enemyTanks.get(i).getX(),enemyTanks.get(i).getY(),g,enemyTanks.get(i).getDirect(),0);

            for (int j = 0; j < enemyTanks.get(i).shots.size(); j++) {  //遍历坦克子弹
                Shot shot = enemyTanks.get(i).shots.get(j);
                if(shot.isLive){
                    g.fillOval(shot.x-2,shot.y-2,5,5);
                }
                else
                    enemyTanks.get(i).shots.remove(shot);
            }
        }


    }
        //画子弹
//        if(ownTank.shot != null && ownTank.shot.isLive == true){
//            g.setColor(Color.white);
//            g.fillOval(ownTank.shot.x-2,ownTank.shot.y-2,5,5);
//        }
        for (int i = 0; i < ownTank.shots.size(); i++) {
            Shot shot = ownTank.shots.get(i);
            if(shot != null && shot.isLive == true){
            g.setColor(Color.white);
            g.fillOval(shot.x-2,shot.y-2,5,5);
        }else
            ownTank.shots.remove(shot);
        }

        //如果bombs中有对象就画出
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if(bomb.life > 6)
                g.drawImage(image1,bomb.x,bomb.y,60,60,this);
            else if(bomb.life >3)
                g.drawImage(image2,bomb.x,bomb.y,60,60,this);
            else{
                g.drawImage(image3,bomb.x,bomb.y,60,60,this);
            }
            try {
                bomb.lifeDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (bomb.life == 0){
                bombs.remove(bomb);
            }
        }
    }
    //判断敌方子弹是否击中函数
    public void hitOwnTank(){
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                //取出子弹
                Shot shot = enemyTank.shots.get(j);
                if(ownTank.isLive && shot.isLive){
                    switch (ownTank.getDirect()){
                        case 0:     //注意这里没有加break，相当于case0和case2相同
                        case 2:
                            if(shot.x > ownTank.getX() && shot.x < ownTank.getX() + 40
                                    && shot.y > ownTank.getY() && shot.y <ownTank.getY()+ 60){
                                shot.isLive = false;
                                ownTank.isLive = false;
                                //创建bomb对象，加入集合
                                Bomb bomb = new Bomb(ownTank.getX(),ownTank.getY());
                                bombs.add(bomb);
                            }
                            break;
                        case 1:
                        case 3:
                            if (shot.x > ownTank.getX() && shot.x < ownTank.getX() + 60
                                    && shot.y > ownTank.getY() && shot.y < ownTank.getY() + 40){
                                shot.isLive = false;
                                ownTank.isLive = false;
                                Bomb bomb = new Bomb(ownTank.getX(),ownTank.getY());
                                bombs.add(bomb);
                            }
                            break;
                    }
                }
            }
        }
    }

    //判断我方子弹是否击中函数
    public void hitTank(Shot s , EnemyTank enemyTank){
        switch (enemyTank.getDirect()){
            case 0:     //注意这里没有加break，相当于case0和case2相同
            case 2:
                if(s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                && s.y > enemyTank.getY() && s.y < enemyTank.getY()+ 60){
                    Recorder.setAllEnemyTankNum();
                    enemyTanksSize--;   //这里如果不减，在重绘get时会出现查找越界
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                    //创建bomb对象，加入集合
                    Bomb bomb = new Bomb(enemyTank.getX(),enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1:
            case 3:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40){
                    Recorder.setAllEnemyTankNum();
                    enemyTanksSize--;
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                    Bomb bomb = new Bomb(enemyTank.getX(),enemyTank.getY());
                    bombs.add(bomb);
                } 
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void run() { //如果这里不写成线程，会出现子弹发射不动的情况，因为坦克移动才会重绘，创先一个线程，让子弹移动时也会重绘
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //判断是否击中敌方坦克
            for (int i = 0; i < ownTank.shots.size(); i++) {
                Shot shot = ownTank.shots.get(i);
                if(shot!=null && shot.isLive == true){
                    for (int j = 0; j < enemyTanks.size() ; j++) {
                        EnemyTank enemyTank = enemyTanks.get(j);
                        hitTank(shot,enemyTank);
                    }
                }
            }
            hitOwnTank();
            this.repaint();
        }
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

        if(e.getKeyCode() == KeyEvent.VK_J && ownTank.isLive){
//            if(ownTank.shot == null || ownTank.shot.isLive==false)  //添加新需求，只有第一颗子弹消亡，才能打下一颗
//            ownTank.fireShot();
            ownTank.fireShot();
        }
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
            case 0: //敌人的坦克
                g.setColor(Color.cyan);
                break;
            case 1: //我们的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制坦克
        switch (direct) {
            case 0 -> { //向上
                g.fill3DRect(x, y, 10, 60, false);  //画出左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);   //画出右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);    //画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);    //画盖子
                g.drawLine(x + 20, y, x + 20, y + 30);   //炮筒
            }
            case 1 -> { //向右
                g.fill3DRect(x, y, 60, 10, false);  //画出左边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);   //画出右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);    //画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);    //画盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);   //炮筒
            }
            case 2 -> { //向下
                g.fill3DRect(x, y, 10, 60, false);  //画出左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);   //画出右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);    //画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);    //画盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);   //炮筒
            }
            case 3 -> { //向左
                g.fill3DRect(x, y, 60, 10, false);  //画出左边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);   //画出右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);    //画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);    //画盖子
                g.drawLine(x, y + 20, x + 30, y + 20);   //炮筒
            }
            default -> System.out.println("暂时没有处理");
        }
    }

}
