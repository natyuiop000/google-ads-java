// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/keyword_plan_keyword_error.proto

package com.google.ads.googleads.v1.errors;

/**
 * <pre>
 * Container for enum describing possible errors from applying a keyword or a
 * negative keyword from a keyword plan.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum}
 */
public  final class KeywordPlanKeywordErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum)
    KeywordPlanKeywordErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanKeywordErrorEnum.newBuilder() to construct.
  private KeywordPlanKeywordErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanKeywordErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordPlanKeywordErrorEnum(
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
    return com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorProto.internal_static_google_ads_googleads_v1_errors_KeywordPlanKeywordErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorProto.internal_static_google_ads_googleads_v1_errors_KeywordPlanKeywordErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum.class, com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible errors from applying a keyword plan keyword.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum.KeywordPlanKeywordError}
   */
  public enum KeywordPlanKeywordError
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
     * A keyword or negative keyword has invalid match type.
     * </pre>
     *
     * <code>INVALID_KEYWORD_MATCH_TYPE = 2;</code>
     */
    INVALID_KEYWORD_MATCH_TYPE(2),
    /**
     * <pre>
     * A keyword or negative keyword with same text and match type already
     * exists.
     * </pre>
     *
     * <code>DUPLICATE_KEYWORD = 3;</code>
     */
    DUPLICATE_KEYWORD(3),
    /**
     * <pre>
     * Keyword or negative keyword text exceeds the allowed limit.
     * </pre>
     *
     * <code>KEYWORD_TEXT_TOO_LONG = 4;</code>
     */
    KEYWORD_TEXT_TOO_LONG(4),
    /**
     * <pre>
     * Keyword or negative keyword text has invalid characters or symbols.
     * </pre>
     *
     * <code>KEYWORD_HAS_INVALID_CHARS = 5;</code>
     */
    KEYWORD_HAS_INVALID_CHARS(5),
    /**
     * <pre>
     * Keyword or negative keyword text has too many words.
     * </pre>
     *
     * <code>KEYWORD_HAS_TOO_MANY_WORDS = 6;</code>
     */
    KEYWORD_HAS_TOO_MANY_WORDS(6),
    /**
     * <pre>
     * Keyword or negative keyword has invalid text.
     * </pre>
     *
     * <code>INVALID_KEYWORD_TEXT = 7;</code>
     */
    INVALID_KEYWORD_TEXT(7),
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
     * A keyword or negative keyword has invalid match type.
     * </pre>
     *
     * <code>INVALID_KEYWORD_MATCH_TYPE = 2;</code>
     */
    public static final int INVALID_KEYWORD_MATCH_TYPE_VALUE = 2;
    /**
     * <pre>
     * A keyword or negative keyword with same text and match type already
     * exists.
     * </pre>
     *
     * <code>DUPLICATE_KEYWORD = 3;</code>
     */
    public static final int DUPLICATE_KEYWORD_VALUE = 3;
    /**
     * <pre>
     * Keyword or negative keyword text exceeds the allowed limit.
     * </pre>
     *
     * <code>KEYWORD_TEXT_TOO_LONG = 4;</code>
     */
    public static final int KEYWORD_TEXT_TOO_LONG_VALUE = 4;
    /**
     * <pre>
     * Keyword or negative keyword text has invalid characters or symbols.
     * </pre>
     *
     * <code>KEYWORD_HAS_INVALID_CHARS = 5;</code>
     */
    public static final int KEYWORD_HAS_INVALID_CHARS_VALUE = 5;
    /**
     * <pre>
     * Keyword or negative keyword text has too many words.
     * </pre>
     *
     * <code>KEYWORD_HAS_TOO_MANY_WORDS = 6;</code>
     */
    public static final int KEYWORD_HAS_TOO_MANY_WORDS_VALUE = 6;
    /**
     * <pre>
     * Keyword or negative keyword has invalid text.
     * </pre>
     *
     * <code>INVALID_KEYWORD_TEXT = 7;</code>
     */
    public static final int INVALID_KEYWORD_TEXT_VALUE = 7;


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
    public static KeywordPlanKeywordError valueOf(int value) {
      return forNumber(value);
    }

    public static KeywordPlanKeywordError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return INVALID_KEYWORD_MATCH_TYPE;
        case 3: return DUPLICATE_KEYWORD;
        case 4: return KEYWORD_TEXT_TOO_LONG;
        case 5: return KEYWORD_HAS_INVALID_CHARS;
        case 6: return KEYWORD_HAS_TOO_MANY_WORDS;
        case 7: return INVALID_KEYWORD_TEXT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KeywordPlanKeywordError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        KeywordPlanKeywordError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<KeywordPlanKeywordError>() {
            public KeywordPlanKeywordError findValueByNumber(int number) {
              return KeywordPlanKeywordError.forNumber(number);
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
      return com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final KeywordPlanKeywordError[] VALUES = values();

    public static KeywordPlanKeywordError valueOf(
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

    private KeywordPlanKeywordError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum.KeywordPlanKeywordError)
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
    if (!(obj instanceof com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum other = (com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum) obj;

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

  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum prototype) {
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
   * Container for enum describing possible errors from applying a keyword or a
   * negative keyword from a keyword plan.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum)
      com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorProto.internal_static_google_ads_googleads_v1_errors_KeywordPlanKeywordErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorProto.internal_static_google_ads_googleads_v1_errors_KeywordPlanKeywordErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum.class, com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorProto.internal_static_google_ads_googleads_v1_errors_KeywordPlanKeywordErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum build() {
      com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum buildPartial() {
      com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum result = new com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum other) {
      if (other == com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum)
  private static final com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum();
  }

  public static com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanKeywordErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanKeywordErrorEnum>() {
    @java.lang.Override
    public KeywordPlanKeywordErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordPlanKeywordErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordPlanKeywordErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanKeywordErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.errors.KeywordPlanKeywordErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

