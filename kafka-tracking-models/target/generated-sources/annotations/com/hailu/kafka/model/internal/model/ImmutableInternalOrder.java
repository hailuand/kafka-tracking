package com.hailu.kafka.model.internal.model;

import com.hailu.kafka.model.internal.enums.UserId;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link InternalOrder}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInternalOrder.builder()}.
 */
@Generated(from = "InternalOrder", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableInternalOrder implements InternalOrder {
  private final UserId userId;
  private final int nbOfItems;
  private final int totalAmount;

  private ImmutableInternalOrder(UserId userId, int nbOfItems, int totalAmount) {
    this.userId = userId;
    this.nbOfItems = nbOfItems;
    this.totalAmount = totalAmount;
  }

  /**
   * @return The value of the {@code userId} attribute
   */
  @Override
  public UserId userId() {
    return userId;
  }

  /**
   * @return The value of the {@code nbOfItems} attribute
   */
  @Override
  public int nbOfItems() {
    return nbOfItems;
  }

  /**
   * @return The value of the {@code totalAmount} attribute
   */
  @Override
  public int totalAmount() {
    return totalAmount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InternalOrder#userId() userId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInternalOrder withUserId(UserId value) {
    UserId newValue = Objects.requireNonNull(value, "userId");
    if (this.userId == newValue) return this;
    return new ImmutableInternalOrder(newValue, this.nbOfItems, this.totalAmount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InternalOrder#nbOfItems() nbOfItems} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nbOfItems
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInternalOrder withNbOfItems(int value) {
    if (this.nbOfItems == value) return this;
    return new ImmutableInternalOrder(this.userId, value, this.totalAmount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InternalOrder#totalAmount() totalAmount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalAmount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInternalOrder withTotalAmount(int value) {
    if (this.totalAmount == value) return this;
    return new ImmutableInternalOrder(this.userId, this.nbOfItems, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInternalOrder} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInternalOrder
        && equalTo(0, (ImmutableInternalOrder) another);
  }

  private boolean equalTo(int synthetic, ImmutableInternalOrder another) {
    return userId.equals(another.userId)
        && nbOfItems == another.nbOfItems
        && totalAmount == another.totalAmount;
  }

  /**
   * Computes a hash code from attributes: {@code userId}, {@code nbOfItems}, {@code totalAmount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + userId.hashCode();
    h += (h << 5) + nbOfItems;
    h += (h << 5) + totalAmount;
    return h;
  }

  /**
   * Prints the immutable value {@code InternalOrder} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "InternalOrder{"
        + "userId=" + userId
        + ", nbOfItems=" + nbOfItems
        + ", totalAmount=" + totalAmount
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link InternalOrder} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InternalOrder instance
   */
  public static ImmutableInternalOrder copyOf(InternalOrder instance) {
    if (instance instanceof ImmutableInternalOrder) {
      return (ImmutableInternalOrder) instance;
    }
    return ImmutableInternalOrder.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInternalOrder ImmutableInternalOrder}.
   * <pre>
   * ImmutableInternalOrder.builder()
   *    .userId(com.hailu.kafka.model.internal.enums.UserId) // required {@link InternalOrder#userId() userId}
   *    .nbOfItems(int) // required {@link InternalOrder#nbOfItems() nbOfItems}
   *    .totalAmount(int) // required {@link InternalOrder#totalAmount() totalAmount}
   *    .build();
   * </pre>
   * @return A new ImmutableInternalOrder builder
   */
  public static ImmutableInternalOrder.Builder builder() {
    return new ImmutableInternalOrder.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInternalOrder ImmutableInternalOrder}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "InternalOrder", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_USER_ID = 0x1L;
    private static final long INIT_BIT_NB_OF_ITEMS = 0x2L;
    private static final long INIT_BIT_TOTAL_AMOUNT = 0x4L;
    private long initBits = 0x7L;

    private UserId userId;
    private int nbOfItems;
    private int totalAmount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code InternalOrder} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(InternalOrder instance) {
      Objects.requireNonNull(instance, "instance");
      userId(instance.userId());
      nbOfItems(instance.nbOfItems());
      totalAmount(instance.totalAmount());
      return this;
    }

    /**
     * Initializes the value for the {@link InternalOrder#userId() userId} attribute.
     * @param userId The value for userId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userId(UserId userId) {
      this.userId = Objects.requireNonNull(userId, "userId");
      initBits &= ~INIT_BIT_USER_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link InternalOrder#nbOfItems() nbOfItems} attribute.
     * @param nbOfItems The value for nbOfItems 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder nbOfItems(int nbOfItems) {
      this.nbOfItems = nbOfItems;
      initBits &= ~INIT_BIT_NB_OF_ITEMS;
      return this;
    }

    /**
     * Initializes the value for the {@link InternalOrder#totalAmount() totalAmount} attribute.
     * @param totalAmount The value for totalAmount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalAmount(int totalAmount) {
      this.totalAmount = totalAmount;
      initBits &= ~INIT_BIT_TOTAL_AMOUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableInternalOrder ImmutableInternalOrder}.
     * @return An immutable instance of InternalOrder
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInternalOrder build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableInternalOrder(userId, nbOfItems, totalAmount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_USER_ID) != 0) attributes.add("userId");
      if ((initBits & INIT_BIT_NB_OF_ITEMS) != 0) attributes.add("nbOfItems");
      if ((initBits & INIT_BIT_TOTAL_AMOUNT) != 0) attributes.add("totalAmount");
      return "Cannot build InternalOrder, some of required attributes are not set " + attributes;
    }
  }
}
