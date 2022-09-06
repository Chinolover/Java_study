package SE2.内部类;

//匿名内部类作为实参直接传递
public class AnnoumousInnerClass3 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一头花花猪");
            }
        });
    }

    public static void f1(IL il){
        il.show();
    }

}

interface IL{
    void show();
}