package EE;

import org.junit.jupiter.api.Test;

public class Junit_ {
    public static void main(String[] args) {
        //调试方便使用Junit，不使用的话还需要将方法在main方法中调用，较为麻烦
        new Junit_().print();   //麻烦
    }
    @Test
    public void print(){
        System.out.println("窝嫩叠窝嫩叠");
    }

    //输入@Test，之后alt+enter添加Junit的依赖包
    @Test
    public void print1(){
        System.out.println("哇！好方便,旺仔牛奶QQ糖");
    }
    //直接点击右边的小箭头既可直接调用方法
}

