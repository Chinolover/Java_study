package EE2.IO;

//1.节点流可以从一个特定的数据源读写数据，如FileReader、FileWriter
//2.处理流(也叫做包装流)是“连接”已存在的流之上，为程序提供更为强大的读写功能，如BufferedReader，BufferedWriter


//所谓包装流可以查看BufferedReader源码，我们发现其中包含有Reader对象，也就是
//BufferReader的in对象可以指向Reader的任何子类，这种设计模式也叫做修饰器模式
/*
public class BufferedReader extends Reader {

    private Reader in;

    private char cb[];
    private int nChars, nextChar;
 */

public class 节点流和处理流_ {
    public static void main(String[] args) {

    }
}
