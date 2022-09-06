package SE2.OOP.poly;

public class test3 {
    public static void main(String[] args) {
        Sub s = new Sub();
        Base c = new Sub();
        System.out.println(s.count);
        s.display();

        Base b =s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();
    }
}

class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}