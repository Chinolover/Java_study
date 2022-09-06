package EE.Enum;

//枚举两种实现：自定义枚举和系统提供的枚举
public class enumeration {
    public static void main(String[] args) {
        System.out.println(Season.SUMMER);
    }
}

//1.自定义枚举
//
//对枚举对象使用final+static共同修饰，实现底层优化
//枚举对象名通常使用全部大写，常量的命名规范

class Season{
    private String name;
    private String desc;

    public static Season SPRING = new Season("春天","温暖");
    public static Season SUMMER = new Season("夏天","热");
    public static Season FALL = new Season("秋天","凉爽");
    public static Season WINTER = new Season("冬天","冷");

//   构造器私有化并且去掉setXxx方法，防止属性被修改

    private Season(String name, String desc) {
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
                ", desc='" + desc + '\'' +
                '}';
    }
}