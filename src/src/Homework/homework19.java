package src.Homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class homework19 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("133",new Employees("wxh",20000,"133"));
        hashMap.put("139",new Employees("wnd",13000,"138"));
        hashMap.put("190",new Employees("lcl",25000,"251"));

        Set sets = hashMap.keySet();
        for (Object o :sets) {
            Employees employees =(Employees)hashMap.get(o);
            if(employees.getSalary()>18000)
                System.out.println(employees);
        }

        Set sets2 = hashMap.entrySet();
        for (Object o :sets2) {
            Map.Entry entry = (Map.Entry) o;
            Employees employees2 = (Employees) entry.getValue();
            if(employees2.getSalary()>18000)
                System.out.println(employees2);
        }

    }
}



class Employees{
    private String name;
    private int salary;
    private String ID_;

    public Employees(String name, int salary, String ID_) {
        this.name = name;
        this.salary = salary;
        this.ID_ = ID_;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getID_() {
        return ID_;
    }

    public void setID_(String ID_) {
        this.ID_ = ID_;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", ID_='" + ID_ + '\'' +
                '}';
    }

}
