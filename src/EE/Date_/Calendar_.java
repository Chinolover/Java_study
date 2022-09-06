package EE.Date_;
    //第二代日期类

import java.util.Calendar;

//不是线程安全的
public class Calendar_ {
    public static void main(String[] args) {
        //构造器被私有化(Calender)
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println("年："+ c.get(Calendar.YEAR));
        System.out.println("月："+ (c.get(Calendar.MONTH)+1));    //因为从0开始所以需要+1
        System.out.println("日："+ c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时："+ c.get(Calendar.HOUR_OF_DAY));//HOUR为12小时，HOUR_OF_DAY为24小时
        System.out.println("分钟："+ c.get(Calendar.MINUTE));
        System.out.println("秒："+ c.get(Calendar.SECOND));

        //Calender没有专门的格式化方法，所以需要程序员自己组合显示
    }
}

