package org.didnelpsun.test;

public class User {
    private HelloWorld helloWorld;
    private String words;
    private Integer age;
    private String password;
    public void setHelloWorld(HelloWorld helloWorld){
        this.helloWorld = helloWorld;
    }
    public void setWords(String words){
        this.words = words;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void SayHello(){
        helloWorld.saySomeThing();
        System.out.println("age:"+age+" password:"+password+" want to say:"+words);
    }
}
