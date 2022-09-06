package src.Homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class homework34 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);

        byte []buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);

        socket.receive(packet);


        int Len = packet.getLength();
        byte[] data = packet.getData();
        String str = new String(data,0,Len);
        DatagramPacket packet1 = null;
        if(str.equals("四大名著是哪些")){
            byte []bytes = "四大名著是红楼梦,水浒传，三国演义，红楼梦".getBytes();
            packet1 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.183.1"),8889);
        }else{
            byte []bytes = "what?".getBytes();
            packet1 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.183.1"),8889);
        }
        socket.send(packet1);

        socket.close();
    }
}
