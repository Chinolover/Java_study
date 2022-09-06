package EE2.IO.File;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

//文件创建以及读取
/*  下列四个均为抽象类
    InputStream OutputStream Reader Writer
 */
public class File01 {
    public static void main(String[] args) {

    }

    //方式一
    @Test
    public void create01(){
        String filePath = "e:\\new1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式二
    @Test
    public void create02(){
        File parentFile = new File("e:\\");
        String fileName = "new2.txt";

        File file = new File(parentFile,fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式三
    @Test
    public void create03(){
        String parentFile = "e:\\";
        String filename = "new4.txt";
        File file = new File(parentFile,filename);

        try {
            file.createNewFile();
            System.out.println("创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
