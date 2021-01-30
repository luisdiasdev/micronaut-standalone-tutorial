package com.awesome.micronaut;

import io.micronaut.context.event.ApplicationEvent;

public class SomeEvent extends ApplicationEvent {

    public SomeEvent(Object source) {
        super(source);
    }
}