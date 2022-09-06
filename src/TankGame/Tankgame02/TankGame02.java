package TankGame.Tankgame02;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankGame02 extends JFrame {

    //定义Mypanel
    Mypanel mp =null;
    public static void main(String[] args) {
        new TankGame02();
    }

    public TankGame02(){
        mp = new Mypanel();

        Thread thread01 = new Thread(mp);
        thread01.start();
        this.add(mp);
        this.setSize(1300,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.KeepRecord();
                System.exit(0);
            }
        });
    }
}
