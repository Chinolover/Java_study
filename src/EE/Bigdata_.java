package EE;

import java.math.BigInteger;

public class Bigdata_ {
    public static void main(String[] args) {
        //当我们需要处理很大的整数，long不够用
        //可以使用BigInteger的类进行处理

        BigInteger bigInteger = new BigInteger("2388888888889999999999999");
        BigInteger bigInteger1 = new BigInteger("1111111");
        System.out.println(bigInteger);
        //在对BigInteger进行加减乘除时，需要使用对应方法，不能直接加减乘除
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);//+++++++

        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);//---------

        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);//*********

        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);//除以
    }
}
