//HelloWorld.java
package org.didnelpsun.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Component
@Named("HelloWorld")
public class HelloWorld implements Say {
    private String words;
    //重写构造方法
    public HelloWorld(){ System.out.println("HelloWorldClass..."); }
    @Override
    public void setWords(String sayword){ this.words = sayword; }
    @Override
    public void SayWord() { System.out.println(this.words); }
}