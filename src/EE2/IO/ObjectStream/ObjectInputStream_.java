package EE2.IO.ObjectStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception{
        String path = "e:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));

        //需要按照顺序读入
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        System.out.println(ois.readChar());

        Object obj = ois.readObject();
        Dog dog = (Dog) obj;
        System.out.println(dog);
        dog.test();

        ois.close();

    }
}
