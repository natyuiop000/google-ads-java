// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/domain_category.proto

package com.google.ads.googleads.v2.resources;

public interface DomainCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.DomainCategory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the domain category.
   * Domain category resource names have the form:
   * `customers/{customer_id}/domainCategories/{campaign_id}~{category_base64}~{language_code}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the domain category.
   * Domain category resource names have the form:
   * `customers/{customer_id}/domainCategories/{campaign_id}~{category_base64}~{language_code}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The campaign this category is recommended for.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 2;</code>
   */
  boolean hasCampaign();
  /**
   * <pre>
   * The campaign this category is recommended for.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 2;</code>
   */
  com.google.protobuf.StringValue getCampaign();
  /**
   * <pre>
   * The campaign this category is recommended for.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * Recommended category for the website domain. e.g. if you have a website
   * about electronics, the categories could be "cameras", "televisions", etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue category = 3;</code>
   */
  boolean hasCategory();
  /**
   * <pre>
   * Recommended category for the website domain. e.g. if you have a website
   * about electronics, the categories could be "cameras", "televisions", etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue category = 3;</code>
   */
  com.google.protobuf.StringValue getCategory();
  /**
   * <pre>
   * Recommended category for the website domain. e.g. if you have a website
   * about electronics, the categories could be "cameras", "televisions", etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue category = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCategoryOrBuilder();

  /**
   * <pre>
   * The language code specifying the language of the website. e.g. "en" for
   * English. The language can be specified in the DynamicSearchAdsSetting
   * required for dynamic search ads. This is the language of the pages from
   * your website that you want Google Ads to find, create ads for,
   * and match searches with.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 4;</code>
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * The language code specifying the language of the website. e.g. "en" for
   * English. The language can be specified in the DynamicSearchAdsSetting
   * required for dynamic search ads. This is the language of the pages from
   * your website that you want Google Ads to find, create ads for,
   * and match searches with.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 4;</code>
   */
  com.google.protobuf.StringValue getLanguageCode();
  /**
   * <pre>
   * The language code specifying the language of the website. e.g. "en" for
   * English. The language can be specified in the DynamicSearchAdsSetting
   * required for dynamic search ads. This is the language of the pages from
   * your website that you want Google Ads to find, create ads for,
   * and match searches with.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLanguageCodeOrBuilder();

  /**
   * <pre>
   * The domain for the website. The domain can be specified in the
   * DynamicSearchAdsSetting required for dynamic search ads.
   * </pre>
   *
   * <code>.google.protobuf.StringValue domain = 5;</code>
   */
  boolean hasDomain();
  /**
   * <pre>
   * The domain for the website. The domain can be specified in the
   * DynamicSearchAdsSetting required for dynamic search ads.
   * </pre>
   *
   * <code>.google.protobuf.StringValue domain = 5;</code>
   */
  com.google.protobuf.StringValue getDomain();
  /**
   * <pre>
   * The domain for the website. The domain can be specified in the
   * DynamicSearchAdsSetting required for dynamic search ads.
   * </pre>
   *
   * <code>.google.protobuf.StringValue domain = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDomainOrBuilder();

  /**
   * <pre>
   * Fraction of pages on your site that this category matches.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue coverage_fraction = 6;</code>
   */
  boolean hasCoverageFraction();
  /**
   * <pre>
   * Fraction of pages on your site that this category matches.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue coverage_fraction = 6;</code>
   */
  com.google.protobuf.DoubleValue getCoverageFraction();
  /**
   * <pre>
   * Fraction of pages on your site that this category matches.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue coverage_fraction = 6;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getCoverageFractionOrBuilder();

  /**
   * <pre>
   * The position of this category in the set of categories. Lower numbers
   * indicate a better match for the domain. null indicates not recommended.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value category_rank = 7;</code>
   */
  boolean hasCategoryRank();
  /**
   * <pre>
   * The position of this category in the set of categories. Lower numbers
   * indicate a better match for the domain. null indicates not recommended.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value category_rank = 7;</code>
   */
  com.google.protobuf.Int64Value getCategoryRank();
  /**
   * <pre>
   * The position of this category in the set of categories. Lower numbers
   * indicate a better match for the domain. null indicates not recommended.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value category_rank = 7;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCategoryRankOrBuilder();

  /**
   * <pre>
   * Indicates whether this category has sub-categories.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_children = 8;</code>
   */
  boolean hasHasChildren();
  /**
   * <pre>
   * Indicates whether this category has sub-categories.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_children = 8;</code>
   */
  com.google.protobuf.BoolValue getHasChildren();
  /**
   * <pre>
   * Indicates whether this category has sub-categories.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_children = 8;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasChildrenOrBuilder();

  /**
   * <pre>
   * The recommended cost per click for the category.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_cpc_bid_micros = 9;</code>
   */
  boolean hasRecommendedCpcBidMicros();
  /**
   * <pre>
   * The recommended cost per click for the category.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_cpc_bid_micros = 9;</code>
   */
  com.google.protobuf.Int64Value getRecommendedCpcBidMicros();
  /**
   * <pre>
   * The recommended cost per click for the category.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_cpc_bid_micros = 9;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRecommendedCpcBidMicrosOrBuilder();
}
