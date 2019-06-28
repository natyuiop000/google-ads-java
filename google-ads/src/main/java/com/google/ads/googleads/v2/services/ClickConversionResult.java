// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/conversion_upload_service.proto

package com.google.ads.googleads.v2.services;

/**
 * <pre>
 * Identifying information for a successfully processed ClickConversion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.services.ClickConversionResult}
 */
public  final class ClickConversionResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.services.ClickConversionResult)
    ClickConversionResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClickConversionResult.newBuilder() to construct.
  private ClickConversionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClickConversionResult() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClickConversionResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (gclid_ != null) {
              subBuilder = gclid_.toBuilder();
            }
            gclid_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gclid_);
              gclid_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (conversionAction_ != null) {
              subBuilder = conversionAction_.toBuilder();
            }
            conversionAction_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(conversionAction_);
              conversionAction_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (conversionDateTime_ != null) {
              subBuilder = conversionDateTime_.toBuilder();
            }
            conversionDateTime_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(conversionDateTime_);
              conversionDateTime_ = subBuilder.buildPartial();
            }

            break;
          }
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
    return com.google.ads.googleads.v2.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v2_services_ClickConversionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v2_services_ClickConversionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.services.ClickConversionResult.class, com.google.ads.googleads.v2.services.ClickConversionResult.Builder.class);
  }

  public static final int GCLID_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue gclid_;
  /**
   * <pre>
   * The Google Click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue gclid = 1;</code>
   */
  public boolean hasGclid() {
    return gclid_ != null;
  }
  /**
   * <pre>
   * The Google Click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue gclid = 1;</code>
   */
  public com.google.protobuf.StringValue getGclid() {
    return gclid_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : gclid_;
  }
  /**
   * <pre>
   * The Google Click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue gclid = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getGclidOrBuilder() {
    return getGclid();
  }

  public static final int CONVERSION_ACTION_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue conversionAction_;
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 2;</code>
   */
  public boolean hasConversionAction() {
    return conversionAction_ != null;
  }
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 2;</code>
   */
  public com.google.protobuf.StringValue getConversionAction() {
    return conversionAction_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : conversionAction_;
  }
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getConversionActionOrBuilder() {
    return getConversionAction();
  }

  public static final int CONVERSION_DATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue conversionDateTime_;
  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
   */
  public boolean hasConversionDateTime() {
    return conversionDateTime_ != null;
  }
  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
   */
  public com.google.protobuf.StringValue getConversionDateTime() {
    return conversionDateTime_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : conversionDateTime_;
  }
  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getConversionDateTimeOrBuilder() {
    return getConversionDateTime();
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
    if (gclid_ != null) {
      output.writeMessage(1, getGclid());
    }
    if (conversionAction_ != null) {
      output.writeMessage(2, getConversionAction());
    }
    if (conversionDateTime_ != null) {
      output.writeMessage(3, getConversionDateTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gclid_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGclid());
    }
    if (conversionAction_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConversionAction());
    }
    if (conversionDateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getConversionDateTime());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v2.services.ClickConversionResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.services.ClickConversionResult other = (com.google.ads.googleads.v2.services.ClickConversionResult) obj;

    if (hasGclid() != other.hasGclid()) return false;
    if (hasGclid()) {
      if (!getGclid()
          .equals(other.getGclid())) return false;
    }
    if (hasConversionAction() != other.hasConversionAction()) return false;
    if (hasConversionAction()) {
      if (!getConversionAction()
          .equals(other.getConversionAction())) return false;
    }
    if (hasConversionDateTime() != other.hasConversionDateTime()) return false;
    if (hasConversionDateTime()) {
      if (!getConversionDateTime()
          .equals(other.getConversionDateTime())) return false;
    }
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
    if (hasGclid()) {
      hash = (37 * hash) + GCLID_FIELD_NUMBER;
      hash = (53 * hash) + getGclid().hashCode();
    }
    if (hasConversionAction()) {
      hash = (37 * hash) + CONVERSION_ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getConversionAction().hashCode();
    }
    if (hasConversionDateTime()) {
      hash = (37 * hash) + CONVERSION_DATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getConversionDateTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.services.ClickConversionResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.ClickConversionResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.ClickConversionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.ClickConversionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.ClickConversionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.ClickConversionResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.ClickConversionResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.ClickConversionResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.ClickConversionResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.ClickConversionResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.ClickConversionResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.ClickConversionResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.services.ClickConversionResult prototype) {
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
   * Identifying information for a successfully processed ClickConversion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.services.ClickConversionResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.services.ClickConversionResult)
      com.google.ads.googleads.v2.services.ClickConversionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v2_services_ClickConversionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v2_services_ClickConversionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.services.ClickConversionResult.class, com.google.ads.googleads.v2.services.ClickConversionResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.services.ClickConversionResult.newBuilder()
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
      if (gclidBuilder_ == null) {
        gclid_ = null;
      } else {
        gclid_ = null;
        gclidBuilder_ = null;
      }
      if (conversionActionBuilder_ == null) {
        conversionAction_ = null;
      } else {
        conversionAction_ = null;
        conversionActionBuilder_ = null;
      }
      if (conversionDateTimeBuilder_ == null) {
        conversionDateTime_ = null;
      } else {
        conversionDateTime_ = null;
        conversionDateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v2_services_ClickConversionResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.ClickConversionResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.services.ClickConversionResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.ClickConversionResult build() {
      com.google.ads.googleads.v2.services.ClickConversionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.ClickConversionResult buildPartial() {
      com.google.ads.googleads.v2.services.ClickConversionResult result = new com.google.ads.googleads.v2.services.ClickConversionResult(this);
      if (gclidBuilder_ == null) {
        result.gclid_ = gclid_;
      } else {
        result.gclid_ = gclidBuilder_.build();
      }
      if (conversionActionBuilder_ == null) {
        result.conversionAction_ = conversionAction_;
      } else {
        result.conversionAction_ = conversionActionBuilder_.build();
      }
      if (conversionDateTimeBuilder_ == null) {
        result.conversionDateTime_ = conversionDateTime_;
      } else {
        result.conversionDateTime_ = conversionDateTimeBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v2.services.ClickConversionResult) {
        return mergeFrom((com.google.ads.googleads.v2.services.ClickConversionResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.services.ClickConversionResult other) {
      if (other == com.google.ads.googleads.v2.services.ClickConversionResult.getDefaultInstance()) return this;
      if (other.hasGclid()) {
        mergeGclid(other.getGclid());
      }
      if (other.hasConversionAction()) {
        mergeConversionAction(other.getConversionAction());
      }
      if (other.hasConversionDateTime()) {
        mergeConversionDateTime(other.getConversionDateTime());
      }
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
      com.google.ads.googleads.v2.services.ClickConversionResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.services.ClickConversionResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue gclid_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> gclidBuilder_;
    /**
     * <pre>
     * The Google Click ID (gclid) associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public boolean hasGclid() {
      return gclidBuilder_ != null || gclid_ != null;
    }
    /**
     * <pre>
     * The Google Click ID (gclid) associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public com.google.protobuf.StringValue getGclid() {
      if (gclidBuilder_ == null) {
        return gclid_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : gclid_;
      } else {
        return gclidBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Google Click ID (gclid) associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public Builder setGclid(com.google.protobuf.StringValue value) {
      if (gclidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gclid_ = value;
        onChanged();
      } else {
        gclidBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Google Click ID (gclid) associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public Builder setGclid(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (gclidBuilder_ == null) {
        gclid_ = builderForValue.build();
        onChanged();
      } else {
        gclidBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Google Click ID (gclid) associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public Builder mergeGclid(com.google.protobuf.StringValue value) {
      if (gclidBuilder_ == null) {
        if (gclid_ != null) {
          gclid_ =
            com.google.protobuf.StringValue.newBuilder(gclid_).mergeFrom(value).buildPartial();
        } else {
          gclid_ = value;
        }
        onChanged();
      } else {
        gclidBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Google Click ID (gclid) associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public Builder clearGclid() {
      if (gclidBuilder_ == null) {
        gclid_ = null;
        onChanged();
      } else {
        gclid_ = null;
        gclidBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Google Click ID (gclid) associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getGclidBuilder() {
      
      onChanged();
      return getGclidFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Google Click ID (gclid) associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getGclidOrBuilder() {
      if (gclidBuilder_ != null) {
        return gclidBuilder_.getMessageOrBuilder();
      } else {
        return gclid_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : gclid_;
      }
    }
    /**
     * <pre>
     * The Google Click ID (gclid) associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getGclidFieldBuilder() {
      if (gclidBuilder_ == null) {
        gclidBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getGclid(),
                getParentForChildren(),
                isClean());
        gclid_ = null;
      }
      return gclidBuilder_;
    }

    private com.google.protobuf.StringValue conversionAction_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> conversionActionBuilder_;
    /**
     * <pre>
     * Resource name of the conversion action associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_action = 2;</code>
     */
    public boolean hasConversionAction() {
      return conversionActionBuilder_ != null || conversionAction_ != null;
    }
    /**
     * <pre>
     * Resource name of the conversion action associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_action = 2;</code>
     */
    public com.google.protobuf.StringValue getConversionAction() {
      if (conversionActionBuilder_ == null) {
        return conversionAction_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : conversionAction_;
      } else {
        return conversionActionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Resource name of the conversion action associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_action = 2;</code>
     */
    public Builder setConversionAction(com.google.protobuf.StringValue value) {
      if (conversionActionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversionAction_ = value;
        onChanged();
      } else {
        conversionActionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Resource name of the conversion action associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_action = 2;</code>
     */
    public Builder setConversionAction(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (conversionActionBuilder_ == null) {
        conversionAction_ = builderForValue.build();
        onChanged();
      } else {
        conversionActionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Resource name of the conversion action associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_action = 2;</code>
     */
    public Builder mergeConversionAction(com.google.protobuf.StringValue value) {
      if (conversionActionBuilder_ == null) {
        if (conversionAction_ != null) {
          conversionAction_ =
            com.google.protobuf.StringValue.newBuilder(conversionAction_).mergeFrom(value).buildPartial();
        } else {
          conversionAction_ = value;
        }
        onChanged();
      } else {
        conversionActionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Resource name of the conversion action associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_action = 2;</code>
     */
    public Builder clearConversionAction() {
      if (conversionActionBuilder_ == null) {
        conversionAction_ = null;
        onChanged();
      } else {
        conversionAction_ = null;
        conversionActionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Resource name of the conversion action associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_action = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getConversionActionBuilder() {
      
      onChanged();
      return getConversionActionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Resource name of the conversion action associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_action = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getConversionActionOrBuilder() {
      if (conversionActionBuilder_ != null) {
        return conversionActionBuilder_.getMessageOrBuilder();
      } else {
        return conversionAction_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : conversionAction_;
      }
    }
    /**
     * <pre>
     * Resource name of the conversion action associated with this conversion.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_action = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getConversionActionFieldBuilder() {
      if (conversionActionBuilder_ == null) {
        conversionActionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getConversionAction(),
                getParentForChildren(),
                isClean());
        conversionAction_ = null;
      }
      return conversionActionBuilder_;
    }

    private com.google.protobuf.StringValue conversionDateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> conversionDateTimeBuilder_;
    /**
     * <pre>
     * The date time at which the conversion occurred. The format is
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
     */
    public boolean hasConversionDateTime() {
      return conversionDateTimeBuilder_ != null || conversionDateTime_ != null;
    }
    /**
     * <pre>
     * The date time at which the conversion occurred. The format is
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
     */
    public com.google.protobuf.StringValue getConversionDateTime() {
      if (conversionDateTimeBuilder_ == null) {
        return conversionDateTime_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : conversionDateTime_;
      } else {
        return conversionDateTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The date time at which the conversion occurred. The format is
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
     */
    public Builder setConversionDateTime(com.google.protobuf.StringValue value) {
      if (conversionDateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversionDateTime_ = value;
        onChanged();
      } else {
        conversionDateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The date time at which the conversion occurred. The format is
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
     */
    public Builder setConversionDateTime(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (conversionDateTimeBuilder_ == null) {
        conversionDateTime_ = builderForValue.build();
        onChanged();
      } else {
        conversionDateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The date time at which the conversion occurred. The format is
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
     */
    public Builder mergeConversionDateTime(com.google.protobuf.StringValue value) {
      if (conversionDateTimeBuilder_ == null) {
        if (conversionDateTime_ != null) {
          conversionDateTime_ =
            com.google.protobuf.StringValue.newBuilder(conversionDateTime_).mergeFrom(value).buildPartial();
        } else {
          conversionDateTime_ = value;
        }
        onChanged();
      } else {
        conversionDateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The date time at which the conversion occurred. The format is
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
     */
    public Builder clearConversionDateTime() {
      if (conversionDateTimeBuilder_ == null) {
        conversionDateTime_ = null;
        onChanged();
      } else {
        conversionDateTime_ = null;
        conversionDateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The date time at which the conversion occurred. The format is
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getConversionDateTimeBuilder() {
      
      onChanged();
      return getConversionDateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The date time at which the conversion occurred. The format is
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getConversionDateTimeOrBuilder() {
      if (conversionDateTimeBuilder_ != null) {
        return conversionDateTimeBuilder_.getMessageOrBuilder();
      } else {
        return conversionDateTime_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : conversionDateTime_;
      }
    }
    /**
     * <pre>
     * The date time at which the conversion occurred. The format is
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getConversionDateTimeFieldBuilder() {
      if (conversionDateTimeBuilder_ == null) {
        conversionDateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getConversionDateTime(),
                getParentForChildren(),
                isClean());
        conversionDateTime_ = null;
      }
      return conversionDateTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.services.ClickConversionResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.ClickConversionResult)
  private static final com.google.ads.googleads.v2.services.ClickConversionResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.services.ClickConversionResult();
  }

  public static com.google.ads.googleads.v2.services.ClickConversionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClickConversionResult>
      PARSER = new com.google.protobuf.AbstractParser<ClickConversionResult>() {
    @java.lang.Override
    public ClickConversionResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClickConversionResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClickConversionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClickConversionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.services.ClickConversionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

