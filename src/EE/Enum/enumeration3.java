package EE.Enum;


//enum无法继承类但仍然可以实现接口
public class enumeration3 {
    public static void main(String[] args) {
        //使用enum方法
        Season2 autumn = Season2.FALL;
        //输出枚举对象的名字
        System.out.println(autumn.name());
        //ordinal()输出的是该枚举对象的次序编号，从0开始
        System.out.println(autumn.ordinal());

        //values方法，返回Season2[] 含有定义的所有枚举对象
        Season2 []values = Season2.values();
        for (Season2 season: values) {
            System.out.println(season);
        }

        //valueOf:将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        Season2 autumn2 = Season2.valueOf("SPRING");
        System.out.println(autumn2);

        //compareTo:比较两个枚举常量，比较的就是编号,返回的是编号差
        System.out.println(autumn2.compareTo(autumn));

    }
}
