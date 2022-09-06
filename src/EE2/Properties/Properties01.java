package EE2.Properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        //读取mysql.properties文件，并得到ip,user和pwd
        //笨比识别方法

        String path = "src/EE2/Properties/mysql.properties";
        BufferedReader buf = new BufferedReader(new FileReader(path));

        String line;
        while ((line = buf.readLine())!= null){
            String[] split = line.split("=");
            System.out.println(split[0]+ "值为" + split[1]);

            if ("ip".equals(split[0])){
                System.out.println("特别注意ip为"+ split[1]);
            }
        }
        buf.close();
    }
}
