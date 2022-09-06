package EE.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception3 {
    public static void main(String[] args) {

    }
}

class Father{
    public void method() throws RuntimeException{
        System.out.println("TTT");
    }
}
//throws后面的异常类型可以是方法中产生的异常类型，也可以是它的父类
//throws关键字也可以是异常列表，即可以抛出多个异常
class Son extends Father{
    @Override
    public void method() throws NumberFormatException,ArrayIndexOutOfBoundsException {
        super.method();
    }
}

class test123{
    public static void f3() throws FileNotFoundException {
        f2();//编译时异常必须处理，所以这里报错
    }
    public static void f2() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
    public static void f4(){
        f5();//运行时异常并不要求程序员显示处理，因为有默认处理机制
    }
    public static void f5() throws RuntimeException{

    }
}