// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/google_ads_service.proto

package com.google.ads.googleads.v2.services;

public interface SearchGoogleAdsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.SearchGoogleAdsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer being queried.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer being queried.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The query string.
   * </pre>
   *
   * <code>string query = 2;</code>
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * The query string.
   * </pre>
   *
   * <code>string query = 2;</code>
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * Token of the page to retrieve. If not specified, the first
   * page of results will be returned. Use the value obtained from
   * `next_page_token` in the previous response in order to request
   * the next page of results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Token of the page to retrieve. If not specified, the first
   * page of results will be returned. Use the value obtained from
   * `next_page_token` in the previous response in order to request
   * the next page of results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Number of elements to retrieve in a single page.
   * When too large a page is requested, the server may decide to
   * further limit the number of returned resources.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * If true, the request is validated but not executed.
   * </pre>
   *
   * <code>bool validate_only = 5;</code>
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * If true, summary row will be included in the response.
   * Otherwise(false or not specified) summary row will not be returned.
   * </pre>
   *
   * <code>bool return_summary_row = 6;</code>
   */
  boolean getReturnSummaryRow();
}
