package src.Homework;

import java.io.File;

public class homework28 {
    public static void main(String[] args) {
        File file01 = new File("d:\\new1.txt");
        if(file01.exists())
            file01.delete();
        else
            System.out.println("文件不存在");

        File file02 = new File("d:\\demo\\a\\b\\c");
        if (file02.isDirectory())
            System.out.println("已经存在");
        else
            file02.mkdirs();


    }
}
