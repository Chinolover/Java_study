package SE2.内部类;

//成员内部类
public class MemberInnerClass1 {
    public static void main(String[] args) {

        Outer08 outer08 = new Outer08();
        Outer08.Inner08 inner08 = outer08.new Inner08(); //成员内部类的外部创建方法


        new Outer08(){}.new Inner08(){  //这波胡乱试的，发现可以这样调用
            @Override
            public void say() {
                System.out.println("这波属实是辗转反侧,外部调用成员内部匿名类");
            }
        }.say();


    }
}

class Outer08{
    private int n1 = 10;
    private String name = "刘琮琳";

    class Inner08{//成员内部类
        public void say(){
            System.out.println(name+n1);
        }
    }


    void pt(){
        new Inner08().say();
    }
}