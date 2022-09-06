package EE2.NetWork.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1.创建一个 DatagramSocket 对象，准备在9999接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2.构建一个DatagramPacket对象，准备接受数据
        //注：UDP协议规定，一个数据包最大64K
        byte []buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        //这里有数据包发送到9999端口时会接受，如果没有就会进入阻塞等待
        //3.调用接收方法，将通过网络传输的DatagramPacket对象填充到packet对象
        socket.receive(packet);

        //4.拆包，取出数据，并显示
        int length = packet.getLength();    //实际接收到的数据字节长度
        byte[] data = packet.getData();     //接收到数据

        String s = new String(data,0,length);
        System.out.println(s);

        byte []bytes = "好的,明天见".getBytes();
        DatagramPacket packet1 =
                new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.183.1"),9998);

        socket.send(packet1);

        //5.关闭资源
        socket.close();
    }
}
