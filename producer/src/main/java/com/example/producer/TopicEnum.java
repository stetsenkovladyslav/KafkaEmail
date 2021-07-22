package com.example.producer;

public enum TopicEnum {

    EMAIL_EVENTS("email-events");
    private final String name;

    TopicEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
