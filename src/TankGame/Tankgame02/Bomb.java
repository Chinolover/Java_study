package TankGame.Tankgame02;

public class Bomb {     //爆炸效果
    public int x;
    public int y;//爆炸坐标
    public int life = 9;//爆炸生命周期
    public boolean isLife = true;//是否还存活

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void lifeDown() throws InterruptedException { //生命值减少
        if(life > 0){
            Thread.sleep(5);
            life--;
        }
        else
            isLife = false;
    }
}
