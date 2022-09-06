package EE2.IO.FileStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

//InputStream常用子类
/*
1.FileInputStream 文件输入流
2.BufferedInputStream 缓冲字节输入流
3.ObjectInputStream 对象字节输入流
 */
@SuppressWarnings({"all"})
public class FileInputStream_ {
    public static void main(String[] args) {

        //这里测试了FileInputStream，因为为字节流，所以会
    }
    @Test
    public void test02(){
        String name = "e:\\hello.txt";

        byte []input = new byte[1];
        FileInputStream fileInputStream = null; //这里如果不这样直接在try里创建finally里无法检索到fileInputStream
        int readData = 0;
        try {
            fileInputStream = new FileInputStream(name);

            //从输入流读取一个字节，如果没有输入可用，方法将阻止，返回-1
            //如果读取正常，返回实际读取的字节数
            while ((readData = fileInputStream.read())!= -1){
                System.out.print((char)readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //创建FileInputStream对象，用于读取文件
//        fileInputStream = new FileInputStream(name);

    }


    @Test
    public void test01(){
        String name = "e:\\hello.txt";

        byte []input = new byte[1];
        FileInputStream fileInputStream = null; //这里如果不这样直接在try里创建finally里无法检索到fileInputStream
        int readData = 0;
        try {
            fileInputStream = new FileInputStream(name);

            //从输入流读取一个字节，如果没有输入可用，方法将阻止，返回-1
            //如果读取正常，返回实际读取的字节数
            while ((readData = fileInputStream.read(input))!= -1){
                System.out.print(new String(input,0,readData));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //创建FileInputStream对象，用于读取文件
//        fileInputStream = new FileInputStream(name);

    }
}
