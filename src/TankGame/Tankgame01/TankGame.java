package TankGame.Tankgame01;

import javax.swing.*;

public class TankGame extends JFrame {

    //定义Mypanel
    Mypanel mp =null;
    public static void main(String[] args) {
        new TankGame();
    }

    public TankGame(){
        mp = new Mypanel();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
