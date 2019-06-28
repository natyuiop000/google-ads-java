// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/enums/affiliate_location_placeholder_field.proto

package com.google.ads.googleads.v2.enums;

/**
 * <pre>
 * Values for Affiliate Location placeholder fields.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum}
 */
public  final class AffiliateLocationPlaceholderFieldEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum)
    AffiliateLocationPlaceholderFieldEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AffiliateLocationPlaceholderFieldEnum.newBuilder() to construct.
  private AffiliateLocationPlaceholderFieldEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AffiliateLocationPlaceholderFieldEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AffiliateLocationPlaceholderFieldEnum(
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
    return com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldProto.internal_static_google_ads_googleads_v2_enums_AffiliateLocationPlaceholderFieldEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldProto.internal_static_google_ads_googleads_v2_enums_AffiliateLocationPlaceholderFieldEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum.class, com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible values for Affiliate Location placeholder fields.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum.AffiliateLocationPlaceholderField}
   */
  public enum AffiliateLocationPlaceholderField
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
     * Data Type: STRING. The name of the business.
     * </pre>
     *
     * <code>BUSINESS_NAME = 2;</code>
     */
    BUSINESS_NAME(2),
    /**
     * <pre>
     * Data Type: STRING. Line 1 of the business address.
     * </pre>
     *
     * <code>ADDRESS_LINE_1 = 3;</code>
     */
    ADDRESS_LINE_1(3),
    /**
     * <pre>
     * Data Type: STRING. Line 2 of the business address.
     * </pre>
     *
     * <code>ADDRESS_LINE_2 = 4;</code>
     */
    ADDRESS_LINE_2(4),
    /**
     * <pre>
     * Data Type: STRING. City of the business address.
     * </pre>
     *
     * <code>CITY = 5;</code>
     */
    CITY(5),
    /**
     * <pre>
     * Data Type: STRING. Province of the business address.
     * </pre>
     *
     * <code>PROVINCE = 6;</code>
     */
    PROVINCE(6),
    /**
     * <pre>
     * Data Type: STRING. Postal code of the business address.
     * </pre>
     *
     * <code>POSTAL_CODE = 7;</code>
     */
    POSTAL_CODE(7),
    /**
     * <pre>
     * Data Type: STRING. Country code of the business address.
     * </pre>
     *
     * <code>COUNTRY_CODE = 8;</code>
     */
    COUNTRY_CODE(8),
    /**
     * <pre>
     * Data Type: STRING. Phone number of the business.
     * </pre>
     *
     * <code>PHONE_NUMBER = 9;</code>
     */
    PHONE_NUMBER(9),
    /**
     * <pre>
     * Data Type: STRING. Language code of the business.
     * </pre>
     *
     * <code>LANGUAGE_CODE = 10;</code>
     */
    LANGUAGE_CODE(10),
    /**
     * <pre>
     * Data Type: INT64. ID of the chain.
     * </pre>
     *
     * <code>CHAIN_ID = 11;</code>
     */
    CHAIN_ID(11),
    /**
     * <pre>
     * Data Type: STRING. Name of the chain.
     * </pre>
     *
     * <code>CHAIN_NAME = 12;</code>
     */
    CHAIN_NAME(12),
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
     * Data Type: STRING. The name of the business.
     * </pre>
     *
     * <code>BUSINESS_NAME = 2;</code>
     */
    public static final int BUSINESS_NAME_VALUE = 2;
    /**
     * <pre>
     * Data Type: STRING. Line 1 of the business address.
     * </pre>
     *
     * <code>ADDRESS_LINE_1 = 3;</code>
     */
    public static final int ADDRESS_LINE_1_VALUE = 3;
    /**
     * <pre>
     * Data Type: STRING. Line 2 of the business address.
     * </pre>
     *
     * <code>ADDRESS_LINE_2 = 4;</code>
     */
    public static final int ADDRESS_LINE_2_VALUE = 4;
    /**
     * <pre>
     * Data Type: STRING. City of the business address.
     * </pre>
     *
     * <code>CITY = 5;</code>
     */
    public static final int CITY_VALUE = 5;
    /**
     * <pre>
     * Data Type: STRING. Province of the business address.
     * </pre>
     *
     * <code>PROVINCE = 6;</code>
     */
    public static final int PROVINCE_VALUE = 6;
    /**
     * <pre>
     * Data Type: STRING. Postal code of the business address.
     * </pre>
     *
     * <code>POSTAL_CODE = 7;</code>
     */
    public static final int POSTAL_CODE_VALUE = 7;
    /**
     * <pre>
     * Data Type: STRING. Country code of the business address.
     * </pre>
     *
     * <code>COUNTRY_CODE = 8;</code>
     */
    public static final int COUNTRY_CODE_VALUE = 8;
    /**
     * <pre>
     * Data Type: STRING. Phone number of the business.
     * </pre>
     *
     * <code>PHONE_NUMBER = 9;</code>
     */
    public static final int PHONE_NUMBER_VALUE = 9;
    /**
     * <pre>
     * Data Type: STRING. Language code of the business.
     * </pre>
     *
     * <code>LANGUAGE_CODE = 10;</code>
     */
    public static final int LANGUAGE_CODE_VALUE = 10;
    /**
     * <pre>
     * Data Type: INT64. ID of the chain.
     * </pre>
     *
     * <code>CHAIN_ID = 11;</code>
     */
    public static final int CHAIN_ID_VALUE = 11;
    /**
     * <pre>
     * Data Type: STRING. Name of the chain.
     * </pre>
     *
     * <code>CHAIN_NAME = 12;</code>
     */
    public static final int CHAIN_NAME_VALUE = 12;


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
    public static AffiliateLocationPlaceholderField valueOf(int value) {
      return forNumber(value);
    }

    public static AffiliateLocationPlaceholderField forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return BUSINESS_NAME;
        case 3: return ADDRESS_LINE_1;
        case 4: return ADDRESS_LINE_2;
        case 5: return CITY;
        case 6: return PROVINCE;
        case 7: return POSTAL_CODE;
        case 8: return COUNTRY_CODE;
        case 9: return PHONE_NUMBER;
        case 10: return LANGUAGE_CODE;
        case 11: return CHAIN_ID;
        case 12: return CHAIN_NAME;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AffiliateLocationPlaceholderField>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AffiliateLocationPlaceholderField> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AffiliateLocationPlaceholderField>() {
            public AffiliateLocationPlaceholderField findValueByNumber(int number) {
              return AffiliateLocationPlaceholderField.forNumber(number);
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
      return com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AffiliateLocationPlaceholderField[] VALUES = values();

    public static AffiliateLocationPlaceholderField valueOf(
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

    private AffiliateLocationPlaceholderField(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum.AffiliateLocationPlaceholderField)
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
    if (!(obj instanceof com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum other = (com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum) obj;

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

  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum prototype) {
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
   * Values for Affiliate Location placeholder fields.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum)
      com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldProto.internal_static_google_ads_googleads_v2_enums_AffiliateLocationPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldProto.internal_static_google_ads_googleads_v2_enums_AffiliateLocationPlaceholderFieldEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum.class, com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum.newBuilder()
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
      return com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldProto.internal_static_google_ads_googleads_v2_enums_AffiliateLocationPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum build() {
      com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum buildPartial() {
      com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum result = new com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum(this);
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
      if (other instanceof com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum) {
        return mergeFrom((com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum other) {
      if (other == com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum)
  private static final com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum();
  }

  public static com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AffiliateLocationPlaceholderFieldEnum>
      PARSER = new com.google.protobuf.AbstractParser<AffiliateLocationPlaceholderFieldEnum>() {
    @java.lang.Override
    public AffiliateLocationPlaceholderFieldEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AffiliateLocationPlaceholderFieldEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AffiliateLocationPlaceholderFieldEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AffiliateLocationPlaceholderFieldEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

