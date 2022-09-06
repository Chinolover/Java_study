package EE2.NetWork.TCPFileCopy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
//        1.编写一个服务端，和一个客户端
//        2.服务器端在8888端口监听
//        3.客户端连接到服务端，发送- -张图片e:\\qie.png
//        4.服务器端接收到客户端发送的图片，保存到src下，发送"收到图片”再退出
//        5.客户端接收到服务端发送的"收到图片"，再退出

public class TCPFileCopyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        byte []bytes = new byte[1024];
        int len;

        String path = "e:\\qie.png";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        while ((len = inputStream.read(bytes))!= -1){
            fileOutputStream.write(bytes,0,len);
        }



        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(outputStream));
        buff.write("收到图片");
        buff.flush();
        socket.shutdownOutput();

        fileOutputStream.close();
        inputStream.close();
        buff.close();
        socket.close();
    }
}
