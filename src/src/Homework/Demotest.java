package src.Homework;
import java.io.*;

public class Demotest {
    public static void main(String []args) throws FileNotFoundException {
        String file_01 = "E:\\IDEA_workplace_se1\\src\\src\\Homework\\source.txt";
        String file_02 = "E:\\IDEA_workplace_se1\\src\\src\\Homework\\backup.txt";
        copy2(file_01,file_02);
    }
    public static void copy2(String sFile,String dFile){
        try(
                BufferedReader bis = new BufferedReader(new FileReader(sFile));
                PrintStream ps = new PrintStream(new FileOutputStream(dFile));
        ) {
            int line = 0;
            String str;
            while((str = bis.readLine())!=null){
                ps.println((line++) +" "+ str);
                ps.flush();
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

}
