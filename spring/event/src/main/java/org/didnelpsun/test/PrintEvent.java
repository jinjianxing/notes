package org.didnelpsun.test;
import org.springframework.context.ApplicationEvent;

public class PrintEvent extends ApplicationEvent {
    public PrintEvent(Object father){
        super(father);
        System.out.println("PrintEvent start");
    }
    public String toString(){
        return "PrintEvent";
    }
}
