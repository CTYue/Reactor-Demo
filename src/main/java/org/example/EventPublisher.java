package org.example;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class EventPublisher {

    public Flux<String> publishEvents() {
        return Flux.just("Event 4", "Event 5", "Event 6")
                .delayElements(Duration.ofSeconds(2))
                .doOnSubscribe(subscription -> System.out.println("Event publisher subscribed at "+System.currentTimeMillis()))
                .doOnNext(event -> System.out.println("Event publisher emits: " + event))
                .doOnComplete(() -> System.out.println("Event publisher completed at "+System.currentTimeMillis()));
    }
}
