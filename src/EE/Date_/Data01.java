package EE.Date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//第一代日期
public class Data01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);     //format:将日期转换成指定格式的字符串
        System.out.println("当前日期= " + format);

        //也可以把一个格式化的String转成对应的Date
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println(parse);
    }
}
