package EE2.IO.Buffered;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String path = "e:\\Story.txt";
        String pattern = "f:\\StoryCopy.txt";
        String cache;

        try {
            br = new BufferedReader(new FileReader(path));
            bw = new BufferedWriter(new FileWriter(pattern,true));
            while ((cache = br.readLine())!= null){
                bw.write(cache,0,cache.length());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(br!= null)
                    br.close();
                if (bw!=null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
