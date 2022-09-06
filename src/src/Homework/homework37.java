package src.Homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class homework37 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        String s = new Scanner(System.in).next();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(s);
        bw.flush();
        socket.shutdownOutput();

        FileOutputStream fileOutputStream = new FileOutputStream("e:\\shoudao.mp4");
        InputStream inputStream = socket.getInputStream();
        byte []bytes = new byte[1024];
        int line;
        while ((line = inputStream.read(bytes))!= -1){
            fileOutputStream.write(bytes,0,line);
        }

        inputStream.close();
        fileOutputStream.close();
        bw.close();
        socket.close();
    }
}
