package EE2.IO.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@SuppressWarnings({"all"})
public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        String SrcfilePath = "e:\\社会实践.jpg";
        String destfilePath = "f:\\社会实践.jpg";

        try {
            fileInputStream = new FileInputStream(SrcfilePath);
            fileOutputStream = new FileOutputStream(destfilePath,true);
            //定义一个字节数组，提高读取效果
            byte []buf = new byte[1024];    //一次读1KB
            int read = 0;
            while ((read = fileInputStream.read(buf))!= -1){
                //边读边写
                fileOutputStream.write(buf,0,read); //这里要使用write的这种调用，因为如果直接使用write(buf)
                //可能会出现读不全或者读超了的情况，导致图片无法加载
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }

    }
}
