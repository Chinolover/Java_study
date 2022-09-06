package EE2.IO.File;

import org.junit.jupiter.api.Test;

import java.io.File;

public class File02 {
    public static void main(String[] args) {
        File file2 = new File("e:\\new3");
        System.out.println(file2.mkdir());  //创建一个名字为new3的目录,成功返回true，失败返回false
        File file3 = new File("e:\\demo\\a\\b\\c");
        System.out.println(file3.mkdirs()); //创建多级目录，成功返回true，失败返回false
    }

    @Test
    public void info() {
        //创建文件对象
        File file = new File("e:\\new1.txt");

        //调用相关方法，得到对应信息
        System.out.println("文件名字为" + file.getName());
        //getName、getAbsolutePath、getParent、length、exists、isFile、isDirectory
        System.out.println("文件绝对路径为" + file.getAbsolutePath());
        System.out.println("文件父级目录为" + file.getParent());
        System.out.println("文件大小为(字节)" + file.length());
        System.out.println("文件是否存在" + file.exists());//T
        System.out.println("是不是一个文件" + file.isFile());//T
        System.out.println("是不是一个目录" + file.isDirectory());//F
    }
}

