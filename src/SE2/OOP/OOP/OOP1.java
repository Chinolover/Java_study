package SE2.OOP.OOP;

public class OOP1 {
    public static void main(String[] args) {
//全局变量可以不赋值，直接使用，因为有默认值，局部变量必须赋值后，才能使用，因为没有默认值
        Person a = new Person();
        a.age=10;
        a.name="华华公主";
        Person b;
        b=a;   // b为a的引用
        b.age=200;
        b=null;    // 将b置为空后会使b不再指向a，而不是a也变为null
        System.out.println(a.age);
        System.out.println(new Person().choice(7));//匿名类，只可以调用一次
        //System.out.println(b.age); 这里会抛出异常，
    }
}
        //跨类方法调用需要通过对象名调用  eg.对象名.方法名(参数)
class  Person{
    public boolean choice(int a){
        if(a%2==0)
            return true;
        else
            return false;
    }

    String name;
    int age;
}
