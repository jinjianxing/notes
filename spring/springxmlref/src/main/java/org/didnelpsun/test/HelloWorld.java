package org.didnelpsun.test;

public class HelloWorld {
    private String words;
    //重写构造方法
    public HelloWorld(){
        System.out.println("HelloWorldClass...");
    }
    public void setWords(String words) {
        this.words = words;
    }
    //动作方法
    public void SayHello(){
        System.out.println(this.words);
    }
}