package src.Homework;

import org.junit.jupiter.api.Test;

import java.util.*;

public class homework24 {
    public static void main(String[] args) {
        Map<String, User> map = new HashMap<>();
        DAO<User> userDAO = new DAO<>(map);
        userDAO.save("wxh",new User(13,21,"wxh"));
        userDAO.save("lcl",new User(18,21,"lcl"));
        userDAO.save("lpf",new User(1,10,"lph"));

        System.out.println(userDAO.get("lcl"));

        userDAO.update("wxh",new User(99,99,"hxw"));

        System.out.println(userDAO.list());

        userDAO.delete("lph");

    }
}

class DAO<T>{
    Map<String,T> hashMap;

    public DAO(Map<String, T> hashMap) {
        this.hashMap = hashMap;
    }

    @Test
    public void save(String id,T entity){
        hashMap.put(id,entity);
    }

    public T get(String id){
       return hashMap.get(id);
    }

    public void update(String id,T entity){
        if(hashMap.get(id)!=null){
            hashMap.put(id,entity);
        }
    }

    public List<T> list(){
        return new ArrayList<>(hashMap.values());
    }

    public void delete(String id){
        hashMap.remove(id);
    }

    @Override
    public String toString() {
        return "DAO{" +
                "hashMap=" + hashMap +
                '}';
    }
}

class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
