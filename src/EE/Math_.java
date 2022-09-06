package EE;

public class Math_ {
    public static void main(String[] args) {
        //Math常用方法
        int abs = Math.abs(-9);//绝对值
        System.out.println(abs);

        double pow = Math.pow(2,3);//求幂
        System.out.println(pow);

        double ceil = Math.ceil(-3.001); //向上取整，返回>=该参数的最小整数
        System.out.println(ceil);

        double floor = Math.floor(-4.999);//向下取整，返回<=该参数的最大整数
        System.out.println(floor);

        long round = Math.round(3.9);   //四舍五入
        System.out.println(round);

        double sqrt = Math.sqrt(9.0);   //开方
        System.out.println(sqrt);

        System.out.println(Math.random());  //返回一个0-1的随机小数
        //获取一个 a-b之前的随机整数
        //公式： int num = (Math.random()*(b-a+1)+a)
    }
}
