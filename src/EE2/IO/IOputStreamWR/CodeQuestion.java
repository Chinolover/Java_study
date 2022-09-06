package EE2.IO.IOputStreamWR;

import java.io.BufferedReader;
import java.io.FileReader;

public class CodeQuestion {
    public static void main(String[] args) throws Exception{
        //读取文件到程序

        /*  思路：
        1.创建字符输入流BufferReader [处理流]
        2.使用BufferReader对象读取
         */

        String path = "e:\\Hello.txt";
        BufferedReader buff = new BufferedReader(new FileReader(path));

        String s = buff.readLine();
        System.out.println("读取到的内容是 " + s);
        //这里问题就是默认情况下，读取的编码为utf-8，如果文件编码不对应，就会出现乱码问题

        //引入转换流，可以把字节流转换为字符流
    }
}
