package EE.Collection_.List_;

import java.util.ArrayList;
import java.util.List;

//List集合类中元素有序，且可重复
public class list {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        //List集合每个元素都有其对应的顺序索引
        arrayList.add("hsp");
        arrayList.add("wxh");
        System.out.println(arrayList.get(1));

        //如果想要在位置插入的话
        arrayList.add(1,"lsp");
        System.out.println(arrayList);

        //addAll 在某个位置插入一个集合
        List list = new ArrayList();
        list.add(123);
        list.add(true);
        list.add("wxh");
        arrayList.addAll(2,list);
        System.out.println(arrayList);

        //indexOf 返回第一次出现的位置索引
        System.out.println(arrayList.indexOf("wxh"));

        //lastindexOf 返回最后一次出现的位置索引
        System.out.println(arrayList.lastIndexOf("wxh"));

        //set 替换
        arrayList.set(2,"wxhwxh");
        System.out.println(arrayList);

        //subList 切片
        List returnlist = arrayList.subList(1,4);   //左闭右开
        System.out.println(returnlist);

    }
}
