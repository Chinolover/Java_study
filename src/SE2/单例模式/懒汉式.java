package SE2.单例模式;

//懒汉式在使用时创建对象
public class 懒汉式 {
    public static void main(String[] args) {
        Cat lcl =Cat.getInstance();
    }
}

class Cat{
    private String name;

    private static Cat cat; //默认为null

    private Cat(String name){
        this.name=name;
    }

    public static Cat getInstance(){
        if(cat==null)
            cat = new Cat("lcl");
        return cat;
    }
}