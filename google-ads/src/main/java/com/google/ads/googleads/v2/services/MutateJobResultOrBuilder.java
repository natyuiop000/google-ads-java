// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/mutate_job_service.proto

package com.google.ads.googleads.v2.services;

public interface MutateJobResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.MutateJobResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Index of the mutate operation.
   * </pre>
   *
   * <code>int64 operation_index = 1;</code>
   */
  long getOperationIndex();

  /**
   * <pre>
   * Response for the mutate.
   * May be empty if errors occurred.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.MutateOperationResponse mutate_operation_response = 2;</code>
   */
  boolean hasMutateOperationResponse();
  /**
   * <pre>
   * Response for the mutate.
   * May be empty if errors occurred.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.MutateOperationResponse mutate_operation_response = 2;</code>
   */
  com.google.ads.googleads.v2.services.MutateOperationResponse getMutateOperationResponse();
  /**
   * <pre>
   * Response for the mutate.
   * May be empty if errors occurred.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.MutateOperationResponse mutate_operation_response = 2;</code>
   */
  com.google.ads.googleads.v2.services.MutateOperationResponseOrBuilder getMutateOperationResponseOrBuilder();

  /**
   * <pre>
   * Details of the errors when processing the operation.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   */
  boolean hasStatus();
  /**
   * <pre>
   * Details of the errors when processing the operation.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   */
  com.google.rpc.Status getStatus();
  /**
   * <pre>
   * Details of the errors when processing the operation.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();
}
