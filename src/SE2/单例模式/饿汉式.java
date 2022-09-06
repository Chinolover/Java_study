package SE2.单例模式;

//饿汉式在加载时创建对象
public class 饿汉式 {
    public static void main(String[] args) {


    }
}

class Girlfriend{
/*如何保障我们只能创建一个Girlfriend对象
    1.将构造器私有化
    2.在类的内部直接创建对象(对象为static)
    3.提供一个公共的static方法，返回那个对象

 */
    private String name;

    private static Girlfriend gf = new Girlfriend("lcl");

    private Girlfriend(String name){
        this.name = name;
    }

    public static Girlfriend GetInstance(){
        return gf;
    }
}