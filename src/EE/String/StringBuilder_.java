package EE.String;

//一个可变的字符序列，此类提供一个与StringBuffer兼容的API，但不保证同步(StringBuilder不是线程安全)
//该类被设计用作StringBuffer的简易替换

//用在字符串缓冲区被单个线程使用的时候！！！

//如果可能，优先使用该类，因为在大多数实现中，它比StringBuffer要快

//StringBuilder上的主要操作是append和insert方法，可以重载这些方法，以接受任意类型的数据

//可以串行化(文件保存和网络传输)

//StringBuilder的方法，没有synchronized关键字，没有做互斥处理，因此在单线程的情况下使用

//StringBuffer:可变字符序列，效率较高，线程安全,多线程使用
//StringBuilder:可变字符序列，效率最高，线程不安全，单线程使用
//如果我们对String做大量修改，不要使用String
//效率：StringBuilder > StringBuffer > String
public class StringBuilder_ {
    public static void main(String[] args) {
        //方法与StringBuilder一致，不做解释
    }
}
