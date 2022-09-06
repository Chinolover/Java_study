package SE1;

public class Array2 {
    public static void main(String[] args) {
//        int[] x,y[];    x为以为数组，y为二维数组，因为[]x[]为二维数组类型
        //1.静态初始化
        int [][]arr ={{0,0,0,0,0,0},
                      {0,0,1,0,0,0},
                      {0,2,0,3,0,0},
                      {0,0,0,0,0,0}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.print("\n");
        }
        //2.动态初始化
        int [][]arr1 =new int[10][];
            for (int i = 0; i < arr1.length ; i++) {
                arr1[i] = new int[i + 1];
                for (int j = 0; j < arr1[i].length;j++)
                    arr1[i][j]=i+1;
            }
            for (int i = 0; i < arr1.length ; i++) {
                for (int j = 0; j < arr1[i].length; j++)
                    System.out.print(arr1[i][j] + " ");
                System.out.println();
            }







}
}

