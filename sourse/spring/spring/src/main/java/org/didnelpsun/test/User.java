package org.didnelpsun.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    private static final String username = "Didnelpsun";
    @Autowired
    private HelloWorld helloWorld;
//    public void setHelloWorld(HelloWorld helloWorld){
//        this.helloWorld = helloWorld;
//    }
    public void Say(){
        System.out.println(this.username);
    }
}
