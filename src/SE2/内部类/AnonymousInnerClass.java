package SE2.内部类;
//匿名内部类，极其重要
//基于接口的匿名内部类
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();


    }
}
/*
1.传统方式，是写一个类，实现该接口，并创建对象
2.匿名内部类可以做到只使用一次，后面不再使用，算是一种特殊需求时的内部优化，简化开发
 */
interface IA{
    void cry();
}

//正常实现
class Tiger implements IA{
    @Override
    public void cry() {
        System.out.println("老虎笑了....");
    }
}

class Outer{
    public void method(){

        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎笑了....匿名内部类");
            }
        };//这里要加分号

        IA tiger2 = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎笑了....匿名内部类");
            }
        };//这里要加分号
        tiger.cry();
        tiger.cry();//创建的对象可以无线调用
        System.out.println(tiger.getClass());
        System.out.println(tiger2.getClass());
        //这里输出后我们发现匿名内部类实际上是有名字的，名字为包含类名+$+该大类中创建内部类的个数
        //tiger类名为Outer$1
        //tiger2类名为Outer$2
    }


}