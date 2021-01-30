package com.awesome.micronaut;

import io.micronaut.context.event.ApplicationEventListener;

import javax.inject.Singleton;

@Singleton
public class SomeEventListener implements ApplicationEventListener<SomeEvent> {

    @Override
    public boolean supports(SomeEvent event) {
        return true;
    }

    @Override
    public void onApplicationEvent(SomeEvent event) {
        System.out.println("Received an event!");
    }
}