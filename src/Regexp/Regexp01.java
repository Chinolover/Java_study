package Regexp;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正则表达式演示
public class Regexp01 {
    public static void main(String[] args) {
        String text = "Spring框架是Java平台上的一种开源应用框架，提供具有控制反转特" +
                "性的容器。尽管Spring框架自身对编程模型没有限制，但其在Java应用中的频繁使用让它" +
                "备受青睐，以至于后来让它作为EJB（EnterpriseJavaBeans）模型的补充，甚至是替补。Spring框架" +
                "为开发提供了一系列的解决方案，比如利用控制反转的核心特性，并通过依赖注入实现控制反转来实现管理对象" +
                "生命周期容器化，利用面向切面编程进行声明式的事务管理，整合多种持久化技术管理数据访问，提供大量优秀的" +
                "Web框架方便开发等等。Spring框架具有控制反转（IOC）特性，IOC旨在方便项目维护和测试，它提供了一种通过" +
                "Java的反射机制对Java对象进行统一的配置和管理的方法。Spring框架利用容器管理对象的生命周期，容器可以" +
                "通过扫描XML文件或类上特定Java注解来配置对象，开发者可以通过依赖查找或依赖注入来获得对象。Spring框架具" +
                "有面向切面编程（AOP）框架，SpringAOP框架基于代理模式，同时运行时可配置；AOP框架主要针对模块之间的交叉" +
                "关注点进行模块化。Spring框架的AOP框架仅提供基本的AOP特性，虽无法与AspectJ框架相比，但通过与AspectJ" +
                "的集成，也可以满足基本需求。Spring框架下的事务管理、远程访问等功能均可以通过使用SpringAOP技术实" +
                "现。Spring的事务管理框架为Java平台带来了一种抽象机制，使本地和全局事务以及嵌套事务能够与保存点一起" +
                "工作，并且几乎可以在Java平台的任何环境中工作。Spring集成多种事务模板，系统可以通过事务模板、XML或Ja" +
                "va注解进行事务配置，并且事务框架集成了消息传递和缓存等功能。Spring的数据访问框架解决了开发人员在应用程" +
                "序中使用数据库时遇到的常见困难。它不仅对Java:JDBC、iBATS/MyBATIs、Hibernate、Java数据对象（JDO）、" +
                "ApacheOJB和ApacheCayne等所有流行的数据访问框架中提供支持，同时还可以与Spring的事务管理一起使用，为数" +
                "据访问提供了灵活的抽象。Spring框架最初是没有打算构建一个自己的WebMVC框架，其开发人员在开发过程中认为现" +
                "有的StrutsWe" +
                "b框架的呈现层和请求处理层之间以及请求处理层和模型之间的分离不够，于是创建了SpringMVC。";

        //1.创建一个正则表达式对象
        Pattern pattern = Pattern.compile("[a-zA-Z]+");


        //2.创建一个匹配器对象
        Matcher matcher = pattern.matcher(text);


        //3.循环匹配
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
