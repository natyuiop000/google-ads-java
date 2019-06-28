// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/shared_criterion_service.proto

package com.google.ads.googleads.v2.services;

/**
 * <pre>
 * A single operation (create, remove) on an shared criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.services.SharedCriterionOperation}
 */
public  final class SharedCriterionOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.services.SharedCriterionOperation)
    SharedCriterionOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SharedCriterionOperation.newBuilder() to construct.
  private SharedCriterionOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SharedCriterionOperation() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SharedCriterionOperation(
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
            com.google.ads.googleads.v2.resources.SharedCriterion.Builder subBuilder = null;
            if (operationCase_ == 1) {
              subBuilder = ((com.google.ads.googleads.v2.resources.SharedCriterion) operation_).toBuilder();
            }
            operation_ =
                input.readMessage(com.google.ads.googleads.v2.resources.SharedCriterion.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.ads.googleads.v2.resources.SharedCriterion) operation_);
              operation_ = subBuilder.buildPartial();
            }
            operationCase_ = 1;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            operationCase_ = 3;
            operation_ = s;
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
    return com.google.ads.googleads.v2.services.SharedCriterionServiceProto.internal_static_google_ads_googleads_v2_services_SharedCriterionOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.services.SharedCriterionServiceProto.internal_static_google_ads_googleads_v2_services_SharedCriterionOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.services.SharedCriterionOperation.class, com.google.ads.googleads.v2.services.SharedCriterionOperation.Builder.class);
  }

  private int operationCase_ = 0;
  private java.lang.Object operation_;
  public enum OperationCase
      implements com.google.protobuf.Internal.EnumLite {
    CREATE(1),
    REMOVE(3),
    OPERATION_NOT_SET(0);
    private final int value;
    private OperationCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OperationCase valueOf(int value) {
      return forNumber(value);
    }

    public static OperationCase forNumber(int value) {
      switch (value) {
        case 1: return CREATE;
        case 3: return REMOVE;
        case 0: return OPERATION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OperationCase
  getOperationCase() {
    return OperationCase.forNumber(
        operationCase_);
  }

  public static final int CREATE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Create operation: No resource name is expected for the new shared
   * criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.SharedCriterion create = 1;</code>
   */
  public boolean hasCreate() {
    return operationCase_ == 1;
  }
  /**
   * <pre>
   * Create operation: No resource name is expected for the new shared
   * criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.SharedCriterion create = 1;</code>
   */
  public com.google.ads.googleads.v2.resources.SharedCriterion getCreate() {
    if (operationCase_ == 1) {
       return (com.google.ads.googleads.v2.resources.SharedCriterion) operation_;
    }
    return com.google.ads.googleads.v2.resources.SharedCriterion.getDefaultInstance();
  }
  /**
   * <pre>
   * Create operation: No resource name is expected for the new shared
   * criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.SharedCriterion create = 1;</code>
   */
  public com.google.ads.googleads.v2.resources.SharedCriterionOrBuilder getCreateOrBuilder() {
    if (operationCase_ == 1) {
       return (com.google.ads.googleads.v2.resources.SharedCriterion) operation_;
    }
    return com.google.ads.googleads.v2.resources.SharedCriterion.getDefaultInstance();
  }

  public static final int REMOVE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Remove operation: A resource name for the removed shared criterion is
   * expected, in this format:
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  public java.lang.String getRemove() {
    java.lang.Object ref = "";
    if (operationCase_ == 3) {
      ref = operation_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (operationCase_ == 3) {
        operation_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Remove operation: A resource name for the removed shared criterion is
   * expected, in this format:
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRemoveBytes() {
    java.lang.Object ref = "";
    if (operationCase_ == 3) {
      ref = operation_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (operationCase_ == 3) {
        operation_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (operationCase_ == 1) {
      output.writeMessage(1, (com.google.ads.googleads.v2.resources.SharedCriterion) operation_);
    }
    if (operationCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, operation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operationCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.ads.googleads.v2.resources.SharedCriterion) operation_);
    }
    if (operationCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, operation_);
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
    if (!(obj instanceof com.google.ads.googleads.v2.services.SharedCriterionOperation)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.services.SharedCriterionOperation other = (com.google.ads.googleads.v2.services.SharedCriterionOperation) obj;

    if (!getOperationCase().equals(other.getOperationCase())) return false;
    switch (operationCase_) {
      case 1:
        if (!getCreate()
            .equals(other.getCreate())) return false;
        break;
      case 3:
        if (!getRemove()
            .equals(other.getRemove())) return false;
        break;
      case 0:
      default:
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
    switch (operationCase_) {
      case 1:
        hash = (37 * hash) + CREATE_FIELD_NUMBER;
        hash = (53 * hash) + getCreate().hashCode();
        break;
      case 3:
        hash = (37 * hash) + REMOVE_FIELD_NUMBER;
        hash = (53 * hash) + getRemove().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.services.SharedCriterionOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.SharedCriterionOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.SharedCriterionOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.SharedCriterionOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.SharedCriterionOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.SharedCriterionOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.SharedCriterionOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.SharedCriterionOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.SharedCriterionOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.SharedCriterionOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.SharedCriterionOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.SharedCriterionOperation parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.services.SharedCriterionOperation prototype) {
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
   * A single operation (create, remove) on an shared criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.services.SharedCriterionOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.services.SharedCriterionOperation)
      com.google.ads.googleads.v2.services.SharedCriterionOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.services.SharedCriterionServiceProto.internal_static_google_ads_googleads_v2_services_SharedCriterionOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.services.SharedCriterionServiceProto.internal_static_google_ads_googleads_v2_services_SharedCriterionOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.services.SharedCriterionOperation.class, com.google.ads.googleads.v2.services.SharedCriterionOperation.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.services.SharedCriterionOperation.newBuilder()
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
      operationCase_ = 0;
      operation_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.services.SharedCriterionServiceProto.internal_static_google_ads_googleads_v2_services_SharedCriterionOperation_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.SharedCriterionOperation getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.services.SharedCriterionOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.SharedCriterionOperation build() {
      com.google.ads.googleads.v2.services.SharedCriterionOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.SharedCriterionOperation buildPartial() {
      com.google.ads.googleads.v2.services.SharedCriterionOperation result = new com.google.ads.googleads.v2.services.SharedCriterionOperation(this);
      if (operationCase_ == 1) {
        if (createBuilder_ == null) {
          result.operation_ = operation_;
        } else {
          result.operation_ = createBuilder_.build();
        }
      }
      if (operationCase_ == 3) {
        result.operation_ = operation_;
      }
      result.operationCase_ = operationCase_;
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
      if (other instanceof com.google.ads.googleads.v2.services.SharedCriterionOperation) {
        return mergeFrom((com.google.ads.googleads.v2.services.SharedCriterionOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.services.SharedCriterionOperation other) {
      if (other == com.google.ads.googleads.v2.services.SharedCriterionOperation.getDefaultInstance()) return this;
      switch (other.getOperationCase()) {
        case CREATE: {
          mergeCreate(other.getCreate());
          break;
        }
        case REMOVE: {
          operationCase_ = 3;
          operation_ = other.operation_;
          onChanged();
          break;
        }
        case OPERATION_NOT_SET: {
          break;
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
      com.google.ads.googleads.v2.services.SharedCriterionOperation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.services.SharedCriterionOperation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int operationCase_ = 0;
    private java.lang.Object operation_;
    public OperationCase
        getOperationCase() {
      return OperationCase.forNumber(
          operationCase_);
    }

    public Builder clearOperation() {
      operationCase_ = 0;
      operation_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v2.resources.SharedCriterion, com.google.ads.googleads.v2.resources.SharedCriterion.Builder, com.google.ads.googleads.v2.resources.SharedCriterionOrBuilder> createBuilder_;
    /**
     * <pre>
     * Create operation: No resource name is expected for the new shared
     * criterion.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.resources.SharedCriterion create = 1;</code>
     */
    public boolean hasCreate() {
      return operationCase_ == 1;
    }
    /**
     * <pre>
     * Create operation: No resource name is expected for the new shared
     * criterion.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.resources.SharedCriterion create = 1;</code>
     */
    public com.google.ads.googleads.v2.resources.SharedCriterion getCreate() {
      if (createBuilder_ == null) {
        if (operationCase_ == 1) {
          return (com.google.ads.googleads.v2.resources.SharedCriterion) operation_;
        }
        return com.google.ads.googleads.v2.resources.SharedCriterion.getDefaultInstance();
      } else {
        if (operationCase_ == 1) {
          return createBuilder_.getMessage();
        }
        return com.google.ads.googleads.v2.resources.SharedCriterion.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Create operation: No resource name is expected for the new shared
     * criterion.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.resources.SharedCriterion create = 1;</code>
     */
    public Builder setCreate(com.google.ads.googleads.v2.resources.SharedCriterion value) {
      if (createBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operation_ = value;
        onChanged();
      } else {
        createBuilder_.setMessage(value);
      }
      operationCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Create operation: No resource name is expected for the new shared
     * criterion.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.resources.SharedCriterion create = 1;</code>
     */
    public Builder setCreate(
        com.google.ads.googleads.v2.resources.SharedCriterion.Builder builderForValue) {
      if (createBuilder_ == null) {
        operation_ = builderForValue.build();
        onChanged();
      } else {
        createBuilder_.setMessage(builderForValue.build());
      }
      operationCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Create operation: No resource name is expected for the new shared
     * criterion.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.resources.SharedCriterion create = 1;</code>
     */
    public Builder mergeCreate(com.google.ads.googleads.v2.resources.SharedCriterion value) {
      if (createBuilder_ == null) {
        if (operationCase_ == 1 &&
            operation_ != com.google.ads.googleads.v2.resources.SharedCriterion.getDefaultInstance()) {
          operation_ = com.google.ads.googleads.v2.resources.SharedCriterion.newBuilder((com.google.ads.googleads.v2.resources.SharedCriterion) operation_)
              .mergeFrom(value).buildPartial();
        } else {
          operation_ = value;
        }
        onChanged();
      } else {
        if (operationCase_ == 1) {
          createBuilder_.mergeFrom(value);
        }
        createBuilder_.setMessage(value);
      }
      operationCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Create operation: No resource name is expected for the new shared
     * criterion.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.resources.SharedCriterion create = 1;</code>
     */
    public Builder clearCreate() {
      if (createBuilder_ == null) {
        if (operationCase_ == 1) {
          operationCase_ = 0;
          operation_ = null;
          onChanged();
        }
      } else {
        if (operationCase_ == 1) {
          operationCase_ = 0;
          operation_ = null;
        }
        createBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Create operation: No resource name is expected for the new shared
     * criterion.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.resources.SharedCriterion create = 1;</code>
     */
    public com.google.ads.googleads.v2.resources.SharedCriterion.Builder getCreateBuilder() {
      return getCreateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Create operation: No resource name is expected for the new shared
     * criterion.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.resources.SharedCriterion create = 1;</code>
     */
    public com.google.ads.googleads.v2.resources.SharedCriterionOrBuilder getCreateOrBuilder() {
      if ((operationCase_ == 1) && (createBuilder_ != null)) {
        return createBuilder_.getMessageOrBuilder();
      } else {
        if (operationCase_ == 1) {
          return (com.google.ads.googleads.v2.resources.SharedCriterion) operation_;
        }
        return com.google.ads.googleads.v2.resources.SharedCriterion.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Create operation: No resource name is expected for the new shared
     * criterion.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.resources.SharedCriterion create = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v2.resources.SharedCriterion, com.google.ads.googleads.v2.resources.SharedCriterion.Builder, com.google.ads.googleads.v2.resources.SharedCriterionOrBuilder> 
        getCreateFieldBuilder() {
      if (createBuilder_ == null) {
        if (!(operationCase_ == 1)) {
          operation_ = com.google.ads.googleads.v2.resources.SharedCriterion.getDefaultInstance();
        }
        createBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v2.resources.SharedCriterion, com.google.ads.googleads.v2.resources.SharedCriterion.Builder, com.google.ads.googleads.v2.resources.SharedCriterionOrBuilder>(
                (com.google.ads.googleads.v2.resources.SharedCriterion) operation_,
                getParentForChildren(),
                isClean());
        operation_ = null;
      }
      operationCase_ = 1;
      onChanged();;
      return createBuilder_;
    }

    /**
     * <pre>
     * Remove operation: A resource name for the removed shared criterion is
     * expected, in this format:
     * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
     * </pre>
     *
     * <code>string remove = 3;</code>
     */
    public java.lang.String getRemove() {
      java.lang.Object ref = "";
      if (operationCase_ == 3) {
        ref = operation_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (operationCase_ == 3) {
          operation_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Remove operation: A resource name for the removed shared criterion is
     * expected, in this format:
     * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
     * </pre>
     *
     * <code>string remove = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRemoveBytes() {
      java.lang.Object ref = "";
      if (operationCase_ == 3) {
        ref = operation_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (operationCase_ == 3) {
          operation_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Remove operation: A resource name for the removed shared criterion is
     * expected, in this format:
     * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
     * </pre>
     *
     * <code>string remove = 3;</code>
     */
    public Builder setRemove(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  operationCase_ = 3;
      operation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Remove operation: A resource name for the removed shared criterion is
     * expected, in this format:
     * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
     * </pre>
     *
     * <code>string remove = 3;</code>
     */
    public Builder clearRemove() {
      if (operationCase_ == 3) {
        operationCase_ = 0;
        operation_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Remove operation: A resource name for the removed shared criterion is
     * expected, in this format:
     * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
     * </pre>
     *
     * <code>string remove = 3;</code>
     */
    public Builder setRemoveBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      operationCase_ = 3;
      operation_ = value;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.services.SharedCriterionOperation)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.SharedCriterionOperation)
  private static final com.google.ads.googleads.v2.services.SharedCriterionOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.services.SharedCriterionOperation();
  }

  public static com.google.ads.googleads.v2.services.SharedCriterionOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SharedCriterionOperation>
      PARSER = new com.google.protobuf.AbstractParser<SharedCriterionOperation>() {
    @java.lang.Override
    public SharedCriterionOperation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SharedCriterionOperation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SharedCriterionOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SharedCriterionOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.services.SharedCriterionOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

