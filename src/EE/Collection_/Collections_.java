package EE.Collection_;

import java.util.*;

public class Collections_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //Collections 是集合工具类，具有很多静态方法

        List vector = new Vector();

        vector.add("wxh");
        vector.add("lcl");
        vector.add("zl");
        vector.add("abcd");
        vector.add("lcl");

        Collections.sort(vector);   //排序方法 只可用于List集合
        //这里同样可以重写比较器来改变排序的方式
        System.out.println(vector);

        Collections.reverse(vector);    //反转方法
        System.out.println(vector);

        Collections.shuffle(vector);    //对集合元素进行随机排序
        System.out.println(vector);

        Collections.sort(vector);
        //注意！！！二分查找之前一定要先进行排序
        System.out.println(Collections.binarySearch(vector,"lcl")); //二分查找

        Collections.swap(vector,0,1);
        System.out.println(vector);//交换元素位置

        System.out.println(Collections.max(vector));    //返回最大值，同样可以重写比较器

        System.out.println(Collections.min(vector, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).length() - ((String)o1).length();
            }
        }));    //返回最小值，同样可以重写比较器

        System.out.println(Collections.frequency(vector,"lcl"));    //返回出现的次数

//        Vector objects = new Vector();
//        Collections.copy(objects,vector);
//        这里直接调用会抛出异常

        Vector objects = new Vector();
        //为了完成一个完整拷贝，我们需要先给objects赋值，大小和vector.size()一样
        for (int i = 0; i < vector.size(); i++) {
            objects.add(" ");
        }
        Collections.copy(objects,vector);   //copy
        System.out.println(objects);

//        boolean replaceAll(List list,Object oldVal,Object newVal);使用新值替换List对象的所有旧值
        Collections.replaceAll(vector,"lcl","猪猪猪"); //按值替换
        System.out.println(vector);


    }
}
