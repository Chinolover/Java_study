package SE2;

public class Static1 {
    public static void main(String[] args) {
        System.out.println(child.count);    //注意这里，调用静态变量不会自动调用构造器
        child s1 = new child(13);
        child.count++;
        System.out.println(child.count);
        child s2 = new child(14);
        child.count++;
        child s3 = new child(15);
        child.count++;
        System.out.println(child.count);    //可以直接使用类名.访问类变量
        System.out.println(Math.sqrt(9));   //静态方法也可以直接调用，方便，也可以创建自己的静态方法
    }
}

class child{
    private int age;
    //static类变量也叫静态变量，所有的child类共享一个count
    public static int count = 0;    //规范（推荐）
//    static public int count = 0;  正确但不规范
      public child(int age) {
        this.age = age;
        count++;
    }

//    public static int chilage(){
//          return age*age;
//    }静态方法中无法调用普通变量和普通方法，只能调用静态成员。而普通方法可以访问静态成员
    //静态方法与静态变量相同
    //静态方法中无法使用this和super
}