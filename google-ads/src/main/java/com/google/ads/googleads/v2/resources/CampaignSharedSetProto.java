// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/campaign_shared_set.proto

package com.google.ads.googleads.v2.resources;

public final class CampaignSharedSetProto {
  private CampaignSharedSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_CampaignSharedSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_CampaignSharedSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v2/resources/camp" +
      "aign_shared_set.proto\022!google.ads.google" +
      "ads.v2.resources\032>google/ads/googleads/v" +
      "2/enums/campaign_shared_set_status.proto" +
      "\032\036google/protobuf/wrappers.proto\032\034google" +
      "/api/annotations.proto\"\360\001\n\021CampaignShare" +
      "dSet\022\025\n\rresource_name\030\001 \001(\t\022.\n\010campaign\030" +
      "\003 \001(\0132\034.google.protobuf.StringValue\0220\n\ns" +
      "hared_set\030\004 \001(\0132\034.google.protobuf.String" +
      "Value\022b\n\006status\030\002 \001(\0162R.google.ads.googl" +
      "eads.v2.enums.CampaignSharedSetStatusEnu" +
      "m.CampaignSharedSetStatusB\203\002\n%com.google" +
      ".ads.googleads.v2.resourcesB\026CampaignSha" +
      "redSetProtoP\001ZJgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v2/resources;" +
      "resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V" +
      "2.Resources\312\002!Google\\Ads\\GoogleAds\\V2\\Re" +
      "sources\352\002%Google::Ads::GoogleAds::V2::Re" +
      "sourcesb\006proto3"
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
          com.google.ads.googleads.v2.enums.CampaignSharedSetStatusProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_CampaignSharedSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_CampaignSharedSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_CampaignSharedSet_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "SharedSet", "Status", });
    com.google.ads.googleads.v2.enums.CampaignSharedSetStatusProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
