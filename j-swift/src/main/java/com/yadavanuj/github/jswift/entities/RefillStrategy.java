package com.yadavanuj.github.jswift.entities;

public enum RefillStrategy {
    LAZY("lazy"),
    EAGER("eager");

    private final String value;

    RefillStrategy(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
