package org.didnelpsun;
//项目入口
import org.didnelpsun.test.EventService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{

    //获取私有属性，这个属性是应用文档属性
    private static ConfigurableApplicationContext welcomeContext;
    public static void main(String args[]){
        //将Spring beans配置文件引入，使里面的配置可以被使用
        welcomeContext = new ClassPathXmlApplicationContext("SpringBeans.xml");
        EventService service = (EventService) welcomeContext.getBean("EventPublisher");
        service.publishEvent();
    }
}
