package com.hailu.kafka.model.internal;


import com.github.javafaker.Faker;
import com.hailu.kafka.model.internal.enums.Colors;
import com.hailu.kafka.model.internal.enums.DesignType;
import com.hailu.kafka.model.internal.enums.ProductType;
import com.hailu.kafka.model.internal.enums.UserId;
import com.hailu.kafka.model.internal.model.*;

public class EventGenerator {
    Faker faker = new Faker();

    public Event generateEvent() {
        return ImmutableEvent.builder()
                .user(generateRandomUser())
                .product(generateRandomProduct())
                .order(generateRandomOrder())
                .build();
    }

    public InternalProduct generateRandomProduct() {
        return ImmutableInternalProduct.builder()
                .color(faker.options().option(Colors.class))
                .designType(faker.options().option(DesignType.class))
                .productType(faker.options().option(ProductType.class))
                .build();
    }

    public InternalUser generateRandomUser() {
        return ImmutableInternalUser.builder()
                .userId(faker.options().option(UserId.class))
                .dateOfBirth(faker.date().birthday())
                .username(faker.name().lastName())
                .build();
    }

    public InternalOrder generateRandomOrder() {
        return ImmutableInternalOrder.builder()
                .userId(faker.options().option(UserId.class))
                .nbOfItems(faker.number().randomDigitNotZero())
                .totalAmount(faker.number().randomDigitNotZero())
                .build();
    }
}
