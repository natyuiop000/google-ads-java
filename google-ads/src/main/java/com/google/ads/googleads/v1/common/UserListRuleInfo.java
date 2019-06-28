// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/user_lists.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * A client defined rule based on custom parameters sent by web sites or
 * uploaded by the advertiser.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.UserListRuleInfo}
 */
public  final class UserListRuleInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.UserListRuleInfo)
    UserListRuleInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListRuleInfo.newBuilder() to construct.
  private UserListRuleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListRuleInfo() {
    ruleType_ = 0;
    ruleItemGroups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserListRuleInfo(
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
          case 8: {
            int rawValue = input.readEnum();

            ruleType_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              ruleItemGroups_ = new java.util.ArrayList<com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo>();
              mutable_bitField0_ |= 0x00000002;
            }
            ruleItemGroups_.add(
                input.readMessage(com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        ruleItemGroups_ = java.util.Collections.unmodifiableList(ruleItemGroups_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_UserListRuleInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_UserListRuleInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.UserListRuleInfo.class, com.google.ads.googleads.v1.common.UserListRuleInfo.Builder.class);
  }

  private int bitField0_;
  public static final int RULE_TYPE_FIELD_NUMBER = 1;
  private int ruleType_;
  /**
   * <pre>
   * Rule type is used to determine how to group rule items.
   * The default is OR of ANDs (disjunctive normal form).
   * That is, rule items will be ANDed together within rule item groups and the
   * groups themselves will be ORed together.
   * Currently AND of ORs (conjunctive normal form) is only supported for
   * ExpressionRuleUserList.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType rule_type = 1;</code>
   */
  public int getRuleTypeValue() {
    return ruleType_;
  }
  /**
   * <pre>
   * Rule type is used to determine how to group rule items.
   * The default is OR of ANDs (disjunctive normal form).
   * That is, rule items will be ANDed together within rule item groups and the
   * groups themselves will be ORed together.
   * Currently AND of ORs (conjunctive normal form) is only supported for
   * ExpressionRuleUserList.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType rule_type = 1;</code>
   */
  public com.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType getRuleType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType result = com.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType.valueOf(ruleType_);
    return result == null ? com.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType.UNRECOGNIZED : result;
  }

  public static final int RULE_ITEM_GROUPS_FIELD_NUMBER = 2;
  private java.util.List<com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo> ruleItemGroups_;
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
   */
  public java.util.List<com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo> getRuleItemGroupsList() {
    return ruleItemGroups_;
  }
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
   */
  public java.util.List<? extends com.google.ads.googleads.v1.common.UserListRuleItemGroupInfoOrBuilder> 
      getRuleItemGroupsOrBuilderList() {
    return ruleItemGroups_;
  }
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
   */
  public int getRuleItemGroupsCount() {
    return ruleItemGroups_.size();
  }
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
   */
  public com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo getRuleItemGroups(int index) {
    return ruleItemGroups_.get(index);
  }
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
   */
  public com.google.ads.googleads.v1.common.UserListRuleItemGroupInfoOrBuilder getRuleItemGroupsOrBuilder(
      int index) {
    return ruleItemGroups_.get(index);
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
    if (ruleType_ != com.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, ruleType_);
    }
    for (int i = 0; i < ruleItemGroups_.size(); i++) {
      output.writeMessage(2, ruleItemGroups_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ruleType_ != com.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ruleType_);
    }
    for (int i = 0; i < ruleItemGroups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, ruleItemGroups_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.UserListRuleInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.UserListRuleInfo other = (com.google.ads.googleads.v1.common.UserListRuleInfo) obj;

    if (ruleType_ != other.ruleType_) return false;
    if (!getRuleItemGroupsList()
        .equals(other.getRuleItemGroupsList())) return false;
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
    hash = (37 * hash) + RULE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + ruleType_;
    if (getRuleItemGroupsCount() > 0) {
      hash = (37 * hash) + RULE_ITEM_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getRuleItemGroupsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.UserListRuleInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.UserListRuleInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.UserListRuleInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.UserListRuleInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.UserListRuleInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.UserListRuleInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.UserListRuleInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.UserListRuleInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.UserListRuleInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.UserListRuleInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.UserListRuleInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.UserListRuleInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.UserListRuleInfo prototype) {
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
   * A client defined rule based on custom parameters sent by web sites or
   * uploaded by the advertiser.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.UserListRuleInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.UserListRuleInfo)
      com.google.ads.googleads.v1.common.UserListRuleInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_UserListRuleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_UserListRuleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.UserListRuleInfo.class, com.google.ads.googleads.v1.common.UserListRuleInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.UserListRuleInfo.newBuilder()
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
        getRuleItemGroupsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ruleType_ = 0;

      if (ruleItemGroupsBuilder_ == null) {
        ruleItemGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        ruleItemGroupsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_UserListRuleInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.UserListRuleInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.UserListRuleInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.UserListRuleInfo build() {
      com.google.ads.googleads.v1.common.UserListRuleInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.UserListRuleInfo buildPartial() {
      com.google.ads.googleads.v1.common.UserListRuleInfo result = new com.google.ads.googleads.v1.common.UserListRuleInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.ruleType_ = ruleType_;
      if (ruleItemGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          ruleItemGroups_ = java.util.Collections.unmodifiableList(ruleItemGroups_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.ruleItemGroups_ = ruleItemGroups_;
      } else {
        result.ruleItemGroups_ = ruleItemGroupsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v1.common.UserListRuleInfo) {
        return mergeFrom((com.google.ads.googleads.v1.common.UserListRuleInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.UserListRuleInfo other) {
      if (other == com.google.ads.googleads.v1.common.UserListRuleInfo.getDefaultInstance()) return this;
      if (other.ruleType_ != 0) {
        setRuleTypeValue(other.getRuleTypeValue());
      }
      if (ruleItemGroupsBuilder_ == null) {
        if (!other.ruleItemGroups_.isEmpty()) {
          if (ruleItemGroups_.isEmpty()) {
            ruleItemGroups_ = other.ruleItemGroups_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRuleItemGroupsIsMutable();
            ruleItemGroups_.addAll(other.ruleItemGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.ruleItemGroups_.isEmpty()) {
          if (ruleItemGroupsBuilder_.isEmpty()) {
            ruleItemGroupsBuilder_.dispose();
            ruleItemGroupsBuilder_ = null;
            ruleItemGroups_ = other.ruleItemGroups_;
            bitField0_ = (bitField0_ & ~0x00000002);
            ruleItemGroupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRuleItemGroupsFieldBuilder() : null;
          } else {
            ruleItemGroupsBuilder_.addAllMessages(other.ruleItemGroups_);
          }
        }
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
      com.google.ads.googleads.v1.common.UserListRuleInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.UserListRuleInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int ruleType_ = 0;
    /**
     * <pre>
     * Rule type is used to determine how to group rule items.
     * The default is OR of ANDs (disjunctive normal form).
     * That is, rule items will be ANDed together within rule item groups and the
     * groups themselves will be ORed together.
     * Currently AND of ORs (conjunctive normal form) is only supported for
     * ExpressionRuleUserList.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType rule_type = 1;</code>
     */
    public int getRuleTypeValue() {
      return ruleType_;
    }
    /**
     * <pre>
     * Rule type is used to determine how to group rule items.
     * The default is OR of ANDs (disjunctive normal form).
     * That is, rule items will be ANDed together within rule item groups and the
     * groups themselves will be ORed together.
     * Currently AND of ORs (conjunctive normal form) is only supported for
     * ExpressionRuleUserList.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType rule_type = 1;</code>
     */
    public Builder setRuleTypeValue(int value) {
      ruleType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Rule type is used to determine how to group rule items.
     * The default is OR of ANDs (disjunctive normal form).
     * That is, rule items will be ANDed together within rule item groups and the
     * groups themselves will be ORed together.
     * Currently AND of ORs (conjunctive normal form) is only supported for
     * ExpressionRuleUserList.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType rule_type = 1;</code>
     */
    public com.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType getRuleType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType result = com.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType.valueOf(ruleType_);
      return result == null ? com.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Rule type is used to determine how to group rule items.
     * The default is OR of ANDs (disjunctive normal form).
     * That is, rule items will be ANDed together within rule item groups and the
     * groups themselves will be ORed together.
     * Currently AND of ORs (conjunctive normal form) is only supported for
     * ExpressionRuleUserList.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType rule_type = 1;</code>
     */
    public Builder setRuleType(com.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ruleType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Rule type is used to determine how to group rule items.
     * The default is OR of ANDs (disjunctive normal form).
     * That is, rule items will be ANDed together within rule item groups and the
     * groups themselves will be ORed together.
     * Currently AND of ORs (conjunctive normal form) is only supported for
     * ExpressionRuleUserList.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListRuleTypeEnum.UserListRuleType rule_type = 1;</code>
     */
    public Builder clearRuleType() {
      
      ruleType_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo> ruleItemGroups_ =
      java.util.Collections.emptyList();
    private void ensureRuleItemGroupsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        ruleItemGroups_ = new java.util.ArrayList<com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo>(ruleItemGroups_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo, com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.Builder, com.google.ads.googleads.v1.common.UserListRuleItemGroupInfoOrBuilder> ruleItemGroupsBuilder_;

    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo> getRuleItemGroupsList() {
      if (ruleItemGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ruleItemGroups_);
      } else {
        return ruleItemGroupsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public int getRuleItemGroupsCount() {
      if (ruleItemGroupsBuilder_ == null) {
        return ruleItemGroups_.size();
      } else {
        return ruleItemGroupsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo getRuleItemGroups(int index) {
      if (ruleItemGroupsBuilder_ == null) {
        return ruleItemGroups_.get(index);
      } else {
        return ruleItemGroupsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public Builder setRuleItemGroups(
        int index, com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo value) {
      if (ruleItemGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleItemGroupsIsMutable();
        ruleItemGroups_.set(index, value);
        onChanged();
      } else {
        ruleItemGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public Builder setRuleItemGroups(
        int index, com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.Builder builderForValue) {
      if (ruleItemGroupsBuilder_ == null) {
        ensureRuleItemGroupsIsMutable();
        ruleItemGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        ruleItemGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public Builder addRuleItemGroups(com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo value) {
      if (ruleItemGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleItemGroupsIsMutable();
        ruleItemGroups_.add(value);
        onChanged();
      } else {
        ruleItemGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public Builder addRuleItemGroups(
        int index, com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo value) {
      if (ruleItemGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleItemGroupsIsMutable();
        ruleItemGroups_.add(index, value);
        onChanged();
      } else {
        ruleItemGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public Builder addRuleItemGroups(
        com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.Builder builderForValue) {
      if (ruleItemGroupsBuilder_ == null) {
        ensureRuleItemGroupsIsMutable();
        ruleItemGroups_.add(builderForValue.build());
        onChanged();
      } else {
        ruleItemGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public Builder addRuleItemGroups(
        int index, com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.Builder builderForValue) {
      if (ruleItemGroupsBuilder_ == null) {
        ensureRuleItemGroupsIsMutable();
        ruleItemGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        ruleItemGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public Builder addAllRuleItemGroups(
        java.lang.Iterable<? extends com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo> values) {
      if (ruleItemGroupsBuilder_ == null) {
        ensureRuleItemGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ruleItemGroups_);
        onChanged();
      } else {
        ruleItemGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public Builder clearRuleItemGroups() {
      if (ruleItemGroupsBuilder_ == null) {
        ruleItemGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        ruleItemGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public Builder removeRuleItemGroups(int index) {
      if (ruleItemGroupsBuilder_ == null) {
        ensureRuleItemGroupsIsMutable();
        ruleItemGroups_.remove(index);
        onChanged();
      } else {
        ruleItemGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.Builder getRuleItemGroupsBuilder(
        int index) {
      return getRuleItemGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public com.google.ads.googleads.v1.common.UserListRuleItemGroupInfoOrBuilder getRuleItemGroupsOrBuilder(
        int index) {
      if (ruleItemGroupsBuilder_ == null) {
        return ruleItemGroups_.get(index);  } else {
        return ruleItemGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v1.common.UserListRuleItemGroupInfoOrBuilder> 
         getRuleItemGroupsOrBuilderList() {
      if (ruleItemGroupsBuilder_ != null) {
        return ruleItemGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ruleItemGroups_);
      }
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.Builder addRuleItemGroupsBuilder() {
      return getRuleItemGroupsFieldBuilder().addBuilder(
          com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.Builder addRuleItemGroupsBuilder(
        int index) {
      return getRuleItemGroupsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.Builder> 
         getRuleItemGroupsBuilderList() {
      return getRuleItemGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo, com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.Builder, com.google.ads.googleads.v1.common.UserListRuleItemGroupInfoOrBuilder> 
        getRuleItemGroupsFieldBuilder() {
      if (ruleItemGroupsBuilder_ == null) {
        ruleItemGroupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo, com.google.ads.googleads.v1.common.UserListRuleItemGroupInfo.Builder, com.google.ads.googleads.v1.common.UserListRuleItemGroupInfoOrBuilder>(
                ruleItemGroups_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        ruleItemGroups_ = null;
      }
      return ruleItemGroupsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.UserListRuleInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.UserListRuleInfo)
  private static final com.google.ads.googleads.v1.common.UserListRuleInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.UserListRuleInfo();
  }

  public static com.google.ads.googleads.v1.common.UserListRuleInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListRuleInfo>
      PARSER = new com.google.protobuf.AbstractParser<UserListRuleInfo>() {
    @java.lang.Override
    public UserListRuleInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserListRuleInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserListRuleInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserListRuleInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.UserListRuleInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

