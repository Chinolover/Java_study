package src.Homework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class homework17 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee(18,"wxh"));
        hashSet.add(new Employee(18,"wxh"));
        hashSet.add(new Employee(21,"xxx"));
        System.out.println(hashSet);
    }
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
