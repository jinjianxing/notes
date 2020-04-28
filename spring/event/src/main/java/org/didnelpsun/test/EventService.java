//EventService.java
package org.didnelpsun.test;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EventService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
    public void publishEvent(){
        PrintEvent pe = new PrintEvent(this);
        publisher.publishEvent(pe);
    }
}
