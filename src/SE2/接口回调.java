package SE2;

public class 接口回调 {
    public static void main(String[] args) {
        Son1 son1 = new Son1();
        Son2 son2 = new Son2();
        Son3 son3 = new Son3();
        deal(son1);
        deal(son2);
        deal(son3); //接口回调
    }
    public static void deal(Father father){
        father.SB();
    }
}

interface Father{
    void SB();
}



class Son1 implements Father{
    @Override
    public void SB() {
        System.out.println("大儿子");
    }
}

class Son2 implements Father{
    @Override
    public void SB() {
        System.out.println("二儿子");
    }
}

class Son3 implements Father{
    @Override
    public void SB() {
        System.out.println("三儿子");
    }
}