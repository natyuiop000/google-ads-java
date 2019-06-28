// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/errors/feed_mapping_error.proto

package com.google.ads.googleads.v2.errors;

/**
 * <pre>
 * Container for enum describing possible feed item errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.errors.FeedMappingErrorEnum}
 */
public  final class FeedMappingErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.errors.FeedMappingErrorEnum)
    FeedMappingErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedMappingErrorEnum.newBuilder() to construct.
  private FeedMappingErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedMappingErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FeedMappingErrorEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v2.errors.FeedMappingErrorProto.internal_static_google_ads_googleads_v2_errors_FeedMappingErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.errors.FeedMappingErrorProto.internal_static_google_ads_googleads_v2_errors_FeedMappingErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.errors.FeedMappingErrorEnum.class, com.google.ads.googleads.v2.errors.FeedMappingErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible feed item errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v2.errors.FeedMappingErrorEnum.FeedMappingError}
   */
  public enum FeedMappingError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The given placeholder field does not exist.
     * </pre>
     *
     * <code>INVALID_PLACEHOLDER_FIELD = 2;</code>
     */
    INVALID_PLACEHOLDER_FIELD(2),
    /**
     * <pre>
     * The given criterion field does not exist.
     * </pre>
     *
     * <code>INVALID_CRITERION_FIELD = 3;</code>
     */
    INVALID_CRITERION_FIELD(3),
    /**
     * <pre>
     * The given placeholder type does not exist.
     * </pre>
     *
     * <code>INVALID_PLACEHOLDER_TYPE = 4;</code>
     */
    INVALID_PLACEHOLDER_TYPE(4),
    /**
     * <pre>
     * The given criterion type does not exist.
     * </pre>
     *
     * <code>INVALID_CRITERION_TYPE = 5;</code>
     */
    INVALID_CRITERION_TYPE(5),
    /**
     * <pre>
     * A feed mapping must contain at least one attribute field mapping.
     * </pre>
     *
     * <code>NO_ATTRIBUTE_FIELD_MAPPINGS = 7;</code>
     */
    NO_ATTRIBUTE_FIELD_MAPPINGS(7),
    /**
     * <pre>
     * The type of the feed attribute referenced in the attribute field mapping
     * must match the type of the placeholder field.
     * </pre>
     *
     * <code>FEED_ATTRIBUTE_TYPE_MISMATCH = 8;</code>
     */
    FEED_ATTRIBUTE_TYPE_MISMATCH(8),
    /**
     * <pre>
     * A feed mapping for a system generated feed cannot be operated on.
     * </pre>
     *
     * <code>CANNOT_OPERATE_ON_MAPPINGS_FOR_SYSTEM_GENERATED_FEED = 9;</code>
     */
    CANNOT_OPERATE_ON_MAPPINGS_FOR_SYSTEM_GENERATED_FEED(9),
    /**
     * <pre>
     * Only one feed mapping for a placeholder type is allowed per feed or
     * customer (depending on the placeholder type).
     * </pre>
     *
     * <code>MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE = 10;</code>
     */
    MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE(10),
    /**
     * <pre>
     * Only one feed mapping for a criterion type is allowed per customer.
     * </pre>
     *
     * <code>MULTIPLE_MAPPINGS_FOR_CRITERION_TYPE = 11;</code>
     */
    MULTIPLE_MAPPINGS_FOR_CRITERION_TYPE(11),
    /**
     * <pre>
     * Only one feed attribute mapping for a placeholder field is allowed
     * (depending on the placeholder type).
     * </pre>
     *
     * <code>MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_FIELD = 12;</code>
     */
    MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_FIELD(12),
    /**
     * <pre>
     * Only one feed attribute mapping for a criterion field is allowed
     * (depending on the criterion type).
     * </pre>
     *
     * <code>MULTIPLE_MAPPINGS_FOR_CRITERION_FIELD = 13;</code>
     */
    MULTIPLE_MAPPINGS_FOR_CRITERION_FIELD(13),
    /**
     * <pre>
     * This feed mapping may not contain any explicit attribute field mappings.
     * </pre>
     *
     * <code>UNEXPECTED_ATTRIBUTE_FIELD_MAPPINGS = 14;</code>
     */
    UNEXPECTED_ATTRIBUTE_FIELD_MAPPINGS(14),
    /**
     * <pre>
     * Location placeholder feed mappings can only be created for Places feeds.
     * </pre>
     *
     * <code>LOCATION_PLACEHOLDER_ONLY_FOR_PLACES_FEEDS = 15;</code>
     */
    LOCATION_PLACEHOLDER_ONLY_FOR_PLACES_FEEDS(15),
    /**
     * <pre>
     * Mappings for typed feeds cannot be modified.
     * </pre>
     *
     * <code>CANNOT_MODIFY_MAPPINGS_FOR_TYPED_FEED = 16;</code>
     */
    CANNOT_MODIFY_MAPPINGS_FOR_TYPED_FEED(16),
    /**
     * <pre>
     * The given placeholder type can only be mapped to system generated feeds.
     * </pre>
     *
     * <code>INVALID_PLACEHOLDER_TYPE_FOR_NON_SYSTEM_GENERATED_FEED = 17;</code>
     */
    INVALID_PLACEHOLDER_TYPE_FOR_NON_SYSTEM_GENERATED_FEED(17),
    /**
     * <pre>
     * The given placeholder type cannot be mapped to a system generated feed
     * with the given type.
     * </pre>
     *
     * <code>INVALID_PLACEHOLDER_TYPE_FOR_SYSTEM_GENERATED_FEED_TYPE = 18;</code>
     */
    INVALID_PLACEHOLDER_TYPE_FOR_SYSTEM_GENERATED_FEED_TYPE(18),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The given placeholder field does not exist.
     * </pre>
     *
     * <code>INVALID_PLACEHOLDER_FIELD = 2;</code>
     */
    public static final int INVALID_PLACEHOLDER_FIELD_VALUE = 2;
    /**
     * <pre>
     * The given criterion field does not exist.
     * </pre>
     *
     * <code>INVALID_CRITERION_FIELD = 3;</code>
     */
    public static final int INVALID_CRITERION_FIELD_VALUE = 3;
    /**
     * <pre>
     * The given placeholder type does not exist.
     * </pre>
     *
     * <code>INVALID_PLACEHOLDER_TYPE = 4;</code>
     */
    public static final int INVALID_PLACEHOLDER_TYPE_VALUE = 4;
    /**
     * <pre>
     * The given criterion type does not exist.
     * </pre>
     *
     * <code>INVALID_CRITERION_TYPE = 5;</code>
     */
    public static final int INVALID_CRITERION_TYPE_VALUE = 5;
    /**
     * <pre>
     * A feed mapping must contain at least one attribute field mapping.
     * </pre>
     *
     * <code>NO_ATTRIBUTE_FIELD_MAPPINGS = 7;</code>
     */
    public static final int NO_ATTRIBUTE_FIELD_MAPPINGS_VALUE = 7;
    /**
     * <pre>
     * The type of the feed attribute referenced in the attribute field mapping
     * must match the type of the placeholder field.
     * </pre>
     *
     * <code>FEED_ATTRIBUTE_TYPE_MISMATCH = 8;</code>
     */
    public static final int FEED_ATTRIBUTE_TYPE_MISMATCH_VALUE = 8;
    /**
     * <pre>
     * A feed mapping for a system generated feed cannot be operated on.
     * </pre>
     *
     * <code>CANNOT_OPERATE_ON_MAPPINGS_FOR_SYSTEM_GENERATED_FEED = 9;</code>
     */
    public static final int CANNOT_OPERATE_ON_MAPPINGS_FOR_SYSTEM_GENERATED_FEED_VALUE = 9;
    /**
     * <pre>
     * Only one feed mapping for a placeholder type is allowed per feed or
     * customer (depending on the placeholder type).
     * </pre>
     *
     * <code>MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE = 10;</code>
     */
    public static final int MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE_VALUE = 10;
    /**
     * <pre>
     * Only one feed mapping for a criterion type is allowed per customer.
     * </pre>
     *
     * <code>MULTIPLE_MAPPINGS_FOR_CRITERION_TYPE = 11;</code>
     */
    public static final int MULTIPLE_MAPPINGS_FOR_CRITERION_TYPE_VALUE = 11;
    /**
     * <pre>
     * Only one feed attribute mapping for a placeholder field is allowed
     * (depending on the placeholder type).
     * </pre>
     *
     * <code>MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_FIELD = 12;</code>
     */
    public static final int MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_FIELD_VALUE = 12;
    /**
     * <pre>
     * Only one feed attribute mapping for a criterion field is allowed
     * (depending on the criterion type).
     * </pre>
     *
     * <code>MULTIPLE_MAPPINGS_FOR_CRITERION_FIELD = 13;</code>
     */
    public static final int MULTIPLE_MAPPINGS_FOR_CRITERION_FIELD_VALUE = 13;
    /**
     * <pre>
     * This feed mapping may not contain any explicit attribute field mappings.
     * </pre>
     *
     * <code>UNEXPECTED_ATTRIBUTE_FIELD_MAPPINGS = 14;</code>
     */
    public static final int UNEXPECTED_ATTRIBUTE_FIELD_MAPPINGS_VALUE = 14;
    /**
     * <pre>
     * Location placeholder feed mappings can only be created for Places feeds.
     * </pre>
     *
     * <code>LOCATION_PLACEHOLDER_ONLY_FOR_PLACES_FEEDS = 15;</code>
     */
    public static final int LOCATION_PLACEHOLDER_ONLY_FOR_PLACES_FEEDS_VALUE = 15;
    /**
     * <pre>
     * Mappings for typed feeds cannot be modified.
     * </pre>
     *
     * <code>CANNOT_MODIFY_MAPPINGS_FOR_TYPED_FEED = 16;</code>
     */
    public static final int CANNOT_MODIFY_MAPPINGS_FOR_TYPED_FEED_VALUE = 16;
    /**
     * <pre>
     * The given placeholder type can only be mapped to system generated feeds.
     * </pre>
     *
     * <code>INVALID_PLACEHOLDER_TYPE_FOR_NON_SYSTEM_GENERATED_FEED = 17;</code>
     */
    public static final int INVALID_PLACEHOLDER_TYPE_FOR_NON_SYSTEM_GENERATED_FEED_VALUE = 17;
    /**
     * <pre>
     * The given placeholder type cannot be mapped to a system generated feed
     * with the given type.
     * </pre>
     *
     * <code>INVALID_PLACEHOLDER_TYPE_FOR_SYSTEM_GENERATED_FEED_TYPE = 18;</code>
     */
    public static final int INVALID_PLACEHOLDER_TYPE_FOR_SYSTEM_GENERATED_FEED_TYPE_VALUE = 18;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FeedMappingError valueOf(int value) {
      return forNumber(value);
    }

    public static FeedMappingError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return INVALID_PLACEHOLDER_FIELD;
        case 3: return INVALID_CRITERION_FIELD;
        case 4: return INVALID_PLACEHOLDER_TYPE;
        case 5: return INVALID_CRITERION_TYPE;
        case 7: return NO_ATTRIBUTE_FIELD_MAPPINGS;
        case 8: return FEED_ATTRIBUTE_TYPE_MISMATCH;
        case 9: return CANNOT_OPERATE_ON_MAPPINGS_FOR_SYSTEM_GENERATED_FEED;
        case 10: return MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE;
        case 11: return MULTIPLE_MAPPINGS_FOR_CRITERION_TYPE;
        case 12: return MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_FIELD;
        case 13: return MULTIPLE_MAPPINGS_FOR_CRITERION_FIELD;
        case 14: return UNEXPECTED_ATTRIBUTE_FIELD_MAPPINGS;
        case 15: return LOCATION_PLACEHOLDER_ONLY_FOR_PLACES_FEEDS;
        case 16: return CANNOT_MODIFY_MAPPINGS_FOR_TYPED_FEED;
        case 17: return INVALID_PLACEHOLDER_TYPE_FOR_NON_SYSTEM_GENERATED_FEED;
        case 18: return INVALID_PLACEHOLDER_TYPE_FOR_SYSTEM_GENERATED_FEED_TYPE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FeedMappingError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FeedMappingError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FeedMappingError>() {
            public FeedMappingError findValueByNumber(int number) {
              return FeedMappingError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.errors.FeedMappingErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final FeedMappingError[] VALUES = values();

    public static FeedMappingError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FeedMappingError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v2.errors.FeedMappingErrorEnum.FeedMappingError)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v2.errors.FeedMappingErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.errors.FeedMappingErrorEnum other = (com.google.ads.googleads.v2.errors.FeedMappingErrorEnum) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v2.errors.FeedMappingErrorEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Container for enum describing possible feed item errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.errors.FeedMappingErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.errors.FeedMappingErrorEnum)
      com.google.ads.googleads.v2.errors.FeedMappingErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.errors.FeedMappingErrorProto.internal_static_google_ads_googleads_v2_errors_FeedMappingErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.errors.FeedMappingErrorProto.internal_static_google_ads_googleads_v2_errors_FeedMappingErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.errors.FeedMappingErrorEnum.class, com.google.ads.googleads.v2.errors.FeedMappingErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.errors.FeedMappingErrorEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.errors.FeedMappingErrorProto.internal_static_google_ads_googleads_v2_errors_FeedMappingErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.errors.FeedMappingErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.errors.FeedMappingErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.errors.FeedMappingErrorEnum build() {
      com.google.ads.googleads.v2.errors.FeedMappingErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.errors.FeedMappingErrorEnum buildPartial() {
      com.google.ads.googleads.v2.errors.FeedMappingErrorEnum result = new com.google.ads.googleads.v2.errors.FeedMappingErrorEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v2.errors.FeedMappingErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v2.errors.FeedMappingErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.errors.FeedMappingErrorEnum other) {
      if (other == com.google.ads.googleads.v2.errors.FeedMappingErrorEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v2.errors.FeedMappingErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.errors.FeedMappingErrorEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.errors.FeedMappingErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.errors.FeedMappingErrorEnum)
  private static final com.google.ads.googleads.v2.errors.FeedMappingErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.errors.FeedMappingErrorEnum();
  }

  public static com.google.ads.googleads.v2.errors.FeedMappingErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedMappingErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<FeedMappingErrorEnum>() {
    @java.lang.Override
    public FeedMappingErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FeedMappingErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FeedMappingErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedMappingErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.errors.FeedMappingErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

