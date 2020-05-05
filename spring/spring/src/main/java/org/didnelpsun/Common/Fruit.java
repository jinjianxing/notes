//Fruit.java
package org.didnelpsun.Common;

public interface Fruit {
    //定义水果价格属性
    public Integer price = 0;
    //定义对应的setter和getter方法
    public void setPrice(Integer price);
    public Integer getPrice();
    //定义一个tag方法返回对应的水果名
    public String tag();
}
