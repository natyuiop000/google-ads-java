// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/conversion_action.proto

package com.google.ads.googleads.v2.resources;

public final class ConversionActionProto {
  private ConversionActionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_ConversionAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_ConversionAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_ConversionAction_AttributionModelSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_ConversionAction_AttributionModelSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_ConversionAction_ValueSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_ConversionAction_ValueSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v2/resources/conv" +
      "ersion_action.proto\022!google.ads.googlead" +
      "s.v2.resources\0320google/ads/googleads/v2/" +
      "common/tag_snippet.proto\0325google/ads/goo" +
      "gleads/v2/enums/attribution_model.proto\032" +
      ">google/ads/googleads/v2/enums/conversio" +
      "n_action_category.proto\032Cgoogle/ads/goog" +
      "leads/v2/enums/conversion_action_countin" +
      "g_type.proto\032<google/ads/googleads/v2/en" +
      "ums/conversion_action_status.proto\032:goog" +
      "le/ads/googleads/v2/enums/conversion_act" +
      "ion_type.proto\032<google/ads/googleads/v2/" +
      "enums/data_driven_model_status.proto\032\036go" +
      "ogle/protobuf/wrappers.proto\032\034google/api" +
      "/annotations.proto\"\324\014\n\020ConversionAction\022" +
      "\025\n\rresource_name\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033.goo" +
      "gle.protobuf.Int64Value\022*\n\004name\030\003 \001(\0132\034." +
      "google.protobuf.StringValue\022`\n\006status\030\004 " +
      "\001(\0162P.google.ads.googleads.v2.enums.Conv" +
      "ersionActionStatusEnum.ConversionActionS" +
      "tatus\022Z\n\004type\030\005 \001(\0162L.google.ads.googlea" +
      "ds.v2.enums.ConversionActionTypeEnum.Con" +
      "versionActionType\022f\n\010category\030\006 \001(\0162T.go" +
      "ogle.ads.googleads.v2.enums.ConversionAc" +
      "tionCategoryEnum.ConversionActionCategor" +
      "y\0224\n\016owner_customer\030\007 \001(\0132\034.google.proto" +
      "buf.StringValue\022A\n\035include_in_conversion" +
      "s_metric\030\010 \001(\0132\032.google.protobuf.BoolVal" +
      "ue\022G\n\"click_through_lookback_window_days" +
      "\030\t \001(\0132\033.google.protobuf.Int64Value\022F\n!v" +
      "iew_through_lookback_window_days\030\n \001(\0132\033" +
      ".google.protobuf.Int64Value\022Y\n\016value_set" +
      "tings\030\013 \001(\0132A.google.ads.googleads.v2.re" +
      "sources.ConversionAction.ValueSettings\022s" +
      "\n\rcounting_type\030\014 \001(\0162\\.google.ads.googl" +
      "eads.v2.enums.ConversionActionCountingTy" +
      "peEnum.ConversionActionCountingType\022p\n\032a" +
      "ttribution_model_settings\030\r \001(\0132L.google" +
      ".ads.googleads.v2.resources.ConversionAc" +
      "tion.AttributionModelSettings\022@\n\014tag_sni" +
      "ppets\030\016 \003(\0132*.google.ads.googleads.v2.co" +
      "mmon.TagSnippet\022@\n\033phone_call_duration_s" +
      "econds\030\017 \001(\0132\033.google.protobuf.Int64Valu" +
      "e\022,\n\006app_id\030\020 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\032\355\001\n\030AttributionModelSettings\022_\n\021" +
      "attribution_model\030\001 \001(\0162D.google.ads.goo" +
      "gleads.v2.enums.AttributionModelEnum.Att" +
      "ributionModel\022p\n\030data_driven_model_statu" +
      "s\030\002 \001(\0162N.google.ads.googleads.v2.enums." +
      "DataDrivenModelStatusEnum.DataDrivenMode" +
      "lStatus\032\277\001\n\rValueSettings\0223\n\rdefault_val" +
      "ue\030\001 \001(\0132\034.google.protobuf.DoubleValue\022;" +
      "\n\025default_currency_code\030\002 \001(\0132\034.google.p" +
      "rotobuf.StringValue\022<\n\030always_use_defaul" +
      "t_value\030\003 \001(\0132\032.google.protobuf.BoolValu" +
      "eB\202\002\n%com.google.ads.googleads.v2.resour" +
      "cesB\025ConversionActionProtoP\001ZJgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v2/resources;resources\242\002\003GAA\252\002!Google." +
      "Ads.GoogleAds.V2.Resources\312\002!Google\\Ads\\" +
      "GoogleAds\\V2\\Resources\352\002%Google::Ads::Go" +
      "ogleAds::V2::Resourcesb\006proto3"
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
          com.google.ads.googleads.v2.common.TagSnippetProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AttributionModelProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ConversionActionCountingTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ConversionActionStatusProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ConversionActionTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.DataDrivenModelStatusProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_ConversionAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_ConversionAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_ConversionAction_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "Category", "OwnerCustomer", "IncludeInConversionsMetric", "ClickThroughLookbackWindowDays", "ViewThroughLookbackWindowDays", "ValueSettings", "CountingType", "AttributionModelSettings", "TagSnippets", "PhoneCallDurationSeconds", "AppId", });
    internal_static_google_ads_googleads_v2_resources_ConversionAction_AttributionModelSettings_descriptor =
      internal_static_google_ads_googleads_v2_resources_ConversionAction_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_ConversionAction_AttributionModelSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_ConversionAction_AttributionModelSettings_descriptor,
        new java.lang.String[] { "AttributionModel", "DataDrivenModelStatus", });
    internal_static_google_ads_googleads_v2_resources_ConversionAction_ValueSettings_descriptor =
      internal_static_google_ads_googleads_v2_resources_ConversionAction_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v2_resources_ConversionAction_ValueSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_ConversionAction_ValueSettings_descriptor,
        new java.lang.String[] { "DefaultValue", "DefaultCurrencyCode", "AlwaysUseDefaultValue", });
    com.google.ads.googleads.v2.common.TagSnippetProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AttributionModelProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ConversionActionCountingTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ConversionActionStatusProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ConversionActionTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.DataDrivenModelStatusProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
