package SE1;

public class Radix {
    public static void main(String[] args) {
/*        1.二进制，满二进一，以0b或0B开头
        2.十进制，懂得都懂
        3.八进制，0-7，满8进1，以数字0开头表示
        4.十六进制，0-9及A(10)-F(15),满16进1，以0x或0X开头表示  */
   int n1=0b1010;
   int n2=1010;
   int n3=01010;
   int n4=0x101AB01;

        //二进制转8进制每三位一组，2进制转16进制每4位一组
        //八进制转2进制将每一个数转化为3位，16进制转2每一个数转4位
        System.out.println(2&3);

    }
}
