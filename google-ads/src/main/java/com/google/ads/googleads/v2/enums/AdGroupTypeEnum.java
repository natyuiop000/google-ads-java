// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/enums/ad_group_type.proto

package com.google.ads.googleads.v2.enums;

/**
 * <pre>
 * Defines types of an ad group, specific to a particular campaign channel
 * type. This type drives validations that restrict which entities can be
 * added to the ad group.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.enums.AdGroupTypeEnum}
 */
public  final class AdGroupTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.enums.AdGroupTypeEnum)
    AdGroupTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdGroupTypeEnum.newBuilder() to construct.
  private AdGroupTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdGroupTypeEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdGroupTypeEnum(
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
    return com.google.ads.googleads.v2.enums.AdGroupTypeProto.internal_static_google_ads_googleads_v2_enums_AdGroupTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.enums.AdGroupTypeProto.internal_static_google_ads_googleads_v2_enums_AdGroupTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.enums.AdGroupTypeEnum.class, com.google.ads.googleads.v2.enums.AdGroupTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum listing the possible types of an ad group.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v2.enums.AdGroupTypeEnum.AdGroupType}
   */
  public enum AdGroupType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The type has not been specified.
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
     * The default ad group type for Search campaigns.
     * </pre>
     *
     * <code>SEARCH_STANDARD = 2;</code>
     */
    SEARCH_STANDARD(2),
    /**
     * <pre>
     * The default ad group type for Display campaigns.
     * </pre>
     *
     * <code>DISPLAY_STANDARD = 3;</code>
     */
    DISPLAY_STANDARD(3),
    /**
     * <pre>
     * The ad group type for Shopping campaigns serving standard product ads.
     * </pre>
     *
     * <code>SHOPPING_PRODUCT_ADS = 4;</code>
     */
    SHOPPING_PRODUCT_ADS(4),
    /**
     * <pre>
     * The default ad group type for Hotel campaigns.
     * </pre>
     *
     * <code>HOTEL_ADS = 6;</code>
     */
    HOTEL_ADS(6),
    /**
     * <pre>
     * The type for ad groups in Smart Shopping campaigns.
     * </pre>
     *
     * <code>SHOPPING_SMART_ADS = 7;</code>
     */
    SHOPPING_SMART_ADS(7),
    /**
     * <pre>
     * Short unskippable in-stream video ads.
     * </pre>
     *
     * <code>VIDEO_BUMPER = 8;</code>
     */
    VIDEO_BUMPER(8),
    /**
     * <pre>
     * TrueView (skippable) in-stream video ads.
     * </pre>
     *
     * <code>VIDEO_TRUE_VIEW_IN_STREAM = 9;</code>
     */
    VIDEO_TRUE_VIEW_IN_STREAM(9),
    /**
     * <pre>
     * TrueView in-display video ads.
     * </pre>
     *
     * <code>VIDEO_TRUE_VIEW_IN_DISPLAY = 10;</code>
     */
    VIDEO_TRUE_VIEW_IN_DISPLAY(10),
    /**
     * <pre>
     * Unskippable in-stream video ads.
     * </pre>
     *
     * <code>VIDEO_NON_SKIPPABLE_IN_STREAM = 11;</code>
     */
    VIDEO_NON_SKIPPABLE_IN_STREAM(11),
    /**
     * <pre>
     * Outstream video ads.
     * </pre>
     *
     * <code>VIDEO_OUTSTREAM = 12;</code>
     */
    VIDEO_OUTSTREAM(12),
    /**
     * <pre>
     * Ad group type for Dynamic Search Ads ad groups.
     * </pre>
     *
     * <code>SEARCH_DYNAMIC_ADS = 13;</code>
     */
    SEARCH_DYNAMIC_ADS(13),
    /**
     * <pre>
     * The type for ad groups in Shopping Comparison Listing campaigns.
     * </pre>
     *
     * <code>SHOPPING_COMPARISON_LISTING_ADS = 14;</code>
     */
    SHOPPING_COMPARISON_LISTING_ADS(14),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The type has not been specified.
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
     * The default ad group type for Search campaigns.
     * </pre>
     *
     * <code>SEARCH_STANDARD = 2;</code>
     */
    public static final int SEARCH_STANDARD_VALUE = 2;
    /**
     * <pre>
     * The default ad group type for Display campaigns.
     * </pre>
     *
     * <code>DISPLAY_STANDARD = 3;</code>
     */
    public static final int DISPLAY_STANDARD_VALUE = 3;
    /**
     * <pre>
     * The ad group type for Shopping campaigns serving standard product ads.
     * </pre>
     *
     * <code>SHOPPING_PRODUCT_ADS = 4;</code>
     */
    public static final int SHOPPING_PRODUCT_ADS_VALUE = 4;
    /**
     * <pre>
     * The default ad group type for Hotel campaigns.
     * </pre>
     *
     * <code>HOTEL_ADS = 6;</code>
     */
    public static final int HOTEL_ADS_VALUE = 6;
    /**
     * <pre>
     * The type for ad groups in Smart Shopping campaigns.
     * </pre>
     *
     * <code>SHOPPING_SMART_ADS = 7;</code>
     */
    public static final int SHOPPING_SMART_ADS_VALUE = 7;
    /**
     * <pre>
     * Short unskippable in-stream video ads.
     * </pre>
     *
     * <code>VIDEO_BUMPER = 8;</code>
     */
    public static final int VIDEO_BUMPER_VALUE = 8;
    /**
     * <pre>
     * TrueView (skippable) in-stream video ads.
     * </pre>
     *
     * <code>VIDEO_TRUE_VIEW_IN_STREAM = 9;</code>
     */
    public static final int VIDEO_TRUE_VIEW_IN_STREAM_VALUE = 9;
    /**
     * <pre>
     * TrueView in-display video ads.
     * </pre>
     *
     * <code>VIDEO_TRUE_VIEW_IN_DISPLAY = 10;</code>
     */
    public static final int VIDEO_TRUE_VIEW_IN_DISPLAY_VALUE = 10;
    /**
     * <pre>
     * Unskippable in-stream video ads.
     * </pre>
     *
     * <code>VIDEO_NON_SKIPPABLE_IN_STREAM = 11;</code>
     */
    public static final int VIDEO_NON_SKIPPABLE_IN_STREAM_VALUE = 11;
    /**
     * <pre>
     * Outstream video ads.
     * </pre>
     *
     * <code>VIDEO_OUTSTREAM = 12;</code>
     */
    public static final int VIDEO_OUTSTREAM_VALUE = 12;
    /**
     * <pre>
     * Ad group type for Dynamic Search Ads ad groups.
     * </pre>
     *
     * <code>SEARCH_DYNAMIC_ADS = 13;</code>
     */
    public static final int SEARCH_DYNAMIC_ADS_VALUE = 13;
    /**
     * <pre>
     * The type for ad groups in Shopping Comparison Listing campaigns.
     * </pre>
     *
     * <code>SHOPPING_COMPARISON_LISTING_ADS = 14;</code>
     */
    public static final int SHOPPING_COMPARISON_LISTING_ADS_VALUE = 14;


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
    public static AdGroupType valueOf(int value) {
      return forNumber(value);
    }

    public static AdGroupType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return SEARCH_STANDARD;
        case 3: return DISPLAY_STANDARD;
        case 4: return SHOPPING_PRODUCT_ADS;
        case 6: return HOTEL_ADS;
        case 7: return SHOPPING_SMART_ADS;
        case 8: return VIDEO_BUMPER;
        case 9: return VIDEO_TRUE_VIEW_IN_STREAM;
        case 10: return VIDEO_TRUE_VIEW_IN_DISPLAY;
        case 11: return VIDEO_NON_SKIPPABLE_IN_STREAM;
        case 12: return VIDEO_OUTSTREAM;
        case 13: return SEARCH_DYNAMIC_ADS;
        case 14: return SHOPPING_COMPARISON_LISTING_ADS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdGroupType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdGroupType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdGroupType>() {
            public AdGroupType findValueByNumber(int number) {
              return AdGroupType.forNumber(number);
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
      return com.google.ads.googleads.v2.enums.AdGroupTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdGroupType[] VALUES = values();

    public static AdGroupType valueOf(
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

    private AdGroupType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v2.enums.AdGroupTypeEnum.AdGroupType)
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
    if (!(obj instanceof com.google.ads.googleads.v2.enums.AdGroupTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.enums.AdGroupTypeEnum other = (com.google.ads.googleads.v2.enums.AdGroupTypeEnum) obj;

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

  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.enums.AdGroupTypeEnum prototype) {
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
   * Defines types of an ad group, specific to a particular campaign channel
   * type. This type drives validations that restrict which entities can be
   * added to the ad group.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.enums.AdGroupTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.enums.AdGroupTypeEnum)
      com.google.ads.googleads.v2.enums.AdGroupTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.enums.AdGroupTypeProto.internal_static_google_ads_googleads_v2_enums_AdGroupTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.enums.AdGroupTypeProto.internal_static_google_ads_googleads_v2_enums_AdGroupTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.enums.AdGroupTypeEnum.class, com.google.ads.googleads.v2.enums.AdGroupTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.enums.AdGroupTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v2.enums.AdGroupTypeProto.internal_static_google_ads_googleads_v2_enums_AdGroupTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.enums.AdGroupTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.enums.AdGroupTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.enums.AdGroupTypeEnum build() {
      com.google.ads.googleads.v2.enums.AdGroupTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.enums.AdGroupTypeEnum buildPartial() {
      com.google.ads.googleads.v2.enums.AdGroupTypeEnum result = new com.google.ads.googleads.v2.enums.AdGroupTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v2.enums.AdGroupTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v2.enums.AdGroupTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.enums.AdGroupTypeEnum other) {
      if (other == com.google.ads.googleads.v2.enums.AdGroupTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v2.enums.AdGroupTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.enums.AdGroupTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.enums.AdGroupTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.enums.AdGroupTypeEnum)
  private static final com.google.ads.googleads.v2.enums.AdGroupTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.enums.AdGroupTypeEnum();
  }

  public static com.google.ads.googleads.v2.enums.AdGroupTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdGroupTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdGroupTypeEnum>() {
    @java.lang.Override
    public AdGroupTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdGroupTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdGroupTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdGroupTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.enums.AdGroupTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

