package SE2.OOP.Override_;

public class Homework1 {
    public static void main(String[] args) {
        Person a = new Person("wxh",18);
        Person b = new Student("lg",20,"123456",100);
        System.out.println(a.say());
        System.out.println(b.say());
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    String say(){
        return "name="+name+",age="+age;
    }
}

class Student extends Person{
    private String ID;
    private int score;
    public Student(String name,int age,String ID,int score){
        super(name,age);
        this.ID=ID;
        this.score=score;
    }
    String say(){
        return super.say()+",ID="+ID+",score="+score;
    }
}