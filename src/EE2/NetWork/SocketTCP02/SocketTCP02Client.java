package EE2.NetWork.SocketTCP02;

import jdk.net.Sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("Hello,server".getBytes());
        //这里需要设置结束标志，否则会出现死锁情况
        socket.shutdownOutput();

        byte []buf = new byte[1024];
        int lineLen;
        while ((lineLen = inputStream.read(buf))!= -1){
            System.out.println(new String(buf,0,lineLen));
        }

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
