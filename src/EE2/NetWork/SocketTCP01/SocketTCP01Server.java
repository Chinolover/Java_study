package EE2.NetWork.SocketTCP01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //1.在本机的9999端口监听，等待连接
        ServerSocket serverSocket = new ServerSocket(9999);

        //2.当没有客户端连接9999端口时，程序会阻塞，等待连接
        Socket socket = serverSocket.accept();

        //3.通过socket.getInputStream()读取客户端写入到数据通道的数据
        InputStream inputStream = socket.getInputStream();

        //4.IO读取
        byte []buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf))!= -1){
            System.out.println(new String(buf,0,readLen));
        }

        //5.关闭
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
