package EE2.NetWork.SocketTCP03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket =serverSocket.accept();

        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        BufferedReader buff = new BufferedReader(new InputStreamReader(inputStream));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));

        String str = buff.readLine();   //这里使用while会卡住

            System.out.println(str);


        bw.write("Hello client");
        bw.newLine();   //使用newLine同样可以作为结束标记，但要求另一方必须需要使用readLine接收
        bw.flush(); //注意！使用字符流时，写入后必须使用flush刷新，否则无法写入


        bw.close();
        buff.close();
        socket.close();
    }
}
