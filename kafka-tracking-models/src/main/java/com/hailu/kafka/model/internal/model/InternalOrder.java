package com.hailu.kafka.model.internal.model;

import com.hailu.kafka.model.internal.enums.UserId;
import org.immutables.value.Value;

@Value.Immutable
public interface InternalOrder {
    UserId userId();
    int nbOfItems();
    int totalAmount();
}
