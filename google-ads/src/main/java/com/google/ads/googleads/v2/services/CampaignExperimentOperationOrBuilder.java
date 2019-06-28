// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/campaign_experiment_service.proto

package com.google.ads.googleads.v2.services;

public interface CampaignExperimentOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.CampaignExperimentOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Update operation: The campaign experiment is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignExperiment update = 1;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The campaign experiment is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignExperiment update = 1;</code>
   */
  com.google.ads.googleads.v2.resources.CampaignExperiment getUpdate();
  /**
   * <pre>
   * Update operation: The campaign experiment is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignExperiment update = 1;</code>
   */
  com.google.ads.googleads.v2.resources.CampaignExperimentOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: The campaign experiment is expected to have a valid
   * resource name, in this format:
   * `customers/{customer_id}/campaignExperiments/{campaign_experiment_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: The campaign experiment is expected to have a valid
   * resource name, in this format:
   * `customers/{customer_id}/campaignExperiments/{campaign_experiment_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v2.services.CampaignExperimentOperation.OperationCase getOperationCase();
}
