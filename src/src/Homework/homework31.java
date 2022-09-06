package src.Homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class homework31 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name","tom");
        properties.setProperty("age","5");
        properties.setProperty("color","red");

        properties.store(new FileOutputStream("e:\\dog.properties"),null);
    }

    @Test
    public void Test() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("e:\\dog.properties"));
        String name = properties.getProperty("name");
        String agetest = (properties.getProperty("age"));
        int age = Integer.parseInt(agetest);
        String color = properties.getProperty("color");

        Dog dog = new Dog(name,age,color);
        System.out.println(dog);
    }
}

class Dog{
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}