package EE2.IO.Buffered;

import java.io.*;

public class BufferCopy02 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        String path = "e:\\社会实践.jpg";
        String pathat = "f:\\社会实践copy.jpg";
        byte []cache = new byte[1024];
        int Longs;

        try {
            bis = new BufferedInputStream(new FileInputStream(path));
            bos = new BufferedOutputStream(new FileOutputStream(pathat,true));

            while ((Longs = bis.read(cache))!= -1){
                bos.write(cache,0,Longs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
