package com.pluralsight.kafka.producer;

import com.github.javafaker.Faker;
import com.pluralsight.kafka.producer.enums.Colors;
import com.pluralsight.kafka.producer.enums.DesignType;
import com.pluralsight.kafka.producer.enums.ProductType;
import com.pluralsight.kafka.producer.enums.UserId;
import com.pluralsight.kafka.producer.model.*;

public class EventGenerator {
    Faker faker = new Faker();

    public Event generateEvent() {
        return ImmutableEvent.builder()
                .user(generateRandomUser())
                .product(generateRandomProduct())
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
}
