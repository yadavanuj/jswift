package com.yadavanuj.github.jswift.libs;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Add model fields
 * Add view props
 */

@Getter
@Builder
public
class Model {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<Field.FieldBuilder<?, ?>> builders = new ArrayList<>();
    private List<Field> fields = new ArrayList<>();

    public static ModelBuilder builder() {
        return new CustomModelBuilder();
    }

    private static class CustomModelBuilder extends ModelBuilder {
        public Field.FieldBuilder<?, ?> addField(String name) {
            Field.FieldBuilder<?, ?> builder = Field.builder().name(name);
            super.builders.add(builder);
            return Field.builder().name(name);
        }

        @Override
        public Model build() {
            super.builders.forEach((builder) -> {
                super.fields.add(builder.build());
            });
            super.builders(null);
            return super.build();
        }
    }
}
