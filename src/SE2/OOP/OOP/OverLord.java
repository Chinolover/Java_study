package SE2.OOP.OOP;

public class OverLord {
    public static void main(String[] args) {

        Methods be = new Methods();
        be.m(3);
        be.m(3,5);
        be.m("How are you");
        System.out.println(be.sum(1,2,3,4,5,6,7,8));
}}

class Methods{
    //可变参数，nums可以当做数组
    public int sum(int... nums){
        int sums=0;
        for(int a:nums)
            sums=sums+a;
        return sums;
    }
    //可变参数也可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
    //eg. public void f2(String str,double... nums)
    //一个形参列表只能有一个可变参数
    public void m(int a) {
        System.out.println(a * a);
    }

    public void m(int a,int b){
        System.out.println(a*b);
    }

    public void m(String text){
        System.out.println(text);
    }

}