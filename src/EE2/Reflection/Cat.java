package EE2.Reflection;

@Deprecated
public class Cat {
    private String name = "招财猫";
    public int age = 14;
    public String sex = "公";
    private static String Boom;
    public final static int foot = 4;


    private Cat(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("使用私有构造器创建对象");
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }

    public void hi(){
        System.out.println("Hello");
    }

    public void fuck(){

    }

    private int Bitch(int age){
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
