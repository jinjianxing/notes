//Melon.java
package org.didnelpsun.Common;

public class Melon implements Fruit {
    //默认价格
    private Integer price = 12;
    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }
    @Override
    public Integer getPrice() {
        return price;
    }
    @Override
    public String tag() {
        return "Melon";
    }
}
