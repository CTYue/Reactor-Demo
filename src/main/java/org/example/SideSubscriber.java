package org.example;

import reactor.core.publisher.Flux;

public class SideSubscriber {
    public void subscribeToEvents(Flux<String> events) {
        //Events will be executed only when subscribed (lazy execution)
        events.subscribe(event -> System.out.println("Side subscriber receives: " + event + " on Thread: "+
                        Thread.currentThread().getName()),
                error -> System.err.println("Side subscriber error: "+error),
                ()-> System.out.println("Side subscriber completed"));
    }
}
