//FruitFactory.java
package org.didnelpsun.Factory;

import org.didnelpsun.Common.Fruit;
import org.springframework.beans.factory.BeanFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FruitFactory {
    //使用properties格式的配置文件，所以使用到了java.util.properties的包
    private static Properties props;
    //新建一个Map对象，作为保存实例的容器
    private static Map<String,Object> beans;

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
            //开始实例化容器，赋值为一个Hash类型的Map容器，因为不清楚实例类型，所以全部按照Object作泛型处理
            beans = new HashMap<String, Object>();
            //取出所有配置文件中的keys值，这个值是一个枚举值
            Enumeration<Object> keys = props.keys();
            while(keys.hasMoreElements()){
                //取出key值
                String key = keys.nextElement().toString();
                //根据key取出value的路径
                String beanPath = props.getProperty(key);
                Object value = Class.forName(beanPath).newInstance();
                //将对应的key和实例放到Map容器中
                beans.put(key,value);
            }
        }
        catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println("初始化异常");
            e.printStackTrace();
            //可以使用下面的初始化异常
//            throw new ExceptionInInitializerError("初始化异常");
        }
    }
    public static Fruit getFruitFactory(String fruitName){
        //直接根据传入的名字来找到容器中的实例并返回
        return (Fruit) beans.get(fruitName);
    }
}
