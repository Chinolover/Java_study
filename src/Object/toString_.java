package Object;

public class toString_ {
    public static void main(String[] args) {
        Person wxh = new Person(20, "wxh");
        //sout直接输出对象，默认调用的就是wxh.toString()
        System.out.println(wxh);
        /*public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
           }
        toString 默认返回包名+类名 然后和哈希码的16进制输出
         */

        //子类往往重写toString方法，用于返回对象的属性信息
    }
}
class Person{
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString()+"  age="+age+" name="+name;
    }
}