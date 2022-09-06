package SE2;
/*
final可以修饰类、属性、方法和局部变量
使用：1.当不希望类被继承时，可以使用final修饰
    2.当不希望父类的某个方法被子类覆盖或重写时，可以用final修饰
    3.当不希望类的某个属性值被修改，可以用final修饰
    4.当不希望某个局部变量被修改，可以用final修饰
*/
/*
final注意 :1.一般用XX_XX_XX来命名
2.final修饰的属性在定义时必须赋初值，并且不能再修改，赋值可以在一下位置
①定义时直接赋值
②在构造器中
③在代码块中
3.如果final修饰的属性是静态的，则初始化的位置只能是定义时和静态代码块中
4.final不能修饰构造方法
5.final和static往往搭配使用，效率更高，不会导致类加载，底层编译器做了优化处理
6.包装类（Integer，Double，Float，Boolean，String都是final类）
*/

public class Final {
    public static void main(String[] args) {
        System.out.println(ST.MAX_INT);
    }
}
//我们这里发现如果把final去掉，这里调用值就会出现类的加载，就会调用代码块，而存在final就可以直接调用
class ST{
    public final static int MAX_INT=1000;
    public ST(){
        System.out.println("构造器");
    }
    static {
        System.out.println("代码块");
    }
}