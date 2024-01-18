package com.yadavanuj.github.jswift.entities;

public enum SlidingWindowType {
    COUNT_BASED("count-based"),
    TIME_BASED("time-based");

    private final String value;

    SlidingWindowType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
