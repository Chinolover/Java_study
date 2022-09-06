package SE2;

//代码块基本语法
/*  修饰符{

        };
修饰符可选，要写的话，也只能写static   */

public class 代码块 {
    public static void main(String[] args) {
        movie test1 = new movie("鸡汤来咯");
        //运行完我们发现代码块的执行要比构造器优先
    }
}

class movie {
    private String name;
    private int year;
    private String director;

    {
        System.out.println("啊哈哈哈哈.....");
        System.out.println("鸡汤来咯....");
    };//这里的分号可有可无
    //此时我每个构造器前都想输出一句话，但是打三遍太麻烦，这时候就可以使用代码块
    public movie(String name) {
        System.out.println("构造器执行");
        this.name = name;
    }

    public movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public movie(String name, int year, String director) {
        this.name = name;
        this.year = year;
        this.director = director;
    }
}