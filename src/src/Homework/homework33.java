package src.Homework;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class homework33 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        while (socket.isConnected()) {
            String input = new Scanner(System.in).next();
            bw.write(input);
            bw.newLine();
            bw.flush();

            String test = br.readLine();
            System.out.println(test);
        }
        socket.shutdownOutput();

        br.close();
        bw.close();
        socket.close();
    }
}
