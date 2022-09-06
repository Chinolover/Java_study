package EE2.IO.Buffered;

import java.io.BufferedReader;
import java.io.FileReader;

//BufferedReader和BufferWriter是字符流，且关闭时只需要关闭外层流即可
public class BufferedReader_ {
    public static void main(String[] args) throws Exception{
        String path = "e:\\Story.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String line;
        //readLine作为BufferedReader可以一次读取一行，效率更高
        //readLine方法读取结束标志为行为null
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
