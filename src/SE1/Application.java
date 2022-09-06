package SE1;

public class Application {
    public static void main(String[] args) {
        Complex complex1 = new Complex(1,3);
        Complex complex2 = new Complex(2,4);
        Complex complex3 = complex1.add(complex2);
        complex3 = complex3.minus(complex2);
        System.out.println(complex3.equal(complex1));
        Complex complex4 = complex2.pursue(complex1);
        System.out.println(complex1);
        System.out.println(complex2);
        System.out.println(complex3);
        System.out.println(complex4);
    }
}

class Complex{
    double a;
    double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + "+" + b +"i";
    }

    public Complex add(Complex complex){
        return new Complex(a+complex.a,b+complex.b);
    }

    public Complex minus(Complex complex){
        return new Complex(a-complex.a,b-complex.b);
    }

    public Complex pursue(Complex complex){
        return new Complex(a*complex.a-b*complex.b,a*complex.b+b*complex.a);
    }

    public boolean equal(Complex complex){
        return a==complex.a && b==complex.b;
    }


}