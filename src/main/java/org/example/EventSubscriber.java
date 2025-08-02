package org.example;

import reactor.core.publisher.Flux;

public class EventSubscriber {
    public void subscribeToEvents(Flux<String> events) {
        //Events will be executed only when subscribed (lazy execution)
        events.subscribe(event -> System.out.println("Event subscriber receives: " + event + " on Thread: "+
                Thread.currentThread().getName()),
                error -> System.err.println("Event subscriber error: "+error),
                ()-> System.out.println("Event subscriber completed"));
    }
}
