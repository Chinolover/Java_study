package EE;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bigdata02 {
    public static void main(String[] args) {
        //当我们需要保存一个精度很高的数时，double不够用，可以使用BigDecimal

        BigDecimal bigDecimal = new BigDecimal("1999999999.11199999999999999999");
        System.out.println(bigDecimal);
        //这里加减乘和BigInteger一致，但是除以需要指定精度，否则会抛出异常
        BigDecimal bigDecimal1 = new BigDecimal("12.3333");

        BigDecimal divide2 = bigDecimal.divide(bigDecimal1, RoundingMode.CEILING);
        System.out.println(divide2);
    }
}
