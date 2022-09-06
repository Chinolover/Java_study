package 房屋出租系统;

import 房屋出租系统.UTILITY.Utility;

import java.util.Scanner;


public class HouseView {
    private boolean loop = true;//控制显示菜单

    private HouseService houseService = new HouseService(10);

    public void changeHouse(){
        System.out.println("请输入想要修改元素的ID");
        int CHANGE = new Scanner(System.in).nextInt();
        houseService.change(CHANGE);
    }

    public void findHouse(){
        System.out.println("请输入想要查找元素的ID");
        int FIND = new Scanner(System.in).nextInt();
        houseService.find(FIND);
    }


    public void delHouse(){
        System.out.println("===================删除房屋信息==========================");
        System.out.println("请输入待删除房屋的编号(-1退出)");
        listHouses();
        int DEL = new Scanner(System.in).nextInt();
        if(DEL == -1)
            System.out.println("放弃删除");
        else{
            houseService.del(DEL);
        }
    }



    public void listHouses(){
        System.out.println("===============房屋列表==================");
        System.out.println("编号\t\t房主\t\t电话\t\t         地址\t\t月租\t\t状态");
        House[] houses =houseService.list();
        for (int i = 0; i < houses.length-1; i++) {
            if(houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
    }

    public void addHouse(){
        System.out.println("================添加房屋==================");
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
        House house =new House(houseService.math,name,phone,address,rent,state);
        if(houseService.add(house))
            System.out.println("============添加成功=================");
        else{
            System.out.println("*********添加失败*************");
        }
    }

    public void mainMenu(){
        do{
            System.out.println("\n===============房屋出租系统==================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出");
            System.out.print("请输入你的选择(1-6):");
            //接受用户选择
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    System.out.println("新增");
                    addHouse();
                    break;
                case 2:
                    System.out.println("查找");
                    findHouse();
                    break;
                case 3:
                    System.out.println("删除");
                    delHouse();
                    break;
                case 4:
                    System.out.println("修改");
                    changeHouse();
                    break;
                case 5:
                    System.out.println("房屋列表");
                    listHouses();
                    break;
                case 6:
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        }while(loop);
    }
}
