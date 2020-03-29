//Hi.java
package org.didnelpsun.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("Hi")
public class Hi implements Say {
    private String words;
    //重写构造方法
    public Hi(){
        System.out.println("HiClass...");
    }
    @Override
    public void setWords(String sayword){
        this.words = sayword;
    }
    @Override
    public void SayWord() {
        System.out.println(this.words);
    }
}