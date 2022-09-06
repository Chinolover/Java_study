package src.Homework;

import java.io.File;
import java.io.IOException;

public class homework29 {
    public static void main(String[] args) throws IOException {
       String path = "e:\\mytemp";
       File file = new File(path);
        System.out.println(file.mkdir());

        String path2 = "e:\\mytemp\\hello.txt";
        File file1 = new File(path2);
        if(file1.exists())
            System.out.println("已经存在");
        else
            file1.createNewFile();
    }
}
