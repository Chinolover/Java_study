package EE.String;

/*
1.StringBuffer 的value数组存放字符串，引出存放在堆中的
2.不用每次都更换地址(即不是每次创建新对象),所以效率高于String
3.StringBuffer 是一个容器
*/
public class StringBuffer_ {
    public static void main(String[] args) {

    //构造方法
        StringBuffer first = new StringBuffer();    //构造一个不带字符的字符串缓冲区，初始容量为16个字符(可Debug深追)
        StringBuffer twice = new StringBuffer(20);//构造一个不带字符但具有指定初始容量的字符串缓冲区，即对char[]大小进行指定
        StringBuffer third = new StringBuffer("abcabc");//构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容

        //String -> StringBuffer
        String str = "Hello Tom";
        StringBuffer stringBuffer = new StringBuffer(str);//方式一

        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);  //方式二

        //StringBuffer -> String
        StringBuffer stringBuffer2 = new StringBuffer("abcde");
        String s = stringBuffer2.toString(); //方式一

        String s1 = new String(stringBuffer2);  //方式二
    }
}

