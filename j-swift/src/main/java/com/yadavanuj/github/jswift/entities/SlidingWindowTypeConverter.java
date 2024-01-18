package com.yadavanuj.github.jswift.entities;

import jakarta.persistence.AttributeConverter;

public class SlidingWindowTypeConverter implements AttributeConverter<SlidingWindowType, String> {
    @Override
    public String convertToDatabaseColumn(SlidingWindowType attribute) {
        return null;
    }

    @Override
    public SlidingWindowType convertToEntityAttribute(String dbData) {
        return null;
    }
}
