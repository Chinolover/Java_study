package EE2.IO.IOputStreamWR;


import java.io.*;

//当处理纯文本数据时，如果使用字符流效率更高，并且可以有效解决中文问题，所以建议将字节流转换为字符流
//可以在使用时指定编码格式
public class InputStreamReader_ {
    public static void main(String[] args) throws Exception {
        String path = "e:\\Hello.txt";
        //InputStreamReader:Reader的子类，可以将InputStream（字节流）包装成Reader（字符流）
        //OutputStreamWriter:Writer的子类，可以将OutputStream（字节流）包装成Writer（字符流）
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path),"GBK"));
        String S = br.readLine();
    //我们可以看见乱码消失
        System.out.println(S);

        br.close();
    }
}
