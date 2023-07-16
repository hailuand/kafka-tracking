package com.hailu.kafka.model.internal.model;

import org.immutables.value.Value;

@Value.Immutable
public interface Event {
    InternalUser user();

    InternalProduct product();

    InternalOrder order();
}
