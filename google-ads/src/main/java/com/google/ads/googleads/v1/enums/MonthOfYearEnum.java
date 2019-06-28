// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/enums/month_of_year.proto

package com.google.ads.googleads.v1.enums;

/**
 * <pre>
 * Container for enumeration of months of the year, e.g., "January".
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.enums.MonthOfYearEnum}
 */
public  final class MonthOfYearEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.enums.MonthOfYearEnum)
    MonthOfYearEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MonthOfYearEnum.newBuilder() to construct.
  private MonthOfYearEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MonthOfYearEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MonthOfYearEnum(
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
    return com.google.ads.googleads.v1.enums.MonthOfYearProto.internal_static_google_ads_googleads_v1_enums_MonthOfYearEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.enums.MonthOfYearProto.internal_static_google_ads_googleads_v1_enums_MonthOfYearEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.enums.MonthOfYearEnum.class, com.google.ads.googleads.v1.enums.MonthOfYearEnum.Builder.class);
  }

  /**
   * <pre>
   * Enumerates months of the year, e.g., "January".
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.enums.MonthOfYearEnum.MonthOfYear}
   */
  public enum MonthOfYear
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
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * January.
     * </pre>
     *
     * <code>JANUARY = 2;</code>
     */
    JANUARY(2),
    /**
     * <pre>
     * February.
     * </pre>
     *
     * <code>FEBRUARY = 3;</code>
     */
    FEBRUARY(3),
    /**
     * <pre>
     * March.
     * </pre>
     *
     * <code>MARCH = 4;</code>
     */
    MARCH(4),
    /**
     * <pre>
     * April.
     * </pre>
     *
     * <code>APRIL = 5;</code>
     */
    APRIL(5),
    /**
     * <pre>
     * May.
     * </pre>
     *
     * <code>MAY = 6;</code>
     */
    MAY(6),
    /**
     * <pre>
     * June.
     * </pre>
     *
     * <code>JUNE = 7;</code>
     */
    JUNE(7),
    /**
     * <pre>
     * July.
     * </pre>
     *
     * <code>JULY = 8;</code>
     */
    JULY(8),
    /**
     * <pre>
     * August.
     * </pre>
     *
     * <code>AUGUST = 9;</code>
     */
    AUGUST(9),
    /**
     * <pre>
     * September.
     * </pre>
     *
     * <code>SEPTEMBER = 10;</code>
     */
    SEPTEMBER(10),
    /**
     * <pre>
     * October.
     * </pre>
     *
     * <code>OCTOBER = 11;</code>
     */
    OCTOBER(11),
    /**
     * <pre>
     * November.
     * </pre>
     *
     * <code>NOVEMBER = 12;</code>
     */
    NOVEMBER(12),
    /**
     * <pre>
     * December.
     * </pre>
     *
     * <code>DECEMBER = 13;</code>
     */
    DECEMBER(13),
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
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * January.
     * </pre>
     *
     * <code>JANUARY = 2;</code>
     */
    public static final int JANUARY_VALUE = 2;
    /**
     * <pre>
     * February.
     * </pre>
     *
     * <code>FEBRUARY = 3;</code>
     */
    public static final int FEBRUARY_VALUE = 3;
    /**
     * <pre>
     * March.
     * </pre>
     *
     * <code>MARCH = 4;</code>
     */
    public static final int MARCH_VALUE = 4;
    /**
     * <pre>
     * April.
     * </pre>
     *
     * <code>APRIL = 5;</code>
     */
    public static final int APRIL_VALUE = 5;
    /**
     * <pre>
     * May.
     * </pre>
     *
     * <code>MAY = 6;</code>
     */
    public static final int MAY_VALUE = 6;
    /**
     * <pre>
     * June.
     * </pre>
     *
     * <code>JUNE = 7;</code>
     */
    public static final int JUNE_VALUE = 7;
    /**
     * <pre>
     * July.
     * </pre>
     *
     * <code>JULY = 8;</code>
     */
    public static final int JULY_VALUE = 8;
    /**
     * <pre>
     * August.
     * </pre>
     *
     * <code>AUGUST = 9;</code>
     */
    public static final int AUGUST_VALUE = 9;
    /**
     * <pre>
     * September.
     * </pre>
     *
     * <code>SEPTEMBER = 10;</code>
     */
    public static final int SEPTEMBER_VALUE = 10;
    /**
     * <pre>
     * October.
     * </pre>
     *
     * <code>OCTOBER = 11;</code>
     */
    public static final int OCTOBER_VALUE = 11;
    /**
     * <pre>
     * November.
     * </pre>
     *
     * <code>NOVEMBER = 12;</code>
     */
    public static final int NOVEMBER_VALUE = 12;
    /**
     * <pre>
     * December.
     * </pre>
     *
     * <code>DECEMBER = 13;</code>
     */
    public static final int DECEMBER_VALUE = 13;


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
    public static MonthOfYear valueOf(int value) {
      return forNumber(value);
    }

    public static MonthOfYear forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return JANUARY;
        case 3: return FEBRUARY;
        case 4: return MARCH;
        case 5: return APRIL;
        case 6: return MAY;
        case 7: return JUNE;
        case 8: return JULY;
        case 9: return AUGUST;
        case 10: return SEPTEMBER;
        case 11: return OCTOBER;
        case 12: return NOVEMBER;
        case 13: return DECEMBER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MonthOfYear>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MonthOfYear> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MonthOfYear>() {
            public MonthOfYear findValueByNumber(int number) {
              return MonthOfYear.forNumber(number);
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
      return com.google.ads.googleads.v1.enums.MonthOfYearEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final MonthOfYear[] VALUES = values();

    public static MonthOfYear valueOf(
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

    private MonthOfYear(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.enums.MonthOfYearEnum.MonthOfYear)
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
    if (!(obj instanceof com.google.ads.googleads.v1.enums.MonthOfYearEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.enums.MonthOfYearEnum other = (com.google.ads.googleads.v1.enums.MonthOfYearEnum) obj;

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

  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.enums.MonthOfYearEnum prototype) {
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
   * Container for enumeration of months of the year, e.g., "January".
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.enums.MonthOfYearEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.enums.MonthOfYearEnum)
      com.google.ads.googleads.v1.enums.MonthOfYearEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.MonthOfYearProto.internal_static_google_ads_googleads_v1_enums_MonthOfYearEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.enums.MonthOfYearProto.internal_static_google_ads_googleads_v1_enums_MonthOfYearEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.enums.MonthOfYearEnum.class, com.google.ads.googleads.v1.enums.MonthOfYearEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.enums.MonthOfYearEnum.newBuilder()
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
      return com.google.ads.googleads.v1.enums.MonthOfYearProto.internal_static_google_ads_googleads_v1_enums_MonthOfYearEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.MonthOfYearEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.enums.MonthOfYearEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.MonthOfYearEnum build() {
      com.google.ads.googleads.v1.enums.MonthOfYearEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.MonthOfYearEnum buildPartial() {
      com.google.ads.googleads.v1.enums.MonthOfYearEnum result = new com.google.ads.googleads.v1.enums.MonthOfYearEnum(this);
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
      if (other instanceof com.google.ads.googleads.v1.enums.MonthOfYearEnum) {
        return mergeFrom((com.google.ads.googleads.v1.enums.MonthOfYearEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.enums.MonthOfYearEnum other) {
      if (other == com.google.ads.googleads.v1.enums.MonthOfYearEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.enums.MonthOfYearEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.enums.MonthOfYearEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.enums.MonthOfYearEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.enums.MonthOfYearEnum)
  private static final com.google.ads.googleads.v1.enums.MonthOfYearEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.enums.MonthOfYearEnum();
  }

  public static com.google.ads.googleads.v1.enums.MonthOfYearEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MonthOfYearEnum>
      PARSER = new com.google.protobuf.AbstractParser<MonthOfYearEnum>() {
    @java.lang.Override
    public MonthOfYearEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MonthOfYearEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MonthOfYearEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MonthOfYearEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.enums.MonthOfYearEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

