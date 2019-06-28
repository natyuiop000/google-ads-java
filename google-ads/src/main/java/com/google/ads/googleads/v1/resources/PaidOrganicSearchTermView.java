// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/paid_organic_search_term_view.proto

package com.google.ads.googleads.v1.resources;

/**
 * <pre>
 * A paid organic search term view providing a view of search stats across
 * ads and organic listings aggregated by search term at the ad group level.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.resources.PaidOrganicSearchTermView}
 */
public  final class PaidOrganicSearchTermView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.resources.PaidOrganicSearchTermView)
    PaidOrganicSearchTermViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaidOrganicSearchTermView.newBuilder() to construct.
  private PaidOrganicSearchTermView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaidOrganicSearchTermView() {
    resourceName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PaidOrganicSearchTermView(
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
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (searchTerm_ != null) {
              subBuilder = searchTerm_.toBuilder();
            }
            searchTerm_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(searchTerm_);
              searchTerm_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v1.resources.PaidOrganicSearchTermViewProto.internal_static_google_ads_googleads_v1_resources_PaidOrganicSearchTermView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.resources.PaidOrganicSearchTermViewProto.internal_static_google_ads_googleads_v1_resources_PaidOrganicSearchTermView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView.class, com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * The resource name of the search term view.
   * Search term view resource names have the form:
   * `customers/{customer_id}/paidOrganicSearchTermViews/{campaign_id}~
   * {ad_group_id}~{URL-base64 search term}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the search term view.
   * Search term view resource names have the form:
   * `customers/{customer_id}/paidOrganicSearchTermViews/{campaign_id}~
   * {ad_group_id}~{URL-base64 search term}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEARCH_TERM_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue searchTerm_;
  /**
   * <pre>
   * The search term.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2;</code>
   */
  public boolean hasSearchTerm() {
    return searchTerm_ != null;
  }
  /**
   * <pre>
   * The search term.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2;</code>
   */
  public com.google.protobuf.StringValue getSearchTerm() {
    return searchTerm_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : searchTerm_;
  }
  /**
   * <pre>
   * The search term.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getSearchTermOrBuilder() {
    return getSearchTerm();
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
    if (!getResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (searchTerm_ != null) {
      output.writeMessage(2, getSearchTerm());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (searchTerm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSearchTerm());
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
    if (!(obj instanceof com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView other = (com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasSearchTerm() != other.hasSearchTerm()) return false;
    if (hasSearchTerm()) {
      if (!getSearchTerm()
          .equals(other.getSearchTerm())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasSearchTerm()) {
      hash = (37 * hash) + SEARCH_TERM_FIELD_NUMBER;
      hash = (53 * hash) + getSearchTerm().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView prototype) {
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
   * A paid organic search term view providing a view of search stats across
   * ads and organic listings aggregated by search term at the ad group level.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.resources.PaidOrganicSearchTermView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.resources.PaidOrganicSearchTermView)
      com.google.ads.googleads.v1.resources.PaidOrganicSearchTermViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.resources.PaidOrganicSearchTermViewProto.internal_static_google_ads_googleads_v1_resources_PaidOrganicSearchTermView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.resources.PaidOrganicSearchTermViewProto.internal_static_google_ads_googleads_v1_resources_PaidOrganicSearchTermView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView.class, com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView.newBuilder()
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
      resourceName_ = "";

      if (searchTermBuilder_ == null) {
        searchTerm_ = null;
      } else {
        searchTerm_ = null;
        searchTermBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.resources.PaidOrganicSearchTermViewProto.internal_static_google_ads_googleads_v1_resources_PaidOrganicSearchTermView_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView build() {
      com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView buildPartial() {
      com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView result = new com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView(this);
      result.resourceName_ = resourceName_;
      if (searchTermBuilder_ == null) {
        result.searchTerm_ = searchTerm_;
      } else {
        result.searchTerm_ = searchTermBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView) {
        return mergeFrom((com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView other) {
      if (other == com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasSearchTerm()) {
        mergeSearchTerm(other.getSearchTerm());
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
      com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * The resource name of the search term view.
     * Search term view resource names have the form:
     * `customers/{customer_id}/paidOrganicSearchTermViews/{campaign_id}~
     * {ad_group_id}~{URL-base64 search term}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the search term view.
     * Search term view resource names have the form:
     * `customers/{customer_id}/paidOrganicSearchTermViews/{campaign_id}~
     * {ad_group_id}~{URL-base64 search term}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the search term view.
     * Search term view resource names have the form:
     * `customers/{customer_id}/paidOrganicSearchTermViews/{campaign_id}~
     * {ad_group_id}~{URL-base64 search term}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the search term view.
     * Search term view resource names have the form:
     * `customers/{customer_id}/paidOrganicSearchTermViews/{campaign_id}~
     * {ad_group_id}~{URL-base64 search term}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the search term view.
     * Search term view resource names have the form:
     * `customers/{customer_id}/paidOrganicSearchTermViews/{campaign_id}~
     * {ad_group_id}~{URL-base64 search term}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue searchTerm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> searchTermBuilder_;
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public boolean hasSearchTerm() {
      return searchTermBuilder_ != null || searchTerm_ != null;
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public com.google.protobuf.StringValue getSearchTerm() {
      if (searchTermBuilder_ == null) {
        return searchTerm_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : searchTerm_;
      } else {
        return searchTermBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public Builder setSearchTerm(com.google.protobuf.StringValue value) {
      if (searchTermBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        searchTerm_ = value;
        onChanged();
      } else {
        searchTermBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public Builder setSearchTerm(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (searchTermBuilder_ == null) {
        searchTerm_ = builderForValue.build();
        onChanged();
      } else {
        searchTermBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public Builder mergeSearchTerm(com.google.protobuf.StringValue value) {
      if (searchTermBuilder_ == null) {
        if (searchTerm_ != null) {
          searchTerm_ =
            com.google.protobuf.StringValue.newBuilder(searchTerm_).mergeFrom(value).buildPartial();
        } else {
          searchTerm_ = value;
        }
        onChanged();
      } else {
        searchTermBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public Builder clearSearchTerm() {
      if (searchTermBuilder_ == null) {
        searchTerm_ = null;
        onChanged();
      } else {
        searchTerm_ = null;
        searchTermBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getSearchTermBuilder() {
      
      onChanged();
      return getSearchTermFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getSearchTermOrBuilder() {
      if (searchTermBuilder_ != null) {
        return searchTermBuilder_.getMessageOrBuilder();
      } else {
        return searchTerm_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : searchTerm_;
      }
    }
    /**
     * <pre>
     * The search term.
     * </pre>
     *
     * <code>.google.protobuf.StringValue search_term = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getSearchTermFieldBuilder() {
      if (searchTermBuilder_ == null) {
        searchTermBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getSearchTerm(),
                getParentForChildren(),
                isClean());
        searchTerm_ = null;
      }
      return searchTermBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.resources.PaidOrganicSearchTermView)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.resources.PaidOrganicSearchTermView)
  private static final com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView();
  }

  public static com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaidOrganicSearchTermView>
      PARSER = new com.google.protobuf.AbstractParser<PaidOrganicSearchTermView>() {
    @java.lang.Override
    public PaidOrganicSearchTermView parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PaidOrganicSearchTermView(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaidOrganicSearchTermView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaidOrganicSearchTermView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.resources.PaidOrganicSearchTermView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

