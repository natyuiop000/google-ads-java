// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/campaign_criterion.proto

package com.google.ads.googleads.v0.resources;

public final class CampaignCriterionProto {
  private CampaignCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_CampaignCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_CampaignCriterion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v0/resources/camp" +
      "aign_criterion.proto\022!google.ads.googlea" +
      "ds.v0.resources\032-google/ads/googleads/v0" +
      "/common/criteria.proto\0322google/ads/googl" +
      "eads/v0/enums/criterion_type.proto\032\036goog" +
      "le/protobuf/wrappers.proto\"\215\004\n\021CampaignC" +
      "riterion\022\025\n\rresource_name\030\001 \001(\t\022.\n\010campa" +
      "ign\030\004 \001(\0132\034.google.protobuf.StringValue\022" +
      "1\n\014criterion_id\030\005 \001(\0132\033.google.protobuf." +
      "Int64Value\0221\n\014bid_modifier\030\016 \001(\0132\033.googl" +
      "e.protobuf.FloatValue\022,\n\010negative\030\007 \001(\0132" +
      "\032.google.protobuf.BoolValue\022L\n\004type\030\006 \001(" +
      "\0162>.google.ads.googleads.v0.enums.Criter" +
      "ionTypeEnum.CriterionType\022>\n\007keyword\030\010 \001" +
      "(\0132+.google.ads.googleads.v0.common.Keyw" +
      "ordInfoH\000\022@\n\010location\030\014 \001(\0132,.google.ads" +
      ".googleads.v0.common.LocationInfoH\000\022@\n\010p" +
      "latform\030\r \001(\0132,.google.ads.googleads.v0." +
      "common.PlatformInfoH\000B\013\n\tcriterionB\333\001\n%c" +
      "om.google.ads.googleads.v0.resourcesB\026Ca" +
      "mpaignCriterionProtoP\001ZJgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v0/r" +
      "esources;resources\242\002\003GAA\252\002!Google.Ads.Go" +
      "ogleAds.V0.Resources\312\002!Google\\Ads\\Google" +
      "Ads\\V0\\Resourcesb\006proto3"
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
          com.google.ads.googleads.v0.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.CriterionTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_CampaignCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_CampaignCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_CampaignCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CriterionId", "BidModifier", "Negative", "Type", "Keyword", "Location", "Platform", "Criterion", });
    com.google.ads.googleads.v0.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v0.enums.CriterionTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}