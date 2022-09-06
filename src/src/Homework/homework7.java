package src.Homework;

public class homework7 {
    public static void main(String[] args) {
        new Car(50).new Air().flow();
    }
}

class Car{
    public int temperature;

    public Car(int temperature) {
        this.temperature = temperature;
    }

    class Air{
        public  void flow(){
            if(temperature>40)
                System.out.println("冷风");
            else if(temperature <0)
                System.out.println("暖风");
            else
                System.out.println("关掉空调");
        }
    }
}
