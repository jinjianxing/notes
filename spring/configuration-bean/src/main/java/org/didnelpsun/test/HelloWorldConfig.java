package org.didnelpsun.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld HelloWorld(){
        HelloWorld hello = new HelloWorld();
        hello.setWords("Hello");
        return hello;
    }
    @Bean
    public User User(){
        User user = new User();
        user.setHelloWorld(HelloWorld());
        user.setAge(19);
        user.setPassword("PassWord!");
        user.setWords("Hi");
        return user;
    }
}
