package src.Homework;

import java.io.*;

public class homework30 {
    public static void main(String[] args) throws IOException {
       String path = "e:\\Story.txt";
       InputStreamReader is = new InputStreamReader(new FileInputStream(path),"GBK");
       BufferedReader buf = new BufferedReader(is);

       String line;
       String path2 = "e:\\Story2.txt";
       BufferedWriter buff = new BufferedWriter(new FileWriter(path2,true));
       while ((line = buf.readLine())!= null){
           buff.write(line);
           buff.newLine();
       }

       buf.close();
       buff.close();
    }
}
