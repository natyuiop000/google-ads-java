// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/distance_view.proto

package com.google.ads.googleads.v2.resources;

public final class DistanceViewProto {
  private DistanceViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_DistanceView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_DistanceView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v2/resources/dist" +
      "ance_view.proto\022!google.ads.googleads.v2" +
      ".resources\0323google/ads/googleads/v2/enum" +
      "s/distance_bucket.proto\032\036google/protobuf" +
      "/wrappers.proto\032\034google/api/annotations." +
      "proto\"\263\001\n\014DistanceView\022\025\n\rresource_name\030" +
      "\001 \001(\t\022Y\n\017distance_bucket\030\002 \001(\0162@.google." +
      "ads.googleads.v2.enums.DistanceBucketEnu" +
      "m.DistanceBucket\0221\n\rmetric_system\030\003 \001(\0132" +
      "\032.google.protobuf.BoolValueB\376\001\n%com.goog" +
      "le.ads.googleads.v2.resourcesB\021DistanceV" +
      "iewProtoP\001ZJgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v2/resources;res" +
      "ources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V2.R" +
      "esources\312\002!Google\\Ads\\GoogleAds\\V2\\Resou" +
      "rces\352\002%Google::Ads::GoogleAds::V2::Resou" +
      "rcesb\006proto3"
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
          com.google.ads.googleads.v2.enums.DistanceBucketProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_DistanceView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_DistanceView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_DistanceView_descriptor,
        new java.lang.String[] { "ResourceName", "DistanceBucket", "MetricSystem", });
    com.google.ads.googleads.v2.enums.DistanceBucketProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
