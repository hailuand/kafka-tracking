package com.hailu.kafka.model.internal.model;

import com.hailu.kafka.model.internal.enums.UserId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link InternalUser}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInternalUser.builder()}.
 */
@Generated(from = "InternalUser", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableInternalUser implements InternalUser {
  private final UserId userId;
  private final String username;
  private final Date dateOfBirth;

  private ImmutableInternalUser(
      UserId userId,
      String username,
      Date dateOfBirth) {
    this.userId = userId;
    this.username = username;
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * @return The value of the {@code userId} attribute
   */
  @Override
  public UserId userId() {
    return userId;
  }

  /**
   * @return The value of the {@code username} attribute
   */
  @Override
  public String username() {
    return username;
  }

  /**
   * @return The value of the {@code dateOfBirth} attribute
   */
  @Override
  public Date dateOfBirth() {
    return dateOfBirth;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InternalUser#userId() userId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInternalUser withUserId(UserId value) {
    UserId newValue = Objects.requireNonNull(value, "userId");
    if (this.userId == newValue) return this;
    return new ImmutableInternalUser(newValue, this.username, this.dateOfBirth);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InternalUser#username() username} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for username
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInternalUser withUsername(String value) {
    String newValue = Objects.requireNonNull(value, "username");
    if (this.username.equals(newValue)) return this;
    return new ImmutableInternalUser(this.userId, newValue, this.dateOfBirth);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InternalUser#dateOfBirth() dateOfBirth} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dateOfBirth
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInternalUser withDateOfBirth(Date value) {
    if (this.dateOfBirth == value) return this;
    Date newValue = Objects.requireNonNull(value, "dateOfBirth");
    return new ImmutableInternalUser(this.userId, this.username, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInternalUser} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInternalUser
        && equalTo(0, (ImmutableInternalUser) another);
  }

  private boolean equalTo(int synthetic, ImmutableInternalUser another) {
    return userId.equals(another.userId)
        && username.equals(another.username)
        && dateOfBirth.equals(another.dateOfBirth);
  }

  /**
   * Computes a hash code from attributes: {@code userId}, {@code username}, {@code dateOfBirth}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + userId.hashCode();
    h += (h << 5) + username.hashCode();
    h += (h << 5) + dateOfBirth.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code InternalUser} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "InternalUser{"
        + "userId=" + userId
        + ", username=" + username
        + ", dateOfBirth=" + dateOfBirth
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link InternalUser} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InternalUser instance
   */
  public static ImmutableInternalUser copyOf(InternalUser instance) {
    if (instance instanceof ImmutableInternalUser) {
      return (ImmutableInternalUser) instance;
    }
    return ImmutableInternalUser.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInternalUser ImmutableInternalUser}.
   * <pre>
   * ImmutableInternalUser.builder()
   *    .userId(com.hailu.kafka.model.internal.enums.UserId) // required {@link InternalUser#userId() userId}
   *    .username(String) // required {@link InternalUser#username() username}
   *    .dateOfBirth(Date) // required {@link InternalUser#dateOfBirth() dateOfBirth}
   *    .build();
   * </pre>
   * @return A new ImmutableInternalUser builder
   */
  public static ImmutableInternalUser.Builder builder() {
    return new ImmutableInternalUser.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInternalUser ImmutableInternalUser}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "InternalUser", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_USER_ID = 0x1L;
    private static final long INIT_BIT_USERNAME = 0x2L;
    private static final long INIT_BIT_DATE_OF_BIRTH = 0x4L;
    private long initBits = 0x7L;

    private UserId userId;
    private String username;
    private Date dateOfBirth;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code InternalUser} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(InternalUser instance) {
      Objects.requireNonNull(instance, "instance");
      userId(instance.userId());
      username(instance.username());
      dateOfBirth(instance.dateOfBirth());
      return this;
    }

    /**
     * Initializes the value for the {@link InternalUser#userId() userId} attribute.
     * @param userId The value for userId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userId(UserId userId) {
      this.userId = Objects.requireNonNull(userId, "userId");
      initBits &= ~INIT_BIT_USER_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link InternalUser#username() username} attribute.
     * @param username The value for username 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder username(String username) {
      this.username = Objects.requireNonNull(username, "username");
      initBits &= ~INIT_BIT_USERNAME;
      return this;
    }

    /**
     * Initializes the value for the {@link InternalUser#dateOfBirth() dateOfBirth} attribute.
     * @param dateOfBirth The value for dateOfBirth 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dateOfBirth(Date dateOfBirth) {
      this.dateOfBirth = Objects.requireNonNull(dateOfBirth, "dateOfBirth");
      initBits &= ~INIT_BIT_DATE_OF_BIRTH;
      return this;
    }

    /**
     * Builds a new {@link ImmutableInternalUser ImmutableInternalUser}.
     * @return An immutable instance of InternalUser
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInternalUser build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableInternalUser(userId, username, dateOfBirth);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_USER_ID) != 0) attributes.add("userId");
      if ((initBits & INIT_BIT_USERNAME) != 0) attributes.add("username");
      if ((initBits & INIT_BIT_DATE_OF_BIRTH) != 0) attributes.add("dateOfBirth");
      return "Cannot build InternalUser, some of required attributes are not set " + attributes;
    }
  }
}
