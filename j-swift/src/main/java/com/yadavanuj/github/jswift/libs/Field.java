package com.yadavanuj.github.jswift.libs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Field {
    private String name;
    private String description;
    private boolean required;
    private FieldType fieldType;
    private ViewProps viewProps;

    @Getter
    @SuperBuilder
    static class ViewProps {
        /**
         * TODO: PLEASE_CONTRIBUTE
         * Name it better later
         */
        private String fieldHint;
    }
}
