package SE2.OOP.poly;

public class test {
    public static void main(String[] args) {
        Dog a = new Dog(20,"lsp","jinmao");
        Animal c = new Dog(20,"lsp","jinmao");

        //这里多态后无法调用子类特有方法
        a.Pr();
        a.print(20,"lsp");

         Dog b = (Dog)c;    //这里就可以访问特有方法了
        b.Pr2();

        //instanceOf比较操作符，判断对象的运行类型是否为XX类型或XX类型的子类

        System.out.println(c instanceof Dog);
        System.out.println(b instanceof Animal);
        System.out.println(b instanceof Dog);
    }
}

class Animal{
    private int age;
    private String name;

    public Animal(int age,String name) {
        this.age = age;
        this.name = name;
    }

    public void print(int age,String name){
        System.out.println("动物\t"+age+"\t"+name);
    }

    public void Pr(){
        System.out.println("teyou1");
    }
}

class Dog extends Animal {
    private String pinzhong;

    public Dog(int age, String name, String pinzhong) {
        super(age, name);
        this.pinzhong = pinzhong;
    }

    public void print(int age, String name) {
        super.print(age, name);
        System.out.println("pinzgon=" + pinzhong);
    }

    public void Pr2(){
        System.out.println("teyou2");
    }
}