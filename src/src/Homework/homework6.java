package src.Homework;

public class homework6 {
    public static void main(String[] args) {

    }
}

interface Vehicles{
    void work();
}

class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("骑马");
    }
}

class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("坐船");
    }
}

