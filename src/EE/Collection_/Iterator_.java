package EE.Collection_;


import java.util.ArrayList;
import java.util.Iterator;

//迭代器
public class Iterator_ {
    public static void main(String[] args) {
        //Iterator对象成为迭代器，主要用于遍历Collection集合中的元素
        //所有实现了Collection接口的集合类都有一个iterator方法，用以返回一个实现了Iterator接口的对象，即返回一个迭代器

        /*
        hasNext():判断是否还有下一个元素
        next():1.下移 2.将下移以后集合位置上的元素返回

        在调用iterator.next()方法之前必须调用iterator.hasNext()进行检测。否则，如果下一个元素没有了，直接调用会抛出
        NoSuchElementException异常
         */

        ArrayList col = new ArrayList();
        col.add(new Per(18,"abc",83.5));
        col.add(new Per(19,"bcd",98));
        col.add(13);

        Iterator it = col.iterator();
        while (it.hasNext()) {  //判断是否还有数据
            Object next =  it.next();  //返回下一个元素，类型是Object

            System.out.println(next);
            //itit快捷键

        }

        for (Object cd: col) {      //同样可以使用增强for循环，for既可以用于数组也可以用于集合
            System.out.println(cd);
        }
    }
}

class Per{
    private int age;
    private String name;
    private double exam;

    public Per(int age, String name, double exam) {
        this.age = age;
        this.name = name;
        this.exam = exam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExam() {
        return exam;
    }

    public void setExam(double exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Per{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", exam=" + exam +
                '}';
    }
}
