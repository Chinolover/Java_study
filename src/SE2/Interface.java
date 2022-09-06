package SE2;

//接口默认访问修饰符 public abstract
public class Interface {
    public static void main(String[] args) {
        computer ZJZ = new computer();
        Usb phone = new Phone();
        Camera camera = new Camera();
        ZJZ.working(phone);
        ZJZ.working(camera);
        Usb[] usb = new Usb[2];
        usb[0] = new Phone();
        usb[1] = new Camera();
        for (int i = 0; i < 2; i++) {
            usb[i].start();
            usb[i].end();
        }
        //这里就体现了接口的多态，同时如果要调用接口特有的方法，就需要向上转型
    }
}
class computer{
    public void working(Usb usb){
        usb.start();
        usb.end();
    }
}

interface Usb{
    public void start();
    public void end();
}

class Phone implements Usb{
    public void start(){
        System.out.println("手机开始运行");
    }
    public void end(){
        System.out.println("手机运行结束");
    }
}

class Camera implements Usb{
    public void start(){
        System.out.println("相机开始运行");
    }
    public void end(){
        System.out.println("相机运行结束");
    }
}