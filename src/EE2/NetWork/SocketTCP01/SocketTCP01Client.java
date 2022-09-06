package EE2.NetWork.SocketTCP01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;


public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
//        1.连接服务器（ip，端口）
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        //2.连接上后，生成Socket，通过socket.getOutputStream()得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流，写入数据到数据通道
        outputStream.write("Hello World!!".getBytes());

        //4.关闭流对象和socket
        outputStream.close();
        socket.close();

    }
}
