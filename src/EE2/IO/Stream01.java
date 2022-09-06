package EE2.IO;

//操作系统分类：字节流（8bit）二进制文件，字符流文本文件
//数据流分类：输入流和输出流
/*         字节流       字符流
输入流   InputStream    Reader
输出流   OutputStream   Writer
 */

//java的IO流都是从上面四个抽象基类派生来的
//由这四个类派生出来的子类名称都是以其父类名作为子类名后缀

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@SuppressWarnings({"all"})
public class Stream01 {
    public static void main(String[] args) {
        String name = "e:\\hello.txt";
        File file = new File(name);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int readData = 0;
        FileInputStream fileInputStream = null;

        //创建FileInputStream对象，用于读取文件
//        fileInputStream = new FileInputStream(name);

    }
}
