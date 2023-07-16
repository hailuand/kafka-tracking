package com.pluralsight.kafka.producer.model;

import org.immutables.value.Value;

@Value.Immutable
public interface Event {
    InternalUser user();

    InternalProduct product();
}
