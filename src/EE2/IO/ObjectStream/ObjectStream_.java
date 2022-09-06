package EE2.IO.ObjectStream;

//当我们需要不光是把字符输入进文件时，同样需要把相应的属性存入文件时就需要用到对象流

/*
eg. double 1.1 我们要将这个数据存入文件，正常情况无法区分它是字符型还是float或double，
    如果使用对象流，我们可以保存属性且恢复时依然能够保持

    1.序列化就是在保存数据时，保存数据的值和数据类型
    2.反序列化就是恢复数据时，恢复数据的值和数据类型

    注:需要让某个对象支持序列化机制，则必须让其类是可序列化的，则必须让类实现如下两个接口之一:
        Serializable    //这是一个标记接口，没有方法
        Externalizable  //该接口有方法需要实现，因此我们一般实现上面的Serializable接口
 */

/*  注意事项：
    1.读写顺序要一致
    2.序列化的类中建议添加SerialVersionUID，为了提高版本的兼容性
        eg.private static final long serialVersionUID = 1L
    3.序列化对象时，默认将里面的所有属性都进行序列化，但除了static和transient修饰的成员
    4.序列化对象时，要求里面的属性类型也需要实现序列化接口
    5.序列化具有可继承性，就是如果某类已经实现了序列化，它的所有子类也已经默认实现了序列化
 */
public class ObjectStream_ {
    public static void main(String[] args) {
        //ObjectOutputStream 提供序列化功能
        //ObjectInputStream 提供反序列化功能

    }
}
