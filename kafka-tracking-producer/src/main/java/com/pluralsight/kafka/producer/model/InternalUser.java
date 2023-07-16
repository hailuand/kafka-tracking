package com.pluralsight.kafka.producer.model;

import com.pluralsight.kafka.producer.enums.UserId;
import org.immutables.value.Value;

import java.util.Date;

@Value.Immutable
public interface InternalUser {
    UserId userId();

    String username();

    Date dateOfBirth();
}
