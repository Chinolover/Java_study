package Object;

public class 重写equals {


    public static void main(String[] args) {
        student A=new student(13,"wxh");
        student B=new student(13,"wxh");
        System.out.println(A.equals(B));
    }
}

class student{
    private int age;
    private String name;

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj instanceof student){
            student p =(student)obj;
            return this.age == p.age && this.name.equals(p.name);
        }
        else
            return false;
    }
}
