package EE2.NetWork.SocketTCP03;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        BufferedReader buff = new BufferedReader(new InputStreamReader(inputStream));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));

        bw.write("Hello Server");
        bw.newLine();
        bw.flush();


        String line = buff.readLine();

            System.out.println(line);



        buff.close();
        bw.close();
        socket.close();
    }
}
