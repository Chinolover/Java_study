package src.Homework;

import java.util.HashSet;
import java.util.Objects;

public class homework18 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employ("wxh",18,new MyDate(2001,3,17)));
        hashSet.add(new Employ("wxh",18,new MyDate(2001,3,17)));
        System.out.println(hashSet);

    }
}

class Employ{
    private String name;
    private int sal;
    private MyDate birthday;

    public Employ(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employ employ = (Employ) o;
        return sal == employ.sal && Objects.equals(name, employ.name) && Objects.equals(birthday, employ.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, birthday.year,birthday.month,birthday.day);
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate{
    public int year;
    public int month;
    public int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}