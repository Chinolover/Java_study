package EE2.NetWork.SocketTCP02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        byte []buf = new byte[1024];
        int lineLen = 0;
        while ((lineLen = inputStream.read(buf))!= -1){
            System.out.println(new String(buf,0,lineLen));
        }

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        //同样设置结束标志
        socket.shutdownOutput();

        outputStream.close();
        inputStream.close();
        serverSocket.close();
    }
}
