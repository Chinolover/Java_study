package EE2.NetWork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //1.获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //2.根据指定主机名，获得InetAdress对象
        InetAddress host1 = InetAddress.getByName("Kirito");
        System.out.println(host1);

        //3.根据域名返回InetAdress对象，比如www.baidu.com
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);

        //4.根据InetAdress对象，获取对应地址
        System.out.println(host2.getHostAddress());

        //5.根据InetAdress对象，获取对应主机名/或者域名
        System.out.println(host2.getHostName());
    }
}
