// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/customer_service.proto

package com.google.ads.googleads.v2.services;

public interface CustomerOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.CustomerOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Mutate operation. Only updates are supported for customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Customer update = 1;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Mutate operation. Only updates are supported for customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Customer update = 1;</code>
   */
  com.google.ads.googleads.v2.resources.Customer getUpdate();
  /**
   * <pre>
   * Mutate operation. Only updates are supported for customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Customer update = 1;</code>
   */
  com.google.ads.googleads.v2.resources.CustomerOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
