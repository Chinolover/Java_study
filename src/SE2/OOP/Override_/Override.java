package SE2.OOP.Override_;


public class Override {
    public static void main(String[] args) {
        people a=new people("wxh",13);
        student b=new student("lcl",18,"201913030113");
        a.print();
        b.print();

    }
}


class people{
     String name;
     int age;
     people(String name,int age){
         this.age=age;
         this.name=name;
     }
     void print(){
         System.out.println("age="+age+",name="+name);
     }
}

class student extends people{
    String Xuehao;
    student(String name, int age,String Xuehao) {
        super(name, age);
        this.Xuehao=Xuehao;
    }

    //private void print() {
    //这里注意重写函数只能比原有权限更大，不能比原有权限小
    public void print(){
        System.out.println("重写函数："+"age="+age+",name="+name+"学号="+Xuehao);
    }
}

