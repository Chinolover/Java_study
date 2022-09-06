package SE1;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class Mathtype {
    public static void main(String[] args){
        int a=30 , b=40;
        System.out.println( a + "\t" + "love you" );
        System.out.println( a + b);
        //+用法：拼接和相加，当相加出现一个字符类型，则为拼接

    /*  byte[1],short[2],int[4],long[8],float[4],double[8],char[2]
        boolean[1]
        计算机最小类型为bit ，  1 byte=8 bit     */

       /* byte:-128 ~ 127
        short:-32768 ~32767  */
        long n1=1;      //强制转换类型，n1从int变为long
        long n2=1L;     //正常赋值，n2为long型,1L也为long型
        /*long 类型创建需要加l和L */

        //java 浮点类型默认为double，如果使用float，须后加‘f’ or ‘F’,
        float n3=1.1f;  //true
        double n4=1.1;  //true
//        float n5=1.1;   false
        double n6 =1.1f;    //正确，从小变大不会出现数据损失

        double n7=8.1/3;
        double n8=2.7;
        System.out.println(n7);
    // 非2.7，因为小数在运算为精度运算，如果比较应该为差值绝对值精度范围判断
        if(Math.abs( n7 - n8 )<1E-6)
            System.out.println("true");

        //byte,short,char三者可以直接运算，在计算时首先转换为int类型
        /*byte n9=1 ;
        byte n10=1;
        byte s1=n9+n10;*/
        //上述之所以错误，原因即为上述，byte与int不对应

        //字符串转换，只需要String str1=n1+“”
        String n9= n8 + "";
        System.out.println(n9);
        //反向转换为只需要调用对应类的parse函数即可
        //同样对应parse+对应类型大写
        String n10="123456";
        System.out.println(Integer.parseInt(n10));

//        将字符串转换为char类型，调用charAt函数
        for(int i=0;i<4;i++)
            System.out.println(n10.charAt(i));
             }

//        boolean类型默认为false
}







