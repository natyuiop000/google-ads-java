// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/errors/mutate_error.proto

package com.google.ads.googleads.v2.errors;

/**
 * <pre>
 * Container for enum describing possible mutate errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.errors.MutateErrorEnum}
 */
public  final class MutateErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.errors.MutateErrorEnum)
    MutateErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateErrorEnum.newBuilder() to construct.
  private MutateErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateErrorEnum(
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
    return com.google.ads.googleads.v2.errors.MutateErrorProto.internal_static_google_ads_googleads_v2_errors_MutateErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.errors.MutateErrorProto.internal_static_google_ads_googleads_v2_errors_MutateErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.errors.MutateErrorEnum.class, com.google.ads.googleads.v2.errors.MutateErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible mutate errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v2.errors.MutateErrorEnum.MutateError}
   */
  public enum MutateError
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
     * Requested resource was not found.
     * </pre>
     *
     * <code>RESOURCE_NOT_FOUND = 3;</code>
     */
    RESOURCE_NOT_FOUND(3),
    /**
     * <pre>
     * Cannot mutate the same resource twice in one request.
     * </pre>
     *
     * <code>ID_EXISTS_IN_MULTIPLE_MUTATES = 7;</code>
     */
    ID_EXISTS_IN_MULTIPLE_MUTATES(7),
    /**
     * <pre>
     * The field's contents don't match another field that represents the same
     * data.
     * </pre>
     *
     * <code>INCONSISTENT_FIELD_VALUES = 8;</code>
     */
    INCONSISTENT_FIELD_VALUES(8),
    /**
     * <pre>
     * Mutates are not allowed for the requested resource.
     * </pre>
     *
     * <code>MUTATE_NOT_ALLOWED = 9;</code>
     */
    MUTATE_NOT_ALLOWED(9),
    /**
     * <pre>
     * The resource isn't in Google Ads. It belongs to another ads system.
     * </pre>
     *
     * <code>RESOURCE_NOT_IN_GOOGLE_ADS = 10;</code>
     */
    RESOURCE_NOT_IN_GOOGLE_ADS(10),
    /**
     * <pre>
     * The resource being created already exists.
     * </pre>
     *
     * <code>RESOURCE_ALREADY_EXISTS = 11;</code>
     */
    RESOURCE_ALREADY_EXISTS(11),
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
     * Requested resource was not found.
     * </pre>
     *
     * <code>RESOURCE_NOT_FOUND = 3;</code>
     */
    public static final int RESOURCE_NOT_FOUND_VALUE = 3;
    /**
     * <pre>
     * Cannot mutate the same resource twice in one request.
     * </pre>
     *
     * <code>ID_EXISTS_IN_MULTIPLE_MUTATES = 7;</code>
     */
    public static final int ID_EXISTS_IN_MULTIPLE_MUTATES_VALUE = 7;
    /**
     * <pre>
     * The field's contents don't match another field that represents the same
     * data.
     * </pre>
     *
     * <code>INCONSISTENT_FIELD_VALUES = 8;</code>
     */
    public static final int INCONSISTENT_FIELD_VALUES_VALUE = 8;
    /**
     * <pre>
     * Mutates are not allowed for the requested resource.
     * </pre>
     *
     * <code>MUTATE_NOT_ALLOWED = 9;</code>
     */
    public static final int MUTATE_NOT_ALLOWED_VALUE = 9;
    /**
     * <pre>
     * The resource isn't in Google Ads. It belongs to another ads system.
     * </pre>
     *
     * <code>RESOURCE_NOT_IN_GOOGLE_ADS = 10;</code>
     */
    public static final int RESOURCE_NOT_IN_GOOGLE_ADS_VALUE = 10;
    /**
     * <pre>
     * The resource being created already exists.
     * </pre>
     *
     * <code>RESOURCE_ALREADY_EXISTS = 11;</code>
     */
    public static final int RESOURCE_ALREADY_EXISTS_VALUE = 11;


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
    public static MutateError valueOf(int value) {
      return forNumber(value);
    }

    public static MutateError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 3: return RESOURCE_NOT_FOUND;
        case 7: return ID_EXISTS_IN_MULTIPLE_MUTATES;
        case 8: return INCONSISTENT_FIELD_VALUES;
        case 9: return MUTATE_NOT_ALLOWED;
        case 10: return RESOURCE_NOT_IN_GOOGLE_ADS;
        case 11: return RESOURCE_ALREADY_EXISTS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MutateError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MutateError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MutateError>() {
            public MutateError findValueByNumber(int number) {
              return MutateError.forNumber(number);
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
      return com.google.ads.googleads.v2.errors.MutateErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final MutateError[] VALUES = values();

    public static MutateError valueOf(
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

    private MutateError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v2.errors.MutateErrorEnum.MutateError)
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
    if (!(obj instanceof com.google.ads.googleads.v2.errors.MutateErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.errors.MutateErrorEnum other = (com.google.ads.googleads.v2.errors.MutateErrorEnum) obj;

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

  public static com.google.ads.googleads.v2.errors.MutateErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.errors.MutateErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.MutateErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.errors.MutateErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.MutateErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.errors.MutateErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.MutateErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.errors.MutateErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.MutateErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.errors.MutateErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.errors.MutateErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.errors.MutateErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.errors.MutateErrorEnum prototype) {
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
   * Container for enum describing possible mutate errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.errors.MutateErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.errors.MutateErrorEnum)
      com.google.ads.googleads.v2.errors.MutateErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.errors.MutateErrorProto.internal_static_google_ads_googleads_v2_errors_MutateErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.errors.MutateErrorProto.internal_static_google_ads_googleads_v2_errors_MutateErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.errors.MutateErrorEnum.class, com.google.ads.googleads.v2.errors.MutateErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.errors.MutateErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v2.errors.MutateErrorProto.internal_static_google_ads_googleads_v2_errors_MutateErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.errors.MutateErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.errors.MutateErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.errors.MutateErrorEnum build() {
      com.google.ads.googleads.v2.errors.MutateErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.errors.MutateErrorEnum buildPartial() {
      com.google.ads.googleads.v2.errors.MutateErrorEnum result = new com.google.ads.googleads.v2.errors.MutateErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v2.errors.MutateErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v2.errors.MutateErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.errors.MutateErrorEnum other) {
      if (other == com.google.ads.googleads.v2.errors.MutateErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v2.errors.MutateErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.errors.MutateErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.errors.MutateErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.errors.MutateErrorEnum)
  private static final com.google.ads.googleads.v2.errors.MutateErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.errors.MutateErrorEnum();
  }

  public static com.google.ads.googleads.v2.errors.MutateErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<MutateErrorEnum>() {
    @java.lang.Override
    public MutateErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.errors.MutateErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

