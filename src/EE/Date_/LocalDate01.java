package EE.Date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        //关于DateTimeFormatter的各个格式参数，需要看jdk8的文档
//        DateTimeFormatter可用于LocalDateTime的格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String strDate =dtf.format(ldt);
        System.out.println(strDate);
    }
}
