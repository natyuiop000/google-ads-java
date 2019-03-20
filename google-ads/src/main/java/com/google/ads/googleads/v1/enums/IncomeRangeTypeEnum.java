// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/enums/income_range_type.proto

package com.google.ads.googleads.v1.enums;

/**
 * <pre>
 * Container for enum describing the type of demographic income ranges.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.enums.IncomeRangeTypeEnum}
 */
public  final class IncomeRangeTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.enums.IncomeRangeTypeEnum)
    IncomeRangeTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IncomeRangeTypeEnum.newBuilder() to construct.
  private IncomeRangeTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IncomeRangeTypeEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IncomeRangeTypeEnum(
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
            if (!parseUnknownFieldProto3(
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
    return com.google.ads.googleads.v1.enums.IncomeRangeTypeProto.internal_static_google_ads_googleads_v1_enums_IncomeRangeTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.enums.IncomeRangeTypeProto.internal_static_google_ads_googleads_v1_enums_IncomeRangeTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum.class, com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The type of demographic income ranges (e.g. between 0% to 50%).
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.enums.IncomeRangeTypeEnum.IncomeRangeType}
   */
  public enum IncomeRangeType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * 0%-50%.
     * </pre>
     *
     * <code>INCOME_RANGE_0_50 = 510001;</code>
     */
    INCOME_RANGE_0_50(510001),
    /**
     * <pre>
     * 50% to 60%.
     * </pre>
     *
     * <code>INCOME_RANGE_50_60 = 510002;</code>
     */
    INCOME_RANGE_50_60(510002),
    /**
     * <pre>
     * 60% to 70%.
     * </pre>
     *
     * <code>INCOME_RANGE_60_70 = 510003;</code>
     */
    INCOME_RANGE_60_70(510003),
    /**
     * <pre>
     * 70% to 80%.
     * </pre>
     *
     * <code>INCOME_RANGE_70_80 = 510004;</code>
     */
    INCOME_RANGE_70_80(510004),
    /**
     * <pre>
     * 80% to 90%.
     * </pre>
     *
     * <code>INCOME_RANGE_80_90 = 510005;</code>
     */
    INCOME_RANGE_80_90(510005),
    /**
     * <pre>
     * Greater than 90%.
     * </pre>
     *
     * <code>INCOME_RANGE_90_UP = 510006;</code>
     */
    INCOME_RANGE_90_UP(510006),
    /**
     * <pre>
     * Undetermined income range.
     * </pre>
     *
     * <code>INCOME_RANGE_UNDETERMINED = 510000;</code>
     */
    INCOME_RANGE_UNDETERMINED(510000),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * 0%-50%.
     * </pre>
     *
     * <code>INCOME_RANGE_0_50 = 510001;</code>
     */
    public static final int INCOME_RANGE_0_50_VALUE = 510001;
    /**
     * <pre>
     * 50% to 60%.
     * </pre>
     *
     * <code>INCOME_RANGE_50_60 = 510002;</code>
     */
    public static final int INCOME_RANGE_50_60_VALUE = 510002;
    /**
     * <pre>
     * 60% to 70%.
     * </pre>
     *
     * <code>INCOME_RANGE_60_70 = 510003;</code>
     */
    public static final int INCOME_RANGE_60_70_VALUE = 510003;
    /**
     * <pre>
     * 70% to 80%.
     * </pre>
     *
     * <code>INCOME_RANGE_70_80 = 510004;</code>
     */
    public static final int INCOME_RANGE_70_80_VALUE = 510004;
    /**
     * <pre>
     * 80% to 90%.
     * </pre>
     *
     * <code>INCOME_RANGE_80_90 = 510005;</code>
     */
    public static final int INCOME_RANGE_80_90_VALUE = 510005;
    /**
     * <pre>
     * Greater than 90%.
     * </pre>
     *
     * <code>INCOME_RANGE_90_UP = 510006;</code>
     */
    public static final int INCOME_RANGE_90_UP_VALUE = 510006;
    /**
     * <pre>
     * Undetermined income range.
     * </pre>
     *
     * <code>INCOME_RANGE_UNDETERMINED = 510000;</code>
     */
    public static final int INCOME_RANGE_UNDETERMINED_VALUE = 510000;


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
    public static IncomeRangeType valueOf(int value) {
      return forNumber(value);
    }

    public static IncomeRangeType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 510001: return INCOME_RANGE_0_50;
        case 510002: return INCOME_RANGE_50_60;
        case 510003: return INCOME_RANGE_60_70;
        case 510004: return INCOME_RANGE_70_80;
        case 510005: return INCOME_RANGE_80_90;
        case 510006: return INCOME_RANGE_90_UP;
        case 510000: return INCOME_RANGE_UNDETERMINED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IncomeRangeType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IncomeRangeType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IncomeRangeType>() {
            public IncomeRangeType findValueByNumber(int number) {
              return IncomeRangeType.forNumber(number);
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
      return com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final IncomeRangeType[] VALUES = values();

    public static IncomeRangeType valueOf(
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

    private IncomeRangeType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.enums.IncomeRangeTypeEnum.IncomeRangeType)
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
    if (!(obj instanceof com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum other = (com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
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

  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum prototype) {
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
   * Container for enum describing the type of demographic income ranges.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.enums.IncomeRangeTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.enums.IncomeRangeTypeEnum)
      com.google.ads.googleads.v1.enums.IncomeRangeTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.IncomeRangeTypeProto.internal_static_google_ads_googleads_v1_enums_IncomeRangeTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.enums.IncomeRangeTypeProto.internal_static_google_ads_googleads_v1_enums_IncomeRangeTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum.class, com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v1.enums.IncomeRangeTypeProto.internal_static_google_ads_googleads_v1_enums_IncomeRangeTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum build() {
      com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum buildPartial() {
      com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum result = new com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum other) {
      if (other == com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum) e.getUnfinishedMessage();
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
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.enums.IncomeRangeTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.enums.IncomeRangeTypeEnum)
  private static final com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum();
  }

  public static com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IncomeRangeTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<IncomeRangeTypeEnum>() {
    @java.lang.Override
    public IncomeRangeTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IncomeRangeTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IncomeRangeTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IncomeRangeTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.enums.IncomeRangeTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
