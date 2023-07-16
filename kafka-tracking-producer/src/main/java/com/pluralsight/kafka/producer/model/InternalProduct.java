package com.pluralsight.kafka.producer.model;

import com.pluralsight.kafka.producer.enums.Colors;
import com.pluralsight.kafka.producer.enums.DesignType;
import com.pluralsight.kafka.producer.enums.ProductType;
import org.immutables.value.Value;

@Value.Immutable
public interface InternalProduct {
    DesignType designType();
    Colors color();
    ProductType productType();
}
