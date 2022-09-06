package EE2.IO.ObjectStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception{
        //序列化后，保存的文件格式不是纯文本，而是按照它的格式来保存
        String path = "e:\\data.dat";       //这里后缀意义不大

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));

        oos.writeInt(100);  //int没有实现序列化所以装箱为Integer，以下同理
        oos.writeBoolean(true);
        oos.writeDouble(3.21);
        oos.writeUTF("朱锐坤是我儿"); //这里注意String存放方法
        oos.writeChar('b');

        oos.writeObject(new Dog("朱锐坤",9));

        oos.close();
        System.out.println("序列化完成");
    }
}

