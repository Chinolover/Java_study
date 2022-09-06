package EE.Collection_.Set_;

import java.util.HashSet;
import java.util.Objects;

public class Hashsetadd {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee(18,"wxh"));
        hashSet.add(new Employee(18,"wxh"));
        hashSet.add(new Employee(21,"xxx"));
        System.out.println(hashSet);
    }//这个问题需要考虑HashSet底层添加机制，如果想让两个不同对象添加时有限制，需要重写equals和hashcode
}

class Employee{
    private int age;
    private String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
