//User.java
package org.didnelpsun.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Component
@Named("User")
public class User {
    private static final String username = "Didnelpsun";
//    @Autowired
    private Say say;
//    @Autowired
//    @Qualifier("HelloWorld")
//    @Resource(name = "HelloWorldBean1")
    @Inject
//    @Named("HelloWorldBean1")
    public void setHelloWorld(HelloWorld sayword){
        say = sayword;
    }
    public void Say(){
        System.out.println(this.username);
        say.SayWord();
    }
}