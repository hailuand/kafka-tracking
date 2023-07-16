package com.hailu.kafka.model.internal.model;

import com.hailu.kafka.model.internal.enums.Colors;
import com.hailu.kafka.model.internal.enums.DesignType;
import com.hailu.kafka.model.internal.enums.ProductType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link InternalProduct}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInternalProduct.builder()}.
 */
@Generated(from = "InternalProduct", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableInternalProduct implements InternalProduct {
  private final DesignType designType;
  private final Colors color;
  private final ProductType productType;

  private ImmutableInternalProduct(
      DesignType designType,
      Colors color,
      ProductType productType) {
    this.designType = designType;
    this.color = color;
    this.productType = productType;
  }

  /**
   * @return The value of the {@code designType} attribute
   */
  @Override
  public DesignType designType() {
    return designType;
  }

  /**
   * @return The value of the {@code color} attribute
   */
  @Override
  public Colors color() {
    return color;
  }

  /**
   * @return The value of the {@code productType} attribute
   */
  @Override
  public ProductType productType() {
    return productType;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InternalProduct#designType() designType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for designType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInternalProduct withDesignType(DesignType value) {
    DesignType newValue = Objects.requireNonNull(value, "designType");
    if (this.designType == newValue) return this;
    return new ImmutableInternalProduct(newValue, this.color, this.productType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InternalProduct#color() color} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for color
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInternalProduct withColor(Colors value) {
    Colors newValue = Objects.requireNonNull(value, "color");
    if (this.color == newValue) return this;
    return new ImmutableInternalProduct(this.designType, newValue, this.productType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InternalProduct#productType() productType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for productType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInternalProduct withProductType(ProductType value) {
    ProductType newValue = Objects.requireNonNull(value, "productType");
    if (this.productType == newValue) return this;
    return new ImmutableInternalProduct(this.designType, this.color, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInternalProduct} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInternalProduct
        && equalTo(0, (ImmutableInternalProduct) another);
  }

  private boolean equalTo(int synthetic, ImmutableInternalProduct another) {
    return designType.equals(another.designType)
        && color.equals(another.color)
        && productType.equals(another.productType);
  }

  /**
   * Computes a hash code from attributes: {@code designType}, {@code color}, {@code productType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + designType.hashCode();
    h += (h << 5) + color.hashCode();
    h += (h << 5) + productType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code InternalProduct} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "InternalProduct{"
        + "designType=" + designType
        + ", color=" + color
        + ", productType=" + productType
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link InternalProduct} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InternalProduct instance
   */
  public static ImmutableInternalProduct copyOf(InternalProduct instance) {
    if (instance instanceof ImmutableInternalProduct) {
      return (ImmutableInternalProduct) instance;
    }
    return ImmutableInternalProduct.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInternalProduct ImmutableInternalProduct}.
   * <pre>
   * ImmutableInternalProduct.builder()
   *    .designType(com.hailu.kafka.model.internal.enums.DesignType) // required {@link InternalProduct#designType() designType}
   *    .color(com.hailu.kafka.model.internal.enums.Colors) // required {@link InternalProduct#color() color}
   *    .productType(com.hailu.kafka.model.internal.enums.ProductType) // required {@link InternalProduct#productType() productType}
   *    .build();
   * </pre>
   * @return A new ImmutableInternalProduct builder
   */
  public static ImmutableInternalProduct.Builder builder() {
    return new ImmutableInternalProduct.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInternalProduct ImmutableInternalProduct}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "InternalProduct", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_DESIGN_TYPE = 0x1L;
    private static final long INIT_BIT_COLOR = 0x2L;
    private static final long INIT_BIT_PRODUCT_TYPE = 0x4L;
    private long initBits = 0x7L;

    private DesignType designType;
    private Colors color;
    private ProductType productType;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code InternalProduct} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(InternalProduct instance) {
      Objects.requireNonNull(instance, "instance");
      designType(instance.designType());
      color(instance.color());
      productType(instance.productType());
      return this;
    }

    /**
     * Initializes the value for the {@link InternalProduct#designType() designType} attribute.
     * @param designType The value for designType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder designType(DesignType designType) {
      this.designType = Objects.requireNonNull(designType, "designType");
      initBits &= ~INIT_BIT_DESIGN_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link InternalProduct#color() color} attribute.
     * @param color The value for color 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder color(Colors color) {
      this.color = Objects.requireNonNull(color, "color");
      initBits &= ~INIT_BIT_COLOR;
      return this;
    }

    /**
     * Initializes the value for the {@link InternalProduct#productType() productType} attribute.
     * @param productType The value for productType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder productType(ProductType productType) {
      this.productType = Objects.requireNonNull(productType, "productType");
      initBits &= ~INIT_BIT_PRODUCT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableInternalProduct ImmutableInternalProduct}.
     * @return An immutable instance of InternalProduct
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInternalProduct build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableInternalProduct(designType, color, productType);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_DESIGN_TYPE) != 0) attributes.add("designType");
      if ((initBits & INIT_BIT_COLOR) != 0) attributes.add("color");
      if ((initBits & INIT_BIT_PRODUCT_TYPE) != 0) attributes.add("productType");
      return "Cannot build InternalProduct, some of required attributes are not set " + attributes;
    }
  }
}
