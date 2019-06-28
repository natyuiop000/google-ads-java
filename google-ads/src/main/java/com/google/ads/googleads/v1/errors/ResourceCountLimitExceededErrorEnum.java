// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/resource_count_limit_exceeded_error.proto

package com.google.ads.googleads.v1.errors;

/**
 * <pre>
 * Container for enum describing possible resource count limit exceeded errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum}
 */
public  final class ResourceCountLimitExceededErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum)
    ResourceCountLimitExceededErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceCountLimitExceededErrorEnum.newBuilder() to construct.
  private ResourceCountLimitExceededErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceCountLimitExceededErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResourceCountLimitExceededErrorEnum(
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
    return com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorProto.internal_static_google_ads_googleads_v1_errors_ResourceCountLimitExceededErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorProto.internal_static_google_ads_googleads_v1_errors_ResourceCountLimitExceededErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum.class, com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible resource count limit exceeded errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum.ResourceCountLimitExceededError}
   */
  public enum ResourceCountLimitExceededError
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
     * Indicates that this request would exceed the number of allowed resources
     * for the Google Ads account. The exact resource type and limit being
     * checked can be inferred from accountLimitType.
     * </pre>
     *
     * <code>ACCOUNT_LIMIT = 2;</code>
     */
    ACCOUNT_LIMIT(2),
    /**
     * <pre>
     * Indicates that this request would exceed the number of allowed resources
     * in a Campaign. The exact resource type and limit being checked can be
     * inferred from accountLimitType, and the numeric id of the
     * Campaign involved is given by enclosingId.
     * </pre>
     *
     * <code>CAMPAIGN_LIMIT = 3;</code>
     */
    CAMPAIGN_LIMIT(3),
    /**
     * <pre>
     * Indicates that this request would exceed the number of allowed resources
     * in an ad group. The exact resource type and limit being checked can be
     * inferred from accountLimitType, and the numeric id of the
     * ad group involved is given by enclosingId.
     * </pre>
     *
     * <code>ADGROUP_LIMIT = 4;</code>
     */
    ADGROUP_LIMIT(4),
    /**
     * <pre>
     * Indicates that this request would exceed the number of allowed resources
     * in an ad group ad. The exact resource type and limit being checked can
     * be inferred from accountLimitType, and the enclosingId
     * contains the ad group id followed by the ad id, separated by a single
     * comma (,).
     * </pre>
     *
     * <code>AD_GROUP_AD_LIMIT = 5;</code>
     */
    AD_GROUP_AD_LIMIT(5),
    /**
     * <pre>
     * Indicates that this request would exceed the number of allowed resources
     * in an ad group criterion. The exact resource type and limit being checked
     * can be inferred from accountLimitType, and the
     * enclosingId contains the ad group id followed by the
     * criterion id, separated by a single comma (,).
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_LIMIT = 6;</code>
     */
    AD_GROUP_CRITERION_LIMIT(6),
    /**
     * <pre>
     * Indicates that this request would exceed the number of allowed resources
     * in this shared set. The exact resource type and limit being checked can
     * be inferred from accountLimitType, and the numeric id of the
     * shared set involved is given by enclosingId.
     * </pre>
     *
     * <code>SHARED_SET_LIMIT = 7;</code>
     */
    SHARED_SET_LIMIT(7),
    /**
     * <pre>
     * Exceeds a limit related to a matching function.
     * </pre>
     *
     * <code>MATCHING_FUNCTION_LIMIT = 8;</code>
     */
    MATCHING_FUNCTION_LIMIT(8),
    /**
     * <pre>
     * The response for this request would exceed the maximum number of rows
     * that can be returned.
     * </pre>
     *
     * <code>RESPONSE_ROW_LIMIT_EXCEEDED = 9;</code>
     */
    RESPONSE_ROW_LIMIT_EXCEEDED(9),
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
     * Indicates that this request would exceed the number of allowed resources
     * for the Google Ads account. The exact resource type and limit being
     * checked can be inferred from accountLimitType.
     * </pre>
     *
     * <code>ACCOUNT_LIMIT = 2;</code>
     */
    public static final int ACCOUNT_LIMIT_VALUE = 2;
    /**
     * <pre>
     * Indicates that this request would exceed the number of allowed resources
     * in a Campaign. The exact resource type and limit being checked can be
     * inferred from accountLimitType, and the numeric id of the
     * Campaign involved is given by enclosingId.
     * </pre>
     *
     * <code>CAMPAIGN_LIMIT = 3;</code>
     */
    public static final int CAMPAIGN_LIMIT_VALUE = 3;
    /**
     * <pre>
     * Indicates that this request would exceed the number of allowed resources
     * in an ad group. The exact resource type and limit being checked can be
     * inferred from accountLimitType, and the numeric id of the
     * ad group involved is given by enclosingId.
     * </pre>
     *
     * <code>ADGROUP_LIMIT = 4;</code>
     */
    public static final int ADGROUP_LIMIT_VALUE = 4;
    /**
     * <pre>
     * Indicates that this request would exceed the number of allowed resources
     * in an ad group ad. The exact resource type and limit being checked can
     * be inferred from accountLimitType, and the enclosingId
     * contains the ad group id followed by the ad id, separated by a single
     * comma (,).
     * </pre>
     *
     * <code>AD_GROUP_AD_LIMIT = 5;</code>
     */
    public static final int AD_GROUP_AD_LIMIT_VALUE = 5;
    /**
     * <pre>
     * Indicates that this request would exceed the number of allowed resources
     * in an ad group criterion. The exact resource type and limit being checked
     * can be inferred from accountLimitType, and the
     * enclosingId contains the ad group id followed by the
     * criterion id, separated by a single comma (,).
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_LIMIT = 6;</code>
     */
    public static final int AD_GROUP_CRITERION_LIMIT_VALUE = 6;
    /**
     * <pre>
     * Indicates that this request would exceed the number of allowed resources
     * in this shared set. The exact resource type and limit being checked can
     * be inferred from accountLimitType, and the numeric id of the
     * shared set involved is given by enclosingId.
     * </pre>
     *
     * <code>SHARED_SET_LIMIT = 7;</code>
     */
    public static final int SHARED_SET_LIMIT_VALUE = 7;
    /**
     * <pre>
     * Exceeds a limit related to a matching function.
     * </pre>
     *
     * <code>MATCHING_FUNCTION_LIMIT = 8;</code>
     */
    public static final int MATCHING_FUNCTION_LIMIT_VALUE = 8;
    /**
     * <pre>
     * The response for this request would exceed the maximum number of rows
     * that can be returned.
     * </pre>
     *
     * <code>RESPONSE_ROW_LIMIT_EXCEEDED = 9;</code>
     */
    public static final int RESPONSE_ROW_LIMIT_EXCEEDED_VALUE = 9;


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
    public static ResourceCountLimitExceededError valueOf(int value) {
      return forNumber(value);
    }

    public static ResourceCountLimitExceededError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return ACCOUNT_LIMIT;
        case 3: return CAMPAIGN_LIMIT;
        case 4: return ADGROUP_LIMIT;
        case 5: return AD_GROUP_AD_LIMIT;
        case 6: return AD_GROUP_CRITERION_LIMIT;
        case 7: return SHARED_SET_LIMIT;
        case 8: return MATCHING_FUNCTION_LIMIT;
        case 9: return RESPONSE_ROW_LIMIT_EXCEEDED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResourceCountLimitExceededError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ResourceCountLimitExceededError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResourceCountLimitExceededError>() {
            public ResourceCountLimitExceededError findValueByNumber(int number) {
              return ResourceCountLimitExceededError.forNumber(number);
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
      return com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ResourceCountLimitExceededError[] VALUES = values();

    public static ResourceCountLimitExceededError valueOf(
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

    private ResourceCountLimitExceededError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum.ResourceCountLimitExceededError)
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
    if (!(obj instanceof com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum other = (com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum) obj;

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

  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum prototype) {
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
   * Container for enum describing possible resource count limit exceeded errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum)
      com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorProto.internal_static_google_ads_googleads_v1_errors_ResourceCountLimitExceededErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorProto.internal_static_google_ads_googleads_v1_errors_ResourceCountLimitExceededErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum.class, com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorProto.internal_static_google_ads_googleads_v1_errors_ResourceCountLimitExceededErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum build() {
      com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum buildPartial() {
      com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum result = new com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum other) {
      if (other == com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum)
  private static final com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum();
  }

  public static com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceCountLimitExceededErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<ResourceCountLimitExceededErrorEnum>() {
    @java.lang.Override
    public ResourceCountLimitExceededErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResourceCountLimitExceededErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResourceCountLimitExceededErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceCountLimitExceededErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.errors.ResourceCountLimitExceededErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

