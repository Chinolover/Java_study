package EE2.Properties;

//Properties类专门用来读写配置文件的集合类
/*  格式为
键=值
键=值
注意：键值对不需要有空格，值不需要用引号引起来，默认类型为String
 */

//load:加载配置文件的键值对到Properties对象
//list:将数据显示到指定设备
//getProperty(key):根据键获取值
//setProperty(key,value):设置键值对到Properties对象
//store:将Properties中的键值对存储到配置文件，在idea中，保存信息到配置文件，如果含有中文，会存储为unicode码

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args)  {
    }

    @Test
    public void test01() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/EE2/Properties/mysql.properties"));
        //加载完成
        properties.list(System.out);

        String ip = properties.getProperty("ip");
        System.out.println(ip);
    }

    @Test
    public void test02() throws IOException{
        Properties properties = new Properties();
        //创建
        properties.setProperty("charset","utf-8");
        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","abc111");

        //将k-v存储至文件中
        properties.store(new FileOutputStream("src/EE2/Properties/mysql02.properties"),"Hello World");
        System.out.println("保存配置文件完成");
    }

    @Test
    public void test03() throws IOException{
        Properties properties = new Properties();

        properties.load(new FileReader("src/EE2/Properties/mysql02.properties"));
        properties.setProperty("pwd","wxh0317**..");
        properties.store(new FileOutputStream("src/EE2/Properties/mysql02.properties"),null);
    }
}
