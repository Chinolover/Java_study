package EE2.NetWork.UDP;

import java.io.IOException;
import java.net.*;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket对象，准备在9998端口接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //2.将需要发送的数据，封装到DatagramPacket对象
        byte []data = "Hello 明天吃火锅~~".getBytes();
        DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.183.1"),9999);

        //3.发包
        socket.send(packet);

        byte []buf = new byte[1024];
        DatagramPacket packet1 = new DatagramPacket(buf, buf.length);

        //这里有数据包发送到9999端口时会接受，如果没有就会进入阻塞等待
        //3.调用接收方法，将通过网络传输的DatagramPacket对象填充到packet对象
        socket.receive(packet1);

        //4.拆包，取出数据，并显示
        int length = packet1.getLength();    //实际接收到的数据字节长度
        byte[] data1 = packet1.getData();     //接收到数据

        String s = new String(data1,0,length);
        System.out.println(s);

        //4.关闭
        socket.close();
    }
}
