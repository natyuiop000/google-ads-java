// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/criteria.proto

package com.google.ads.googleads.v2.common;

/**
 * <pre>
 * Represents a particular interest-based topic to be targeted.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.common.UserInterestInfo}
 */
public  final class UserInterestInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.common.UserInterestInfo)
    UserInterestInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserInterestInfo.newBuilder() to construct.
  private UserInterestInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserInterestInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserInterestInfo(
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
            if (userInterestCategory_ != null) {
              subBuilder = userInterestCategory_.toBuilder();
            }
            userInterestCategory_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userInterestCategory_);
              userInterestCategory_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_UserInterestInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_UserInterestInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.common.UserInterestInfo.class, com.google.ads.googleads.v2.common.UserInterestInfo.Builder.class);
  }

  public static final int USER_INTEREST_CATEGORY_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue userInterestCategory_;
  /**
   * <pre>
   * The UserInterest resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_interest_category = 1;</code>
   */
  public boolean hasUserInterestCategory() {
    return userInterestCategory_ != null;
  }
  /**
   * <pre>
   * The UserInterest resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_interest_category = 1;</code>
   */
  public com.google.protobuf.StringValue getUserInterestCategory() {
    return userInterestCategory_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : userInterestCategory_;
  }
  /**
   * <pre>
   * The UserInterest resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_interest_category = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getUserInterestCategoryOrBuilder() {
    return getUserInterestCategory();
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
    if (userInterestCategory_ != null) {
      output.writeMessage(1, getUserInterestCategory());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userInterestCategory_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUserInterestCategory());
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
    if (!(obj instanceof com.google.ads.googleads.v2.common.UserInterestInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.common.UserInterestInfo other = (com.google.ads.googleads.v2.common.UserInterestInfo) obj;

    if (hasUserInterestCategory() != other.hasUserInterestCategory()) return false;
    if (hasUserInterestCategory()) {
      if (!getUserInterestCategory()
          .equals(other.getUserInterestCategory())) return false;
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
    if (hasUserInterestCategory()) {
      hash = (37 * hash) + USER_INTEREST_CATEGORY_FIELD_NUMBER;
      hash = (53 * hash) + getUserInterestCategory().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.common.UserInterestInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.UserInterestInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.UserInterestInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.UserInterestInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.UserInterestInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.UserInterestInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.UserInterestInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.UserInterestInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.UserInterestInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.UserInterestInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.UserInterestInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.UserInterestInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.common.UserInterestInfo prototype) {
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
   * Represents a particular interest-based topic to be targeted.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.common.UserInterestInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.common.UserInterestInfo)
      com.google.ads.googleads.v2.common.UserInterestInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_UserInterestInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_UserInterestInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.common.UserInterestInfo.class, com.google.ads.googleads.v2.common.UserInterestInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.common.UserInterestInfo.newBuilder()
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
      if (userInterestCategoryBuilder_ == null) {
        userInterestCategory_ = null;
      } else {
        userInterestCategory_ = null;
        userInterestCategoryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_UserInterestInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.UserInterestInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.common.UserInterestInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.UserInterestInfo build() {
      com.google.ads.googleads.v2.common.UserInterestInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.UserInterestInfo buildPartial() {
      com.google.ads.googleads.v2.common.UserInterestInfo result = new com.google.ads.googleads.v2.common.UserInterestInfo(this);
      if (userInterestCategoryBuilder_ == null) {
        result.userInterestCategory_ = userInterestCategory_;
      } else {
        result.userInterestCategory_ = userInterestCategoryBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.common.UserInterestInfo) {
        return mergeFrom((com.google.ads.googleads.v2.common.UserInterestInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.common.UserInterestInfo other) {
      if (other == com.google.ads.googleads.v2.common.UserInterestInfo.getDefaultInstance()) return this;
      if (other.hasUserInterestCategory()) {
        mergeUserInterestCategory(other.getUserInterestCategory());
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
      com.google.ads.googleads.v2.common.UserInterestInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.common.UserInterestInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue userInterestCategory_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> userInterestCategoryBuilder_;
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_interest_category = 1;</code>
     */
    public boolean hasUserInterestCategory() {
      return userInterestCategoryBuilder_ != null || userInterestCategory_ != null;
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_interest_category = 1;</code>
     */
    public com.google.protobuf.StringValue getUserInterestCategory() {
      if (userInterestCategoryBuilder_ == null) {
        return userInterestCategory_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : userInterestCategory_;
      } else {
        return userInterestCategoryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_interest_category = 1;</code>
     */
    public Builder setUserInterestCategory(com.google.protobuf.StringValue value) {
      if (userInterestCategoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userInterestCategory_ = value;
        onChanged();
      } else {
        userInterestCategoryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_interest_category = 1;</code>
     */
    public Builder setUserInterestCategory(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (userInterestCategoryBuilder_ == null) {
        userInterestCategory_ = builderForValue.build();
        onChanged();
      } else {
        userInterestCategoryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_interest_category = 1;</code>
     */
    public Builder mergeUserInterestCategory(com.google.protobuf.StringValue value) {
      if (userInterestCategoryBuilder_ == null) {
        if (userInterestCategory_ != null) {
          userInterestCategory_ =
            com.google.protobuf.StringValue.newBuilder(userInterestCategory_).mergeFrom(value).buildPartial();
        } else {
          userInterestCategory_ = value;
        }
        onChanged();
      } else {
        userInterestCategoryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_interest_category = 1;</code>
     */
    public Builder clearUserInterestCategory() {
      if (userInterestCategoryBuilder_ == null) {
        userInterestCategory_ = null;
        onChanged();
      } else {
        userInterestCategory_ = null;
        userInterestCategoryBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_interest_category = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getUserInterestCategoryBuilder() {
      
      onChanged();
      return getUserInterestCategoryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_interest_category = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getUserInterestCategoryOrBuilder() {
      if (userInterestCategoryBuilder_ != null) {
        return userInterestCategoryBuilder_.getMessageOrBuilder();
      } else {
        return userInterestCategory_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : userInterestCategory_;
      }
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_interest_category = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getUserInterestCategoryFieldBuilder() {
      if (userInterestCategoryBuilder_ == null) {
        userInterestCategoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getUserInterestCategory(),
                getParentForChildren(),
                isClean());
        userInterestCategory_ = null;
      }
      return userInterestCategoryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.common.UserInterestInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.common.UserInterestInfo)
  private static final com.google.ads.googleads.v2.common.UserInterestInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.common.UserInterestInfo();
  }

  public static com.google.ads.googleads.v2.common.UserInterestInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserInterestInfo>
      PARSER = new com.google.protobuf.AbstractParser<UserInterestInfo>() {
    @java.lang.Override
    public UserInterestInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserInterestInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserInterestInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserInterestInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.common.UserInterestInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

