package org.didnelpsun;
//项目入口
import org.didnelpsun.test.HelloWorld;
import org.didnelpsun.test.User;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


public class App 
{

    //获取私有属性，这个属性是应用文档属性
    private static DefaultListableBeanFactory welcomeContext;
    public static void main(String args[]){
        //将Spring beans配置文件引入，使里面的配置可以被使用
        DefaultListableBeanFactory welcomeContext = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(welcomeContext);//新增XMl阅读器
        reader.loadBeanDefinitions("SpringBeans.xml");
//        HelloWorld hello = (HelloWorld) welcomeContext.getBean("HelloWorldBean");
        User Didnelpsun = (User) welcomeContext.getBean("DidnelpsunBean");
        Didnelpsun.Say();
    }
}
