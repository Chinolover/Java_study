package EE2.IO.IOputStreamWR;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws Exception{
        String path = "e:\\Hello03.txt";
        String charset = "utf-8";

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path),charset);
        //可以指定编码方式
        osw.write("Hello 王兴华 加油鸭(*╹▽╹*)(*╹▽╹*)");

        osw.close();
    }
}
