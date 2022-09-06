package SE1;

public class Operator {
    public static void main(String[] args) {
         boolean n1=true;
         boolean n2=false;
    //^为位运算，相当于相同为false，不相同为true
        //短路与，短路或相比直接比较更加节省时间，效率高
        System.out.println(n1^n2);

        // 赋值运算符在使用时，会在内部自动进行类型转换，如下
        byte n3=3;
//        n3=n3+2;      false 因为出现n3+2过程中已经变为int类型，而变为byte类型会造成数据流失
        n3+=2;  //这种能够运行，是因为实际情况为 n3=(byte)(n3+2); 会出现内部的类型强制转换 ，++同理

        //三元运算符懂得都懂
        int a=10,b=99;
        int result = a > b ? a++ : b--;

        }

    }
