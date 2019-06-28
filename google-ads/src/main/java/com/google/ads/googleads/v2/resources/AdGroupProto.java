// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/ad_group.proto

package com.google.ads.googleads.v2.resources;

public final class AdGroupProto {
  private AdGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_AdGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_AdGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v2/resources/ad_g" +
      "roup.proto\022!google.ads.googleads.v2.reso" +
      "urces\0325google/ads/googleads/v2/common/cu" +
      "stom_parameter.proto\032Dgoogle/ads/googlea" +
      "ds/v2/common/explorer_auto_optimizer_set" +
      "ting.proto\0326google/ads/googleads/v2/comm" +
      "on/targeting_setting.proto\032=google/ads/g" +
      "oogleads/v2/enums/ad_group_ad_rotation_m" +
      "ode.proto\0323google/ads/googleads/v2/enums" +
      "/ad_group_status.proto\0321google/ads/googl" +
      "eads/v2/enums/ad_group_type.proto\0322googl" +
      "e/ads/googleads/v2/enums/bidding_source." +
      "proto\0327google/ads/googleads/v2/enums/tar" +
      "geting_dimension.proto\032\036google/protobuf/" +
      "wrappers.proto\032\034google/api/annotations.p" +
      "roto\"\276\r\n\007AdGroup\022\025\n\rresource_name\030\001 \001(\t\022" +
      "\'\n\002id\030\003 \001(\0132\033.google.protobuf.Int64Value" +
      "\022*\n\004name\030\004 \001(\0132\034.google.protobuf.StringV" +
      "alue\022N\n\006status\030\005 \001(\0162>.google.ads.google" +
      "ads.v2.enums.AdGroupStatusEnum.AdGroupSt" +
      "atus\022H\n\004type\030\014 \001(\0162:.google.ads.googlead" +
      "s.v2.enums.AdGroupTypeEnum.AdGroupType\022h" +
      "\n\020ad_rotation_mode\030\026 \001(\0162N.google.ads.go" +
      "ogleads.v2.enums.AdGroupAdRotationModeEn" +
      "um.AdGroupAdRotationMode\0223\n\rbase_ad_grou" +
      "p\030\022 \001(\0132\034.google.protobuf.StringValue\022;\n" +
      "\025tracking_url_template\030\r \001(\0132\034.google.pr" +
      "otobuf.StringValue\022N\n\025url_custom_paramet" +
      "ers\030\006 \003(\0132/.google.ads.googleads.v2.comm" +
      "on.CustomParameter\022.\n\010campaign\030\n \001(\0132\034.g" +
      "oogle.protobuf.StringValue\0223\n\016cpc_bid_mi" +
      "cros\030\016 \001(\0132\033.google.protobuf.Int64Value\022" +
      "3\n\016cpm_bid_micros\030\017 \001(\0132\033.google.protobu" +
      "f.Int64Value\0226\n\021target_cpa_micros\030\033 \001(\0132" +
      "\033.google.protobuf.Int64Value\0223\n\016cpv_bid_" +
      "micros\030\021 \001(\0132\033.google.protobuf.Int64Valu" +
      "e\0226\n\021target_cpm_micros\030\032 \001(\0132\033.google.pr" +
      "otobuf.Int64Value\0221\n\013target_roas\030\036 \001(\0132\034" +
      ".google.protobuf.DoubleValue\022;\n\026percent_" +
      "cpc_bid_micros\030\024 \001(\0132\033.google.protobuf.I" +
      "nt64Value\022e\n\037explorer_auto_optimizer_set" +
      "ting\030\025 \001(\0132<.google.ads.googleads.v2.com" +
      "mon.ExplorerAutoOptimizerSetting\022n\n\034disp" +
      "lay_custom_bid_dimension\030\027 \001(\0162H.google." +
      "ads.googleads.v2.enums.TargetingDimensio" +
      "nEnum.TargetingDimension\0226\n\020final_url_su" +
      "ffix\030\030 \001(\0132\034.google.protobuf.StringValue" +
      "\022K\n\021targeting_setting\030\031 \001(\01320.google.ads" +
      ".googleads.v2.common.TargetingSetting\022@\n" +
      "\033effective_target_cpa_micros\030\034 \001(\0132\033.goo" +
      "gle.protobuf.Int64Value\022c\n\033effective_tar" +
      "get_cpa_source\030\035 \001(\0162>.google.ads.google" +
      "ads.v2.enums.BiddingSourceEnum.BiddingSo" +
      "urce\022;\n\025effective_target_roas\030\037 \001(\0132\034.go" +
      "ogle.protobuf.DoubleValue\022d\n\034effective_t" +
      "arget_roas_source\030  \001(\0162>.google.ads.goo" +
      "gleads.v2.enums.BiddingSourceEnum.Biddin" +
      "gSource\022,\n\006labels\030! \003(\0132\034.google.protobu" +
      "f.StringValueB\371\001\n%com.google.ads.googlea" +
      "ds.v2.resourcesB\014AdGroupProtoP\001ZJgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v2/resources;resources\242\002\003GAA\252\002!Goog" +
      "le.Ads.GoogleAds.V2.Resources\312\002!Google\\A" +
      "ds\\GoogleAds\\V2\\Resources\352\002%Google::Ads:" +
      ":GoogleAds::V2::Resourcesb\006proto3"
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
          com.google.ads.googleads.v2.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSettingProto.getDescriptor(),
          com.google.ads.googleads.v2.common.TargetingSettingProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AdGroupAdRotationModeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AdGroupStatusProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AdGroupTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.BiddingSourceProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.TargetingDimensionProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_AdGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_AdGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_AdGroup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "AdRotationMode", "BaseAdGroup", "TrackingUrlTemplate", "UrlCustomParameters", "Campaign", "CpcBidMicros", "CpmBidMicros", "TargetCpaMicros", "CpvBidMicros", "TargetCpmMicros", "TargetRoas", "PercentCpcBidMicros", "ExplorerAutoOptimizerSetting", "DisplayCustomBidDimension", "FinalUrlSuffix", "TargetingSetting", "EffectiveTargetCpaMicros", "EffectiveTargetCpaSource", "EffectiveTargetRoas", "EffectiveTargetRoasSource", "Labels", });
    com.google.ads.googleads.v2.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v2.common.ExplorerAutoOptimizerSettingProto.getDescriptor();
    com.google.ads.googleads.v2.common.TargetingSettingProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AdGroupAdRotationModeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AdGroupStatusProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AdGroupTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.BiddingSourceProto.getDescriptor();
    com.google.ads.googleads.v2.enums.TargetingDimensionProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
