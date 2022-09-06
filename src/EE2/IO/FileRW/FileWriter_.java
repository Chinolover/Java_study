package EE2.IO.FileRW;

import java.io.FileWriter;
import java.io.IOException;
/*
  wirte有五种方法：
write(int)
write(char[])
write(char[],off,len)
write(String)
write(string,off,len)
*/
public class FileWriter_ {
    public static void main(String[] args) {
        String path = "e:\\note.txt";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(path,true); //追加模式
            fileWriter.write(3);
            fileWriter.write(new char[]{'a', 'b'});
            fileWriter.write(new char[]{'c','d','e','f'},0,2);  //左闭右开
            fileWriter.write("窝嫩叠");
            fileWriter.write("我在人民广场吃炸鸡",1,6);  //左闭右开
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //一定要记得关闭或者flush()
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
