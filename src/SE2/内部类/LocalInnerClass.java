package SE2.内部类;


//局部内部类
public class LocalInnerClass {
    public static void main(String[] args) {
        LocalInner localInner = new LocalInner();
        localInner.inner.show();
    }
}

class LocalInner{
    private double PAI = 3.14;
    void print(){}

    protected class INNER{
        int n2 =30;
        double PAI =20;
        public void show(){
            System.out.println(PAI);
            System.out.println(new LocalInner().PAI);

            print();
        }
    }
    INNER inner = new INNER();
}