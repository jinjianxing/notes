//PrintHandler.java
package org.didnelpsun.test;
import org.springframework.context.ApplicationListener;

public class PrintHandler implements ApplicationListener<PrintEvent> {
    @Override
    public void onApplicationEvent(PrintEvent event) {
        System.out.println(event.toString());
    }
}
