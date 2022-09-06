package SE2.OOP.Access_Modifier;

public class Modifier {
    public static void main(String[] args) {
        Student XH =new Student(55,"201913030113");
        System.out.println(XH.age);
        XH.agetest(XH.age);
        System.out.println(XH.age);
    }
}

class Person{
    public int age;
    private String code;
    public Person(int age,String code) {
        if(age<0 | age>100)
            this.age = -1;
        else
            this.age = age;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person{

    public Student(int age, String code) {
        super(age, code);
    }

    private int sm(int age){
        if(age >= 30)
            return -1;
        else
            return age;
    }

    public void agetest(int age){
        this.age=sm(age);
    }
}