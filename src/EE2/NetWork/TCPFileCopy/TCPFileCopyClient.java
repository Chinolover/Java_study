package EE2.NetWork.TCPFileCopy;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


public class TCPFileCopyClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);

        String path = "e:\\bhg.png";
        FileInputStream fileInputStream = new FileInputStream(path);

        OutputStream outputStream = socket.getOutputStream();
        byte []bytes = new byte[1024];
        int line;
        while ((line = fileInputStream.read(bytes))!= -1){
            outputStream.write(bytes,0,line);
        }
        outputStream.flush();
        socket.shutdownOutput();


        InputStream inputStream = socket.getInputStream();
        BufferedReader buff = new BufferedReader(new InputStreamReader(inputStream));
        String str = buff.readLine();

        System.out.println(str);

        fileInputStream.close();
        outputStream.close();
        buff.close();
        socket.close();

    }
}
