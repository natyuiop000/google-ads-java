// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/geographic_view.proto

package com.google.ads.googleads.v2.resources;

public interface GeographicViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.GeographicView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the geographic view.
   * Geographic view resource names have the form:
   * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the geographic view.
   * Geographic view resource names have the form:
   * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Type of the geo targeting of the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3;</code>
   */
  int getLocationTypeValue();
  /**
   * <pre>
   * Type of the geo targeting of the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3;</code>
   */
  com.google.ads.googleads.v2.enums.GeoTargetingTypeEnum.GeoTargetingType getLocationType();

  /**
   * <pre>
   * Criterion Id for the country.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
   */
  boolean hasCountryCriterionId();
  /**
   * <pre>
   * Criterion Id for the country.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
   */
  com.google.protobuf.Int64Value getCountryCriterionId();
  /**
   * <pre>
   * Criterion Id for the country.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value country_criterion_id = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCountryCriterionIdOrBuilder();
}