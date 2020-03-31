package org.didnelpsun;
//项目入口
import org.didnelpsun.test.HelloWorld;
import org.didnelpsun.test.HelloWorldConfig;
import org.didnelpsun.test.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{

    //获取私有属性，这个属性是应用文档属性
    private static ApplicationContext welcomeContext;
    public static void main(String args[]){
        //将Spring beans配置文件引入，使里面的配置可以被使用
//        welcomeContext = new ClassPathXmlApplicationContext("SpringBeans.xml");
//        HelloWorld hello = (HelloWorld) welcomeContext.getBean("HelloWorldBean");
        welcomeContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        User hello = welcomeContext.getBean(User.class);
        hello.SayHello();
    }
}
