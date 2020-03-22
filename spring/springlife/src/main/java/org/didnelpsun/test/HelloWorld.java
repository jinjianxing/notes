package org.didnelpsun.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld implements InitializingBean,DisposableBean, BeanPostProcessor {
    // 私有变量words
    private String words;
    private String user = "Didnelpsun";
    //如果我们要对这个类的属性赋值，那么一定要是set开头，如果需要参数就要传入参数
    //参数的配置在resource的xml配置文件中，参数的名字应该对应
    public void setWords(String words){
        this.words = words;
    }
    public void initmethod(){
        this.words = "init-method";
        System.out.println("init-method");
    }
    public void defaultinit(){
        this.words="defaultinit";
        System.out.println("default-init-method");
    }
    @Override
    public void afterPropertiesSet() throws Exception{
        this.words = "afterPropertiesSet";
        System.out.println("afterPropertiesSet");
    }
    @PostConstruct
    public void postconstruct(){
        this.words = "@PostConstruct";
        System.out.println("@PostConstruct");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization");
        return null;
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization");
        return null;
    }

    public void saySomeThing(){
        System.out.println(this.user +" says "+ this.words);
    }
    public void destroymethod(){
        System.out.println("destroy-method");
    }
    @PreDestroy
    public void predestroy(){
        System.out.println("@PreDestroy");
    }
    public void defaultdestroy(){
        System.out.println("default-destroy-method");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}
