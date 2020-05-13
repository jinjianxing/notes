//UserFactory.java
package org.didnelpsun.Factory;

import org.springframework.beans.factory.BeanFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class UserFactory {
    //使用properties格式的配置文件，所以使用到了java.util.properties的包
    private static Properties props;
    //因为是配置文件的导入，所以需要使用静态代码块来优先导入
    static {
        try {
            //实例化一个配置文件对象
            props = new Properties();
            //获取配置文件流对象
            //这里无法使用FileInputStream对象来创建数据流对象
            //因为这个配置文件不应该是绝对路径，后期可能会更改根路径，所以应该是相对路径
            //BeanFactory是Spring容器，class代表对应的实例化类，
            //getClassLoader就是找到对应的工程中包含Class的Java源文件夹，getResourceAsStream就是找到配置文件夹并以流形式传入，参数为对应的配置文件地址
            InputStream inStream = BeanFactory.class.getClassLoader().getResourceAsStream("Factory.properties");
            //使用load方法导入对应的配置文件
            props.load(inStream);
        }
        catch (IOException e) {
            System.out.println("初始化异常");
            e.printStackTrace();
            //可以使用下面的初始化异常
//            throw new ExceptionInInitializerError("初始化异常");
        }
    }
    //为了方便，所以返回实例的getUserFactory方法直接使用static作为静态方法，就不用实例化UserFactory了
    public static Object getUserFactory(){
        //因为我们没有直接导入User和UserMessage类，所以对应的返回值类型以及就无法使用User和UserMessage了
        //所以将原来的类型改为Object类型，做泛型处理
        //同时，user返回值将变为Object类型
        Object user = null;
        try{
            String UserPath = props.getProperty("User");
            user = Class.forName(UserPath).newInstance();
            //反射后这些私有方法都将失效，如果要设置就必须不能在反射的地方调用私有方法
//            user.setUsername(username);
//            user.setPassword(password);
//            user.setMessage(userMessage);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
    //同理下面另一个方法也因为无法调用私有方法而无法setter或者getter
}
