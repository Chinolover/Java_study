package SE2;

public class Abstract {
    public static void main(String[] args) {

    }
}
/*
抽象方法不能定义为static，final，private，因为这与抽象方法相违背
抽象方法在继承后可以实现也可以继续继承为抽象类
*/
abstract class Animal{
    private String name;
    //假如这里动物要吃东西，但是不知道要吃什么，需要子类给出东西，就需要用到抽象类
    public abstract void eat();
    //注意：方法为抽象方法时，不能存在方法体，且类必须也为抽象类
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
}