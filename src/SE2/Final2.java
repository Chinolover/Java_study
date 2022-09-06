package SE2;

public class Final2 {
    public static void main(String[] args) {
        System.out.println(Cricle.S(3));
    }
}

class Cricle{
    private double radius;
    private static final double PI = 3.14;

    public final static double S(int r){
        return PI*r*r;
    }
}