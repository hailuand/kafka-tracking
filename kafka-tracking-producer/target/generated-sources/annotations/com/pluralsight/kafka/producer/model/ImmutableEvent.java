package com.pluralsight.kafka.producer.model;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Event}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEvent.builder()}.
 */
@Generated(from = "Event", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableEvent implements Event {
  private final InternalUser user;
  private final InternalProduct product;

  private ImmutableEvent(
      InternalUser user,
      InternalProduct product) {
    this.user = user;
    this.product = product;
  }

  /**
   * @return The value of the {@code user} attribute
   */
  @Override
  public InternalUser user() {
    return user;
  }

  /**
   * @return The value of the {@code product} attribute
   */
  @Override
  public InternalProduct product() {
    return product;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Event#user() user} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for user
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEvent withUser(InternalUser value) {
    if (this.user == value) return this;
    InternalUser newValue = Objects.requireNonNull(value, "user");
    return new ImmutableEvent(newValue, this.product);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Event#product() product} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for product
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEvent withProduct(InternalProduct value) {
    if (this.product == value) return this;
    InternalProduct newValue = Objects.requireNonNull(value, "product");
    return new ImmutableEvent(this.user, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEvent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEvent
        && equalTo(0, (ImmutableEvent) another);
  }

  private boolean equalTo(int synthetic, ImmutableEvent another) {
    return user.equals(another.user)
        && product.equals(another.product);
  }

  /**
   * Computes a hash code from attributes: {@code user}, {@code product}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + user.hashCode();
    h += (h << 5) + product.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Event} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Event")
        .omitNullValues()
        .add("user", user)
        .add("product", product)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Event} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Event instance
   */
  public static ImmutableEvent copyOf(Event instance) {
    if (instance instanceof ImmutableEvent) {
      return (ImmutableEvent) instance;
    }
    return ImmutableEvent.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEvent ImmutableEvent}.
   * <pre>
   * ImmutableEvent.builder()
   *    .user(com.pluralsight.kafka.producer.model.InternalUser) // required {@link Event#user() user}
   *    .product(com.pluralsight.kafka.producer.model.InternalProduct) // required {@link Event#product() product}
   *    .build();
   * </pre>
   * @return A new ImmutableEvent builder
   */
  public static ImmutableEvent.Builder builder() {
    return new ImmutableEvent.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEvent ImmutableEvent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Event", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_USER = 0x1L;
    private static final long INIT_BIT_PRODUCT = 0x2L;
    private long initBits = 0x3L;

    private @Nullable InternalUser user;
    private @Nullable InternalProduct product;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Event} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Event instance) {
      Objects.requireNonNull(instance, "instance");
      user(instance.user());
      product(instance.product());
      return this;
    }

    /**
     * Initializes the value for the {@link Event#user() user} attribute.
     * @param user The value for user 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder user(InternalUser user) {
      this.user = Objects.requireNonNull(user, "user");
      initBits &= ~INIT_BIT_USER;
      return this;
    }

    /**
     * Initializes the value for the {@link Event#product() product} attribute.
     * @param product The value for product 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder product(InternalProduct product) {
      this.product = Objects.requireNonNull(product, "product");
      initBits &= ~INIT_BIT_PRODUCT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEvent ImmutableEvent}.
     * @return An immutable instance of Event
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEvent build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEvent(user, product);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_USER) != 0) attributes.add("user");
      if ((initBits & INIT_BIT_PRODUCT) != 0) attributes.add("product");
      return "Cannot build Event, some of required attributes are not set " + attributes;
    }
  }
}
