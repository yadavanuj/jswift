package com.yadavanuj.github.jswift.libs;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
class NumberField extends Field {
    private Range range;
    @Getter
    @Builder
    static class Range {
        private int minimum;
        private int maximum;
    }
}
