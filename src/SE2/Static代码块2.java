package SE2;

public class Static代码块2 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
    }
}
/*构造函数{
super();
代码块
}
*/
//先调用父类静态代码块后调用子类静态代码块，且代码块和静态初始化优先度相同，只取决于先后，后调用父类构造器，最后到子类
class AAA{
    static private int a = geta();
    static {
        System.out.println("AAA代码块被调用");
    }

    static int geta(){
        System.out.println("geta被调用");
        return 30;
    }

    public AAA() {
        System.out.println("AAA构造函数被调用");
    }
}

class BBB extends AAA{
    static private int b = getb();
    static {
        System.out.println("BBB代码块被调用");
    }

    static int getb(){
        System.out.println("getb被调用");
        return 30;
    }

    public BBB() {
        System.out.println("BBB构造函数被调用");
    }
}