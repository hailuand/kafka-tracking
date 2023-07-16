package com.hailu.kafka.model.internal.model;

import com.hailu.kafka.model.internal.enums.UserId;
import org.immutables.value.Value;

import java.util.Date;

@Value.Immutable
public interface InternalUser {
     UserId userId();

    String username();

    Date dateOfBirth();
}
