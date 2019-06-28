// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/ad_type_infos.proto

package com.google.ads.googleads.v2.common;

public interface GmailTeaserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.GmailTeaser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Headline of the teaser.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 1;</code>
   */
  boolean hasHeadline();
  /**
   * <pre>
   * Headline of the teaser.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 1;</code>
   */
  com.google.protobuf.StringValue getHeadline();
  /**
   * <pre>
   * Headline of the teaser.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getHeadlineOrBuilder();

  /**
   * <pre>
   * Description of the teaser.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  boolean hasDescription();
  /**
   * <pre>
   * Description of the teaser.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  com.google.protobuf.StringValue getDescription();
  /**
   * <pre>
   * Description of the teaser.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Business name of the advertiser.
   * </pre>
   *
   * <code>.google.protobuf.StringValue business_name = 3;</code>
   */
  boolean hasBusinessName();
  /**
   * <pre>
   * Business name of the advertiser.
   * </pre>
   *
   * <code>.google.protobuf.StringValue business_name = 3;</code>
   */
  com.google.protobuf.StringValue getBusinessName();
  /**
   * <pre>
   * Business name of the advertiser.
   * </pre>
   *
   * <code>.google.protobuf.StringValue business_name = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getBusinessNameOrBuilder();

  /**
   * <pre>
   * The MediaFile resource name of the logo image. Valid image types are GIF,
   * JPEG and PNG. The minimum size is 144x144 pixels and the aspect ratio must
   * be 1:1 (+-1%).
   * </pre>
   *
   * <code>.google.protobuf.StringValue logo_image = 4;</code>
   */
  boolean hasLogoImage();
  /**
   * <pre>
   * The MediaFile resource name of the logo image. Valid image types are GIF,
   * JPEG and PNG. The minimum size is 144x144 pixels and the aspect ratio must
   * be 1:1 (+-1%).
   * </pre>
   *
   * <code>.google.protobuf.StringValue logo_image = 4;</code>
   */
  com.google.protobuf.StringValue getLogoImage();
  /**
   * <pre>
   * The MediaFile resource name of the logo image. Valid image types are GIF,
   * JPEG and PNG. The minimum size is 144x144 pixels and the aspect ratio must
   * be 1:1 (+-1%).
   * </pre>
   *
   * <code>.google.protobuf.StringValue logo_image = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLogoImageOrBuilder();
}
