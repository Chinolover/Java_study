package EE2.IO.FileRW;

import org.junit.jupiter.api.Test;


import java.io.*;

//Writer->OutputStreamWriter->FileWriter    继承关系
//Reader->InputStreamReader->FileReader    继承关系
public class FileReader_ {
    public static void main(String[] args) {
        String path = "e:\\Story.txt";
        FileReader fileReader = null;
        int cache ;
        try {
            fileReader = new FileReader(path);
            //循环读取，使用read，单个字符读取，但此种方法较慢
            while ((cache = fileReader.read())!= -1){
                System.out.print((char)cache);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //字符数组读取
    @Test
    public void idea2(){
        String path = "e:\\Story.txt";
        FileReader fileReader = null;
        int cacheLen = 0;
        char []buf = new char[8];
        try {
            fileReader = new FileReader(path);

            while ((cacheLen = fileReader.read(buf))!= -1){
                //循环读取，使用read(buf)，返回的实际是读取到的字符数
                //如果返回-1，说明到文件结束
                System.out.print(new String(buf,0,cacheLen));//要注意String的这种用法
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
