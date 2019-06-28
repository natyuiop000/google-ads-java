// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/shared_criterion.proto

package com.google.ads.googleads.v2.resources;

public interface SharedCriterionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.SharedCriterion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the shared criterion.
   * Shared set resource names have the form:
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the shared criterion.
   * Shared set resource names have the form:
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The shared set to which the shared criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue shared_set = 2;</code>
   */
  boolean hasSharedSet();
  /**
   * <pre>
   * The shared set to which the shared criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue shared_set = 2;</code>
   */
  com.google.protobuf.StringValue getSharedSet();
  /**
   * <pre>
   * The shared set to which the shared criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue shared_set = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getSharedSetOrBuilder();

  /**
   * <pre>
   * The ID of the criterion.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 26;</code>
   */
  boolean hasCriterionId();
  /**
   * <pre>
   * The ID of the criterion.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 26;</code>
   */
  com.google.protobuf.Int64Value getCriterionId();
  /**
   * <pre>
   * The ID of the criterion.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 26;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCriterionIdOrBuilder();

  /**
   * <pre>
   * The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.CriterionTypeEnum.CriterionType type = 4;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.CriterionTypeEnum.CriterionType type = 4;</code>
   */
  com.google.ads.googleads.v2.enums.CriterionTypeEnum.CriterionType getType();

  /**
   * <pre>
   * Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.KeywordInfo keyword = 3;</code>
   */
  boolean hasKeyword();
  /**
   * <pre>
   * Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.KeywordInfo keyword = 3;</code>
   */
  com.google.ads.googleads.v2.common.KeywordInfo getKeyword();
  /**
   * <pre>
   * Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.KeywordInfo keyword = 3;</code>
   */
  com.google.ads.googleads.v2.common.KeywordInfoOrBuilder getKeywordOrBuilder();

  /**
   * <pre>
   * YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.YouTubeVideoInfo youtube_video = 5;</code>
   */
  boolean hasYoutubeVideo();
  /**
   * <pre>
   * YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.YouTubeVideoInfo youtube_video = 5;</code>
   */
  com.google.ads.googleads.v2.common.YouTubeVideoInfo getYoutubeVideo();
  /**
   * <pre>
   * YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.YouTubeVideoInfo youtube_video = 5;</code>
   */
  com.google.ads.googleads.v2.common.YouTubeVideoInfoOrBuilder getYoutubeVideoOrBuilder();

  /**
   * <pre>
   * YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.YouTubeChannelInfo youtube_channel = 6;</code>
   */
  boolean hasYoutubeChannel();
  /**
   * <pre>
   * YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.YouTubeChannelInfo youtube_channel = 6;</code>
   */
  com.google.ads.googleads.v2.common.YouTubeChannelInfo getYoutubeChannel();
  /**
   * <pre>
   * YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.YouTubeChannelInfo youtube_channel = 6;</code>
   */
  com.google.ads.googleads.v2.common.YouTubeChannelInfoOrBuilder getYoutubeChannelOrBuilder();

  /**
   * <pre>
   * Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.PlacementInfo placement = 7;</code>
   */
  boolean hasPlacement();
  /**
   * <pre>
   * Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.PlacementInfo placement = 7;</code>
   */
  com.google.ads.googleads.v2.common.PlacementInfo getPlacement();
  /**
   * <pre>
   * Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.PlacementInfo placement = 7;</code>
   */
  com.google.ads.googleads.v2.common.PlacementInfoOrBuilder getPlacementOrBuilder();

  /**
   * <pre>
   * Mobile App Category.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileAppCategoryInfo mobile_app_category = 8;</code>
   */
  boolean hasMobileAppCategory();
  /**
   * <pre>
   * Mobile App Category.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileAppCategoryInfo mobile_app_category = 8;</code>
   */
  com.google.ads.googleads.v2.common.MobileAppCategoryInfo getMobileAppCategory();
  /**
   * <pre>
   * Mobile App Category.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileAppCategoryInfo mobile_app_category = 8;</code>
   */
  com.google.ads.googleads.v2.common.MobileAppCategoryInfoOrBuilder getMobileAppCategoryOrBuilder();

  /**
   * <pre>
   * Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileApplicationInfo mobile_application = 9;</code>
   */
  boolean hasMobileApplication();
  /**
   * <pre>
   * Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileApplicationInfo mobile_application = 9;</code>
   */
  com.google.ads.googleads.v2.common.MobileApplicationInfo getMobileApplication();
  /**
   * <pre>
   * Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileApplicationInfo mobile_application = 9;</code>
   */
  com.google.ads.googleads.v2.common.MobileApplicationInfoOrBuilder getMobileApplicationOrBuilder();

  public com.google.ads.googleads.v2.resources.SharedCriterion.CriterionCase getCriterionCase();
}
