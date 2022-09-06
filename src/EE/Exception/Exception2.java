package EE.Exception;

public class Exception2 {
    public static void main(String[] args) {
        //ctrl + atl + t
        try {
            String str ="xyz";
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("error" + e.getMessage());
        }finally {
            System.out.println("finally执行");
        }
        //如果对一段代码的多个异常，可以使用多个catch分别捕获不同的异常，相应处理
        //要求子类异常写在前面，父类异常写在后面


        //也可以进行try-catch使用，这种相当于不捕获异常，程序会直接崩掉，应用于不管是否异常，都必须执行某个业务逻辑
        try{

        }finally {
            System.out.println("...");
        }

    }
}
