// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/enums/policy_topic_entry_type.proto

package com.google.ads.googleads.v2.enums;

/**
 * <pre>
 * Container for enum describing possible policy topic entry types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum}
 */
public  final class PolicyTopicEntryTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum)
    PolicyTopicEntryTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PolicyTopicEntryTypeEnum.newBuilder() to construct.
  private PolicyTopicEntryTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PolicyTopicEntryTypeEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PolicyTopicEntryTypeEnum(
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
    return com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeProto.internal_static_google_ads_googleads_v2_enums_PolicyTopicEntryTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeProto.internal_static_google_ads_googleads_v2_enums_PolicyTopicEntryTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum.class, com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The possible policy topic entry types.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum.PolicyTopicEntryType}
   */
  public enum PolicyTopicEntryType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received value is not known in this version.
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The resource will not be served.
     * </pre>
     *
     * <code>PROHIBITED = 2;</code>
     */
    PROHIBITED(2),
    /**
     * <pre>
     * The resource will not be served under some circumstances.
     * </pre>
     *
     * <code>LIMITED = 4;</code>
     */
    LIMITED(4),
    /**
     * <pre>
     * The resource cannot serve at all because of the current targeting
     * criteria.
     * </pre>
     *
     * <code>FULLY_LIMITED = 8;</code>
     */
    FULLY_LIMITED(8),
    /**
     * <pre>
     * May be of interest, but does not limit how the resource is served.
     * </pre>
     *
     * <code>DESCRIPTIVE = 5;</code>
     */
    DESCRIPTIVE(5),
    /**
     * <pre>
     * Could increase coverage beyond normal.
     * </pre>
     *
     * <code>BROADENING = 6;</code>
     */
    BROADENING(6),
    /**
     * <pre>
     * Constrained for all targeted countries, but may serve in other countries
     * through area of interest.
     * </pre>
     *
     * <code>AREA_OF_INTEREST_ONLY = 7;</code>
     */
    AREA_OF_INTEREST_ONLY(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received value is not known in this version.
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The resource will not be served.
     * </pre>
     *
     * <code>PROHIBITED = 2;</code>
     */
    public static final int PROHIBITED_VALUE = 2;
    /**
     * <pre>
     * The resource will not be served under some circumstances.
     * </pre>
     *
     * <code>LIMITED = 4;</code>
     */
    public static final int LIMITED_VALUE = 4;
    /**
     * <pre>
     * The resource cannot serve at all because of the current targeting
     * criteria.
     * </pre>
     *
     * <code>FULLY_LIMITED = 8;</code>
     */
    public static final int FULLY_LIMITED_VALUE = 8;
    /**
     * <pre>
     * May be of interest, but does not limit how the resource is served.
     * </pre>
     *
     * <code>DESCRIPTIVE = 5;</code>
     */
    public static final int DESCRIPTIVE_VALUE = 5;
    /**
     * <pre>
     * Could increase coverage beyond normal.
     * </pre>
     *
     * <code>BROADENING = 6;</code>
     */
    public static final int BROADENING_VALUE = 6;
    /**
     * <pre>
     * Constrained for all targeted countries, but may serve in other countries
     * through area of interest.
     * </pre>
     *
     * <code>AREA_OF_INTEREST_ONLY = 7;</code>
     */
    public static final int AREA_OF_INTEREST_ONLY_VALUE = 7;


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
    public static PolicyTopicEntryType valueOf(int value) {
      return forNumber(value);
    }

    public static PolicyTopicEntryType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return PROHIBITED;
        case 4: return LIMITED;
        case 8: return FULLY_LIMITED;
        case 5: return DESCRIPTIVE;
        case 6: return BROADENING;
        case 7: return AREA_OF_INTEREST_ONLY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PolicyTopicEntryType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PolicyTopicEntryType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PolicyTopicEntryType>() {
            public PolicyTopicEntryType findValueByNumber(int number) {
              return PolicyTopicEntryType.forNumber(number);
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
      return com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final PolicyTopicEntryType[] VALUES = values();

    public static PolicyTopicEntryType valueOf(
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

    private PolicyTopicEntryType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum.PolicyTopicEntryType)
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
    if (!(obj instanceof com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum other = (com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum) obj;

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

  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum prototype) {
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
   * Container for enum describing possible policy topic entry types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum)
      com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeProto.internal_static_google_ads_googleads_v2_enums_PolicyTopicEntryTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeProto.internal_static_google_ads_googleads_v2_enums_PolicyTopicEntryTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum.class, com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeProto.internal_static_google_ads_googleads_v2_enums_PolicyTopicEntryTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum build() {
      com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum buildPartial() {
      com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum result = new com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum other) {
      if (other == com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum)
  private static final com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum();
  }

  public static com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyTopicEntryTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<PolicyTopicEntryTypeEnum>() {
    @java.lang.Override
    public PolicyTopicEntryTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PolicyTopicEntryTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PolicyTopicEntryTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyTopicEntryTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.enums.PolicyTopicEntryTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

