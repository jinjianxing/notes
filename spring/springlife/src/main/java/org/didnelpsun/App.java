package org.didnelpsun;
//项目入口
import org.didnelpsun.test.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    //获取私有属性，这个属性是应用文档属性
    public static void main(String args[]){
        //将Spring beans配置文件引入，使里面的配置可以被使用
        AbstractApplicationContext welcomeContext = new ClassPathXmlApplicationContext("SpringBeans.xml");
        HelloWorld hello1 = (HelloWorld) welcomeContext.getBean("HelloWorldBean");
        hello1.setWords("hello1");
        hello1.saySomeThing();
        welcomeContext.registerShutdownHook();
    }
}
