package SE2.OOP.OOP;

public class OOP2 {
    public static void main(String[] args) {
        Student p1 = new Student("hyn",20);
        Student p2 = new Student("wxh");
        Student p3 = new Student(13);
        Student p4 = new Student();
        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.age);
    }
}
   
class Student{
    String name;
    int age;
    //构造器
    /*细节：访问构造器语法：this（参数列表）
    注意只能在构造器中使用
    并且必须放在第一条语句   */
    public Student(){
        this("lisa",99);
        System.out.println("this调用构造器");
    }

    public Student(String Name,int Age) {
        name = Name;
        age = Age;
    }
    //构造器重载
    public Student(String Name1){
        name = Name1;
        }
    //this 关键字
    public Student(int age){
        this.age=age;
    }
}