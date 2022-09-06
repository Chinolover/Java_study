package EE.Arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Arrays01 {
    public static void main(String[] args) {
        //Arrays里面包含了一系列静态方法，用于管理或操作数组(比如排序和搜索)

        //toString 返回数组的字符串形式
        Integer []a = {1,4,8,0,10,6};
        System.out.println(Arrays.toString(a));

        //sort 排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Arrays.sort(a, new Comparator() {//自定义排序
            @Override
            public int compare(Object o1, Object o2) {
                int a1 = (Integer) o1;
                int a2 = (Integer) o2;
                return a1-a2;   //这里返回大于0为正序，小于0为逆序
            }
        });
        System.out.println(Arrays.toString(a));

        //binarySearch 通过二分搜索进行查找,要求必须排好序
        int index = Arrays.binarySearch(a,10);
        System.out.println(index);

        //copyOf ,拷贝a.length个元素到新数组中
        Integer []arrs = Arrays.copyOf(a,a.length-1);
        System.out.println(Arrays.toString(arrs));  //如果拷贝长度大于原数组，则新增null

        //fill 数组元素填充
        Arrays.fill(arrs,521);
        System.out.println(Arrays.toString(arrs));

        //equals 比较两个数组元素内容是否完全一致
        boolean equals = Arrays.equals(arrs,a);
        System.out.println(equals);

        //asList 将一组值，转换成list集合
        List asList = Arrays.asList(arrs);
        System.out.println(asList.toString());

    }
}
