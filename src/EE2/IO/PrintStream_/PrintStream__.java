package EE2.IO.PrintStream_;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream__ {
    public static void main(String[] args) throws IOException {
        PrintStream ps = System.out;

        ps.println("john Hello");

        ps.write("Hello 王兴华".getBytes());

        ps.close();

        //可以修改打印的位置
        System.setOut(new PrintStream("e:\\f1.txt"));
        System.out.println("我无敌，你随意");
    }
}
