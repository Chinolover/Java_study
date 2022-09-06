package TankGame.Tankgame02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

//该类记录相关信息，与文件交互
public class Recorder {

    //击毁敌人坦克数量
    private static int allEnemyTankNum = 0;

    //定义IO
    private static BufferedWriter bw = null;
    private static String recordFile = "src\\MyRecord.txt";
    private static Vector<EnemyTank> enemyTanks = null;

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks){
        Recorder.enemyTanks = enemyTanks;
    }

    //当游戏退出时，将allEnemyTankNum存入文件
    //升级后，保存敌人坦克的位置和方向
    public static void KeepRecord(){
        try {
            File file = new File(recordFile);
            file.createNewFile();
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum + "\r\n");

            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive){
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect();
                    bw.write(record);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw!=null)
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }
}
