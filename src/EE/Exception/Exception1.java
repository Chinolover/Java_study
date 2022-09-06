package EE.Exception;

//    异常分为运行时异常和编译时异常


/*
    常见运行异常：
    1.NullPointerException空指针异常
    2.ArithmeticException数字运算异常
    3.ArrayIndexOutOfBoundsException数组下标越界异常
    4.ClassCastException类型转换异常
    5.NumberFormatException数字格式不正确异常

    常见编译异常：
    1.SQLException操作数据库时查询表可能发生异常
    2.IOException操作文件时发生的异常
    3.FileNotFoundException当操作一个不存在的文件时，发生异常
    4.ClassNotFoundException加载类，而该类不存在时，异常
    5.EOFException操作文件时，到文件末尾，发生异常
    6.IllegalArgumentException参数异常

 */


public class Exception1 {
    public static void main(String[] args) {
        /*
        异常处理方式：
        1.try-catch-finally 捕获异常并自行处理
        2.throws 将发生的异常抛出，交给调用者处理，最顶级的调用者就是JVM
         */

        try{
            //代码可能有异常
        }catch (Exception e){
            //系统将异常封装成Exception对象e，传递给catch，然后交给程序员自行处理
        }finally {
            //不管try代码块是否有异常发生，始终要执行finally，一般将释放资源的代码放在finally里
        }

    }
}


