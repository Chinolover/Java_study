package SE2.OOP.poly;

public class 多态数组 {
    public static void main(String[] args) {
        people []pe = new people[5];
        pe[0]= new people(13,"wxh");
        pe[1]= new student(21,"wxh","201913030113");
        pe[2]= new people(14,"hyn");
        pe[3]= new people(15,"lcl");
        pe[4]= new student(21,"hyn","201913030114");

        pe[0].say();
        pe[1].say();
        System.out.println(pe[0].print());
        System.out.println(pe[1].print());

        //这里如果想要调用特有方法就需要向下转型
        ((student)pe[1]).say1();
        //强制转换
    }
}

class people{
    public int age;
    public String name;

    public people(int age, String name) {
        this.age = age;
        this.name = name;
    }

    String print(){
        return "age="+age+" name="+name;
    }

    void say(){
        System.out.println("我是人");
    }
}

class student extends people{
    public String Code;

    public student(int age, String name, String code) {
        super(age, name);
        this.Code = code;
    }

    String print(){
        return super.print()+" code="+Code;
    }

    void say1(){
        System.out.println("我是学生");
    }
}