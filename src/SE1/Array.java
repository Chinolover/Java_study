package SE1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []b={1,2,3,4,5}; //静态初始化
        int []a=new int[5]; //动态初始化
     /*   for (int i=0;i<a.length;i++)
            a[i]= input.nextInt();
*/
        //数组在默认情况下是引用传递，赋的值是地址，为引用赋值
        //因为是地址arr2变化会影响到arr1
        int []arr1={1,2,3};
        int []arr2=arr1;
        arr2[0]=10;
        for(int j=0;j<arr1.length;j++)
            System.out.println(arr1[j]);

        //这里会发现arr1的值被改变了，这就是引用传递,相当于C++地址传递

        /*数组扩容*/
        int []arr ={1,2,3};
       /* 方法一：定义一个新的数组，遍历arr数组，依次将元素拷贝至新数组
       然后arr指向新的数组，原来的数组就被销毁 */
        int []arrnew=new int [arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arrnew[i] = arr[i];
        }
        arrnew[arrnew.length - 1] = 4;
        arr = arrnew;
        for(int j : arrnew)     //foreach
            System.out.println(j);

      /*  动态添加数组，可以不断输入继续扩容数组*/
     /*   使用 do-while，不断添加创建数组即可，以f为结束标志*/
        String[] names={"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        System.out.println("请输入名字");
        String findName = input.next();

        for(int k=0;k< names.length;k++){
            if(findName.equals(names[k]))
                System.out.println("恭喜你找到"+findName);
        }
    }
}
