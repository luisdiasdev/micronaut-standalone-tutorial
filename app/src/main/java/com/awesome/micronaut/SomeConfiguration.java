package com.awesome.micronaut;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("some.configuration")
public class SomeConfiguration {

    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}