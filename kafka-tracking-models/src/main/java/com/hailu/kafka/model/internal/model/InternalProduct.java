package com.hailu.kafka.model.internal.model;

import com.hailu.kafka.model.internal.enums.Colors;
import com.hailu.kafka.model.internal.enums.DesignType;
import com.hailu.kafka.model.internal.enums.ProductType;
import org.immutables.value.Value;

@Value.Immutable
public interface InternalProduct {
    DesignType designType();
    Colors color();
    ProductType productType();
}
