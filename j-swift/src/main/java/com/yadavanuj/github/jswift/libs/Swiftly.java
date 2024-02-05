package com.yadavanuj.github.jswift.libs;

public class Swiftly {
    public static void main(String[] args) {
        Field field = NumberField.builder()
                .fieldType(FieldType.Number)
                .range(NumberField.Range.builder().minimum(0).maximum(100).build())
                .required(true)
                .build();

        System.out.println(field);
    }
}
