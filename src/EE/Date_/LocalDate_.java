package EE.Date_;

import java.time.LocalDateTime;

//第三代日期
public class LocalDate_ {
    public static void main(String[] args) {
        //构造器私有化
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getYear());//年
        System.out.println(ldt.getMonth());//月
        System.out.println(ldt.getMonthValue());//月
        System.out.println(ldt.getDayOfMonth());//日
        System.out.println(ldt.getHour());//时
        System.out.println(ldt.getMinute());//分
        System.out.println(ldt.getSecond());//秒
    }
}
