package SE2;

public class Interface4 {
    public static void main(String[] args) {
        //这里演示接口的多态传递现象
        AAAA tc = new TEST() ;
        //这里原本通过AAAA是无法创造TEST的，但是因为BBBB继承了AAAA，发生了多态传递
    }
}

class TEST implements BBBB {
    @Override
    public void print() {
        System.out.println("多态传递现象");
    }
}

interface AAAA{ }

interface BBBB extends AAAA{
    void print();
}

