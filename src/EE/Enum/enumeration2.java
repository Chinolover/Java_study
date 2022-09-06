package EE.Enum;
//系统enum
public class enumeration2 {
    public static void main(String[] args) {
        System.out.println(Season2.FALL);
    }
}
//1.使用enum替代class
//2.public static Season SPRING = new Season("春天","温暖");可以被替代
//3.如果有多个常量，使用,号间隔即可
//4.使用enum枚举，要求将定义常量对象,写在前面
enum Gender{
    BOY,GIRL;   //这里其实就是调用了无参构造器
}

enum Season2{
//注意：使用enum关键字开发一个枚举类时，默认会继承Enum类，而且是一个final类
//            枚举对象必须放在枚举类的行首
    SPRING("春天","温暖"),SUMMER("夏天","热"),FALL("秋天","凉爽"),WINTER("冬天","冷");
//!!!
    private String name;
    private String desc;


//   构造器私有化并且去掉setXxx方法，防止属性被修改


    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                '}';
    }
}
