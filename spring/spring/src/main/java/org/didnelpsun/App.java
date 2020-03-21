package org.didnelpsun;
//项目入口
import org.didnelpsun.test.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{

    //获取私有属性，这个属性是应用文档属性
    private static ApplicationContext welcomeContext;
    public static void main(String args[]){
        //将Spring beans配置文件引入，使里面的配置可以被使用
        welcomeContext = new ClassPathXmlApplicationContext("SpringBeans.xml");
        HelloWorld hello = (HelloWorld) welcomeContext.getBean("HelloWorldBean");
        hello.saySomeThing();
    }
}
