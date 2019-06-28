// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/custom_interest_service.proto

package com.google.ads.googleads.v2.services;

public interface MutateCustomInterestsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.MutateCustomInterestsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer whose custom interests are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer whose custom interests are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The list of operations to perform on individual custom interests.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.CustomInterestOperation operations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v2.services.CustomInterestOperation> 
      getOperationsList();
  /**
   * <pre>
   * The list of operations to perform on individual custom interests.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.CustomInterestOperation operations = 2;</code>
   */
  com.google.ads.googleads.v2.services.CustomInterestOperation getOperations(int index);
  /**
   * <pre>
   * The list of operations to perform on individual custom interests.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.CustomInterestOperation operations = 2;</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * The list of operations to perform on individual custom interests.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.CustomInterestOperation operations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.services.CustomInterestOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * The list of operations to perform on individual custom interests.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.CustomInterestOperation operations = 2;</code>
   */
  com.google.ads.googleads.v2.services.CustomInterestOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   */
  boolean getValidateOnly();
}
