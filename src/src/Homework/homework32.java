package src.Homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class homework32 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line = "";
        while (!line.equals("close")) {
            line = br.readLine();
            if (line.equals("name"))
                bw.write("我是nova");
            else if (line.equals("hobby"))
                bw.write("编写java程序");
            else
                bw.write("你说啥呢");
            bw.newLine();
            bw.flush();
        }


        br.close();
        bw.close();
        socket.close();




    }
}
