package src.Homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class homework36 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        OutputStream outputStream = socket.getOutputStream();
        FileInputStream inputStreamMusic ;
        byte[] bytes = new byte[1024];
        int line;

        String str = br.readLine();
        if ("星座书上".equals(str)) {
            inputStreamMusic = new FileInputStream("e:\\星座书上.mp3");
            while ((line = inputStreamMusic.read(bytes)) != -1) {
                outputStream.write(bytes, 0, line);
            }
        } else {
            inputStreamMusic = new FileInputStream("e:\\111.wav");
            while ((line = inputStreamMusic.read(bytes)) != -1) {
                outputStream.write(bytes, 0, line);
            }
        }
        outputStream.flush();
        socket.shutdownOutput();

        inputStreamMusic.close();
        outputStream.close();
        br.close();
        socket.close();

    }
}
