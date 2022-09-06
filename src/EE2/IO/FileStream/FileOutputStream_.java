package EE2.IO.FileStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile(){
        String Path = "e:\\hello01.txt";
        FileOutputStream fileOutputStream = null;
        String Write = "Hello World!";
        try {
//            fileOutputStream = new FileOutputStream(Path);  //默认为覆盖
            fileOutputStream = new FileOutputStream(Path , true);//现在则变为不覆盖
            fileOutputStream.write(Write.getBytes());
            //下面的写法可以局部写入
//            fileOutputStream.write(Write.getBytes(),0,Write.length());
            //写入一个字节
//            fileOutputStream.write('H');

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
