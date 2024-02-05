package com.yadavanuj.github.jswift.libs;

public enum FieldType {
    String,
    /**
     * TODO: NUMBER_TYPE_HANDLING
     * We will see later how to differentiate between integer,
     * floats, decimal etc. and what support we need today and
     * how to extend.
     */
    Number,
    Reference,
    Boolean,
    Array
}
