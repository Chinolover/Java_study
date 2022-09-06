package SE1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        String name=input.next();   //接受用户输入
        System.out.println(name);
        char key=input.next().charAt(0);    //输入一个字符
        int age=input.nextInt();
        System.out.println(age);
/*        这里有个细节，System.out.println();
        ,System.out.print();上者会自动换行，而下者不会自动换行就可输出在同一行*/
    }

}
