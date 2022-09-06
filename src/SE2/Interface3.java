/*
1.接口中所有方法是public方法，接口中抽象方法可以不用abstract修饰
2.抽象类实现接口，可以不用实现接口的方法
3.一个类同时可以实现多个接口
4.接口中的属性只能是final的，而且是public static final修饰符。
5.接口中属性访问：接口名.属性名
6.一个接口可以继承多个别的接口
7.接口的修饰符只能是public和默认
*/

package SE2;

public class Interface3 {
    public static void main(String[] args) {
        System.out.println(test3.a);
    }
}

interface test3 extends test1,test2{

}

interface test1{
    int a = 1;
    public void pr();
}

interface test2 {
    public void sc();
}
