//App.java
package org.didnelpsun;
//项目入口
import org.didnelpsun.test.HelloWorld;
import org.didnelpsun.test.Hi;
import org.didnelpsun.test.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class App
{
    //获取私有属性，这个属性是应用文档属性
    private static ApplicationContext welcomeContext;
    public static void main(String args[]){
//        welcomeContext = new ClassPathXmlApplicationContext("SpringBeans.xml");
        welcomeContext = new AnnotationConfigApplicationContext(App.class);
//        HelloWorld hello = (HelloWorld) welcomeContext.getBean("HelloWorldBean1");
//        hello.setWords("welcome!");
//        或者在xml中配置<property name="words" value="hello"/>
//        User Didnelpsun = (User) welcomeContext.getBean("UserBean");
        welcomeContext = new AnnotationConfigApplicationContext(App.class);
        User Didnelpsun = welcomeContext.getBean(User.class);
        HelloWorld hello = welcomeContext.getBean(HelloWorld.class);
        hello.setWords("Hello");
        Hi hi = (Hi)welcomeContext.getBean(Hi.class);
        hi.setWords("Hi");
        Didnelpsun.Say();
    }
}