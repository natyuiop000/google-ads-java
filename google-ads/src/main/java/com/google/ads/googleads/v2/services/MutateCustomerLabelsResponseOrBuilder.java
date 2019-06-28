// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/customer_label_service.proto

package com.google.ads.googleads.v2.services;

public interface MutateCustomerLabelsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.MutateCustomerLabelsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (e.g. auth errors),
   * we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 3;</code>
   */
  boolean hasPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (e.g. auth errors),
   * we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 3;</code>
   */
  com.google.rpc.Status getPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (e.g. auth errors),
   * we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder();

  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.MutateCustomerLabelResult results = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v2.services.MutateCustomerLabelResult> 
      getResultsList();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.MutateCustomerLabelResult results = 2;</code>
   */
  com.google.ads.googleads.v2.services.MutateCustomerLabelResult getResults(int index);
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.MutateCustomerLabelResult results = 2;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.MutateCustomerLabelResult results = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.services.MutateCustomerLabelResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.services.MutateCustomerLabelResult results = 2;</code>
   */
  com.google.ads.googleads.v2.services.MutateCustomerLabelResultOrBuilder getResultsOrBuilder(
      int index);
}
