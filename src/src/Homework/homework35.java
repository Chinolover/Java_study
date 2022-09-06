package src.Homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class homework35 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8889);

        String s = new Scanner(System.in).next();
        byte []bytes = s.getBytes();
        DatagramPacket packet1 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.183.1"),8888);
        socket.send(packet1);

        byte []buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        socket.receive(packet);

        int len = packet.getLength();
        byte []data = packet.getData();

        String str = new String(data,0,len);
        System.out.println(str);
    }
}
