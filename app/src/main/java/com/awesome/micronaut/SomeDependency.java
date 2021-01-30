package com.awesome.micronaut;

import io.micronaut.context.event.ApplicationEventPublisher;

import javax.inject.Singleton;
import javax.inject.Inject;

@Singleton
public class SomeDependency {

    @Inject
    private SomeConfiguration someConfiguration;

    @Inject
    private ApplicationEventPublisher applicationEventPublisher;

    public void doStuff() {
        System.out.println("doing some stuff...");
    }

    public void publishEvent() {
        System.out.println("publishing event...");
        applicationEventPublisher.publishEvent(new SomeEvent(this));
    }

    public void consumeConfiguration() {
        System.out.println("The configuration value is: " + someConfiguration.getValue());
    }

}