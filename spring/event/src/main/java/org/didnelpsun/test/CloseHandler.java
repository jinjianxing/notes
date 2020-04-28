//CloseHandler.java
package org.didnelpsun.test;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class CloseHandler implements ApplicationListener<ContextClosedEvent>{
    @Override
    public void onApplicationEvent(ContextClosedEvent CongtextClosedEvent){
        System.out.println("The application is closing...");
    }
}
