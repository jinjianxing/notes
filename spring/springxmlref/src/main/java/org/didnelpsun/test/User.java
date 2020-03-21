package org.didnelpsun.test;

public class User {
    private static final String username = "Didnelpsun";
    private HelloWorld helloWorld;
    public void setHelloWorld(HelloWorld helloWorld){
        this.helloWorld = helloWorld;
    }
    public void Say(){
        System.out.println(this.username);
        this.helloWorld.SayHello();
    }
}
