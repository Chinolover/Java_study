package SE2.内部类;

public class AnonymousInnerClass2 {
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }
}
class Test {
    void test(){
        new Father("wxh"){
            public void print(){
                System.out.println("匿名内部类");
            }
        }.print();
//        Father father = new Father("libai");
//        Father father = new Father("libai"){};
        //区别这两种，一种是创建普通的类，另一种是创建匿名内部类
        }
    }


class Father{
    private String name;
    public Father(String name) {
        this.name = name;
    }
    public void print(){

    }
}