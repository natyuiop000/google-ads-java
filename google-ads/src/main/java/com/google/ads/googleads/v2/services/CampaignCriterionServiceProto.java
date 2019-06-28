// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/campaign_criterion_service.proto

package com.google.ads.googleads.v2.services;

public final class CampaignCriterionServiceProto {
  private CampaignCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetCampaignCriterionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetCampaignCriterionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_CampaignCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_CampaignCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v2/services/campa" +
      "ign_criterion_service.proto\022 google.ads." +
      "googleads.v2.services\032:google/ads/google" +
      "ads/v2/resources/campaign_criterion.prot" +
      "o\032\034google/api/annotations.proto\032 google/" +
      "protobuf/field_mask.proto\032\027google/rpc/st" +
      "atus.proto\032\027google/api/client.proto\"4\n\033G" +
      "etCampaignCriterionRequest\022\025\n\rresource_n" +
      "ame\030\001 \001(\t\"\266\001\n\035MutateCampaignCriteriaRequ" +
      "est\022\023\n\013customer_id\030\001 \001(\t\022P\n\noperations\030\002" +
      " \003(\0132<.google.ads.googleads.v2.services." +
      "CampaignCriterionOperation\022\027\n\017partial_fa" +
      "ilure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\374\001\n\032C" +
      "ampaignCriterionOperation\022/\n\013update_mask" +
      "\030\004 \001(\0132\032.google.protobuf.FieldMask\022F\n\006cr" +
      "eate\030\001 \001(\01324.google.ads.googleads.v2.res" +
      "ources.CampaignCriterionH\000\022F\n\006update\030\002 \001" +
      "(\01324.google.ads.googleads.v2.resources.C" +
      "ampaignCriterionH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\t" +
      "operation\"\245\001\n\036MutateCampaignCriteriaResp" +
      "onse\0221\n\025partial_failure_error\030\003 \001(\0132\022.go" +
      "ogle.rpc.Status\022P\n\007results\030\002 \003(\0132?.googl" +
      "e.ads.googleads.v2.services.MutateCampai" +
      "gnCriterionResult\"6\n\035MutateCampaignCrite" +
      "rionResult\022\025\n\rresource_name\030\001 \001(\t2\341\003\n\030Ca" +
      "mpaignCriterionService\022\307\001\n\024GetCampaignCr" +
      "iterion\022=.google.ads.googleads.v2.servic" +
      "es.GetCampaignCriterionRequest\0324.google." +
      "ads.googleads.v2.resources.CampaignCrite" +
      "rion\":\202\323\344\223\0024\0222/v2/{resource_name=custome" +
      "rs/*/campaignCriteria/*}\022\335\001\n\026MutateCampa" +
      "ignCriteria\022?.google.ads.googleads.v2.se" +
      "rvices.MutateCampaignCriteriaRequest\032@.g" +
      "oogle.ads.googleads.v2.services.MutateCa" +
      "mpaignCriteriaResponse\"@\202\323\344\223\002:\"5/v2/cust" +
      "omers/{customer_id=*}/campaignCriteria:m" +
      "utate:\001*\032\033\312A\030googleads.googleapis.comB\204\002" +
      "\n$com.google.ads.googleads.v2.servicesB\035" +
      "CampaignCriterionServiceProtoP\001ZHgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v2/services;services\242\002\003GAA\252\002 Google" +
      ".Ads.GoogleAds.V2.Services\312\002 Google\\Ads\\" +
      "GoogleAds\\V2\\Services\352\002$Google::Ads::Goo" +
      "gleAds::V2::Servicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.resources.CampaignCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetCampaignCriterionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetCampaignCriterionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetCampaignCriterionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_MutateCampaignCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v2_services_CampaignCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_CampaignCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_CampaignCriterionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_MutateCampaignCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_MutateCampaignCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.CampaignCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
