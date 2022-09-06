package EE.Generic;

import java.util.*;

public class Generic03 {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<Student>();
        //在实际开发中，我们往往简写
        // HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student("wxh",13));
        studentHashSet.add(new Student("lcl",13));
        studentHashSet.add(new Student("lph",100));

        for (Student student :studentHashSet) {
            System.out.println(student);
        }

        Iterator<Student> iterator = studentHashSet.iterator();
        while (iterator.hasNext()) {
            Student next =  iterator.next();
            System.out.println(next);
        }


        HashMap<String,Student> stringStudentHashMap = new HashMap<String,Student>();
        stringStudentHashMap.put("wxh",new Student("wxh",13));
        stringStudentHashMap.put("lcl",new Student("lcl",13));
        stringStudentHashMap.put("lph",new Student("lph",100));

        Set<Map.Entry<String,Student>> entries = stringStudentHashMap.entrySet();
        Iterator<Map.Entry<String,Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> next =  iterator1.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }

        }

    }


class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}