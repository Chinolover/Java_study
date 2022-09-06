
package SE2;

//在JDK7.0之前，接口所有方法都不能有方法体，即都是抽象方法
//8.0后接口可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现
public class Interface2 {
}

interface test{
    public int a = 1;
    default public void tend(){
        System.out.println("接口中实现方法");
    }
    //如果不写default，后期需要对所以实现test接口的类均重写tend方法，加入default就可以根据自己选择重写或不重写
    public static void sour(){
        System.out.println("实现静态方法");
    }
}
