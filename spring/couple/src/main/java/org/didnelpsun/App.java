//App.java
package org.didnelpsun;
//项目入口

import org.didnelpsun.Common.Fruit;
import org.didnelpsun.Factory.FruitFactory;

public class App
{
    public static void main(String args[]){
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