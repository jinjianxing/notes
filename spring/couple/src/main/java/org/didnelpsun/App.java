//App.java
package org.didnelpsun;
//项目入口

import org.didnelpsun.Common.Fruit;
import org.didnelpsun.Common.User;
import org.didnelpsun.Factory.FruitFactory;
import org.didnelpsun.Factory.UserFactory;
import org.didnelpsun.Service.Register;

public class App
{
    public static void main(String args[]){
        //利用工厂模式来构造一个Didnelpsun的User实例
//        User Didnelpsun = (User) UserFactory.getUserFactory();
//        //注册这个用户
//        Didnelpsun.setUsername("Didnelpsun");
//        Didnelpsun.setPassword("0824");
//        Register.registerUser(Didnelpsun);
        Fruit apple = (Fruit) FruitFactory.getFruitFactory("Apple");
        System.out.println(apple);
        apple = (Fruit) FruitFactory.getFruitFactory("Apple");
        System.out.println(apple);
        Fruit melon = (Fruit) FruitFactory.getFruitFactory("Melon");
        System.out.println(melon);
        melon = (Fruit) FruitFactory.getFruitFactory("Melon");
        System.out.println(melon);
        Fruit banana = (Fruit) FruitFactory.getFruitFactory("Banana");
        System.out.println(banana);
        banana = (Fruit) FruitFactory.getFruitFactory("Banana");
        System.out.println(banana);
    }
}
