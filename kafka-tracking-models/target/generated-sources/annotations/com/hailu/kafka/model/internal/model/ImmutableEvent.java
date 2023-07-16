package com.hailu.kafka.model.internal.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Event}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEvent.builder()}.
 */
@Generated(from = "Event", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableEvent implements Event {
  private final InternalUser user;
  private final InternalProduct product;
  private final InternalOrder order;

  private ImmutableEvent(
      InternalUser user,
      InternalProduct product,
      InternalOrder order) {
    this.user = user;
    this.product = product;
    this.order = order;
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
   * @return The value of the {@code order} attribute
   */
  @Override
  public InternalOrder order() {
    return order;
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
    return new ImmutableEvent(newValue, this.product, this.order);
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
    return new ImmutableEvent(this.user, newValue, this.order);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Event#order() order} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for order
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEvent withOrder(InternalOrder value) {
    if (this.order == value) return this;
    InternalOrder newValue = Objects.requireNonNull(value, "order");
    return new ImmutableEvent(this.user, this.product, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEvent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEvent
        && equalTo(0, (ImmutableEvent) another);
  }

  private boolean equalTo(int synthetic, ImmutableEvent another) {
    return user.equals(another.user)
        && product.equals(another.product)
        && order.equals(another.order);
  }

  /**
   * Computes a hash code from attributes: {@code user}, {@code product}, {@code order}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + user.hashCode();
    h += (h << 5) + product.hashCode();
    h += (h << 5) + order.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Event} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Event{"
        + "user=" + user
        + ", product=" + product
        + ", order=" + order
        + "}";
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
   *    .user(com.hailu.kafka.model.internal.model.InternalUser) // required {@link Event#user() user}
   *    .product(com.hailu.kafka.model.internal.model.InternalProduct) // required {@link Event#product() product}
   *    .order(com.hailu.kafka.model.internal.model.InternalOrder) // required {@link Event#order() order}
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
  public static final class Builder {
    private static final long INIT_BIT_USER = 0x1L;
    private static final long INIT_BIT_PRODUCT = 0x2L;
    private static final long INIT_BIT_ORDER = 0x4L;
    private long initBits = 0x7L;

    private InternalUser user;
    private InternalProduct product;
    private InternalOrder order;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Event} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Event instance) {
      Objects.requireNonNull(instance, "instance");
      user(instance.user());
      product(instance.product());
      order(instance.order());
      return this;
    }

    /**
     * Initializes the value for the {@link Event#user() user} attribute.
     * @param user The value for user 
     * @return {@code this} builder for use in a chained invocation
     */
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
    public final Builder product(InternalProduct product) {
      this.product = Objects.requireNonNull(product, "product");
      initBits &= ~INIT_BIT_PRODUCT;
      return this;
    }

    /**
     * Initializes the value for the {@link Event#order() order} attribute.
     * @param order The value for order 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder order(InternalOrder order) {
      this.order = Objects.requireNonNull(order, "order");
      initBits &= ~INIT_BIT_ORDER;
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
      return new ImmutableEvent(user, product, order);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_USER) != 0) attributes.add("user");
      if ((initBits & INIT_BIT_PRODUCT) != 0) attributes.add("product");
      if ((initBits & INIT_BIT_ORDER) != 0) attributes.add("order");
      return "Cannot build Event, some of required attributes are not set " + attributes;
    }
  }
}
