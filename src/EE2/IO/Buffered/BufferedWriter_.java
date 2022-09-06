package EE2.IO.Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter_ {
    public static void main(String[] args) throws Exception{
        String path = "e:\\Hello02.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true));

        bufferedWriter.write("王兴华上岸啦！！！");
        bufferedWriter.newLine();   //写入和系统兼容的换行符
        bufferedWriter.write("王兴华结婚啦！！！");
        bufferedWriter.newLine();
        bufferedWriter.write("王兴华嘎啦！！！");
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
