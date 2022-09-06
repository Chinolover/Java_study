package EE.Exception;
//自定义异常
/*
* 1.定义类：自定义异常类名继承Exception或RuntimeException
* 2.如果继承Exception，属于编译异常
* 3.如果继承RuntimeException，属于运行异常(一般来说继承RuntimeException)
* */
//          意义                      位置              后面跟的东西
//throws   异常处理的一种方式          方法声明处            异常类型
//throw    手动生成异常对象的关键字     方法体中              异常对象


public class Exception4 {
    public static void main(String[] args) {

        int age = 12;
        if(age<=18 | age>=120){
            throw new AgeException("年龄错误");
        }
        System.out.println("年龄正确");
    }
}

class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}

