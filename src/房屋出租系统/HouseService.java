package 房屋出租系统;

import java.util.Scanner;

public class HouseService {
    private House[] houses; //保存House对象
     int math = 1;

    public HouseService(int size){
        //这里构造器很精妙，通过大小创建数组
        houses = new House[size];
    }

    public House[] list(){
        return houses;
    }

    public void change(int id) {
        if(houses[id-1]!=null){
            System.out.println("姓名");
            String name = new Scanner(System.in).next();
            System.out.println("电话");
            String phone = new Scanner(System.in).next();
            System.out.println("地址");
            String address = new Scanner(System.in).next();
            System.out.println("月租");
            int rent = new Scanner(System.in).nextInt();
            System.out.println("状态");
            String state = new Scanner(System.in).next();
            House house2 =new House(id,name,phone,address,rent,state);
            houses[id-1] = house2;
            System.out.println("修改完成");
        }

        else
            System.out.println("修改元素不存在");
    }

    public boolean add(House house) {
        if (houses[9] != null) {
            System.out.println("数组已满");
            return false;
        }
        houses[math-1] = house;
        math++;
        return true;
    }

    public void del(int id){
        int i;
        for (i = id; houses[i]!=null ; i++) {
            houses[i-1] = houses[i];
            houses[i-1].setId(i);
        }
        houses[i-1] = null;
        math--;
    }

    public void find(int id){
        if(houses[id-1]!=null)
            System.out.println(houses[id-1]);
        else
            System.out.println("查找元素不存在");
    }
}

