package EE.Generic;

public class Generic06 {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.runM("wxh",99.3);
        fish.runM(3,true);
    }
}

class Fish{
    //泛型方法
    public<T,R> void runM(T t,R r){
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}