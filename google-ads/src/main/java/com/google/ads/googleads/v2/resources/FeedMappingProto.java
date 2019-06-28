// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/feed_mapping.proto

package com.google.ads.googleads.v2.resources;

public final class FeedMappingProto {
  private FeedMappingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_FeedMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_FeedMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_AttributeFieldMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_AttributeFieldMapping_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v2/resources/feed" +
      "_mapping.proto\022!google.ads.googleads.v2." +
      "resources\032Cgoogle/ads/googleads/v2/enums" +
      "/ad_customizer_placeholder_field.proto\032H" +
      "google/ads/googleads/v2/enums/affiliate_" +
      "location_placeholder_field.proto\0329google" +
      "/ads/googleads/v2/enums/app_placeholder_" +
      "field.proto\032:google/ads/googleads/v2/enu" +
      "ms/call_placeholder_field.proto\032=google/" +
      "ads/googleads/v2/enums/callout_placehold" +
      "er_field.proto\032<google/ads/googleads/v2/" +
      "enums/custom_placeholder_field.proto\032Ago" +
      "ogle/ads/googleads/v2/enums/dsa_page_fee" +
      "d_criterion_field.proto\032?google/ads/goog" +
      "leads/v2/enums/education_placeholder_fie" +
      "ld.proto\032?google/ads/googleads/v2/enums/" +
      "feed_mapping_criterion_type.proto\0327googl" +
      "e/ads/googleads/v2/enums/feed_mapping_st" +
      "atus.proto\032<google/ads/googleads/v2/enum" +
      "s/flight_placeholder_field.proto\032;google" +
      "/ads/googleads/v2/enums/hotel_placeholde" +
      "r_field.proto\0329google/ads/googleads/v2/e" +
      "nums/job_placeholder_field.proto\032;google" +
      "/ads/googleads/v2/enums/local_placeholde" +
      "r_field.proto\032Pgoogle/ads/googleads/v2/e" +
      "nums/location_extension_targeting_criter" +
      "ion_field.proto\032>google/ads/googleads/v2" +
      "/enums/location_placeholder_field.proto\032" +
      "=google/ads/googleads/v2/enums/message_p" +
      "laceholder_field.proto\0324google/ads/googl" +
      "eads/v2/enums/placeholder_type.proto\032;go" +
      "ogle/ads/googleads/v2/enums/price_placeh" +
      "older_field.proto\032?google/ads/googleads/" +
      "v2/enums/promotion_placeholder_field.pro" +
      "to\032Agoogle/ads/googleads/v2/enums/real_e" +
      "state_placeholder_field.proto\032>google/ad" +
      "s/googleads/v2/enums/sitelink_placeholde" +
      "r_field.proto\032Hgoogle/ads/googleads/v2/e" +
      "nums/structured_snippet_placeholder_fiel" +
      "d.proto\032<google/ads/googleads/v2/enums/t" +
      "ravel_placeholder_field.proto\032\036google/pr" +
      "otobuf/wrappers.proto\032\034google/api/annota" +
      "tions.proto\"\336\003\n\013FeedMapping\022\025\n\rresource_" +
      "name\030\001 \001(\t\022*\n\004feed\030\002 \001(\0132\034.google.protob" +
      "uf.StringValue\022Z\n\030attribute_field_mappin" +
      "gs\030\005 \003(\01328.google.ads.googleads.v2.resou" +
      "rces.AttributeFieldMapping\022V\n\006status\030\006 \001" +
      "(\0162F.google.ads.googleads.v2.enums.FeedM" +
      "appingStatusEnum.FeedMappingStatus\022^\n\020pl" +
      "aceholder_type\030\003 \001(\0162B.google.ads.google" +
      "ads.v2.enums.PlaceholderTypeEnum.Placeho" +
      "lderTypeH\000\022n\n\016criterion_type\030\004 \001(\0162T.goo" +
      "gle.ads.googleads.v2.enums.FeedMappingCr" +
      "iterionTypeEnum.FeedMappingCriterionType" +
      "H\000B\010\n\006target\"\352\023\n\025AttributeFieldMapping\0226" +
      "\n\021feed_attribute_id\030\001 \001(\0132\033.google.proto" +
      "buf.Int64Value\022-\n\010field_id\030\002 \001(\0132\033.googl" +
      "e.protobuf.Int64Value\022n\n\016sitelink_field\030" +
      "\003 \001(\0162T.google.ads.googleads.v2.enums.Si" +
      "telinkPlaceholderFieldEnum.SitelinkPlace" +
      "holderFieldH\000\022b\n\ncall_field\030\004 \001(\0162L.goog" +
      "le.ads.googleads.v2.enums.CallPlaceholde" +
      "rFieldEnum.CallPlaceholderFieldH\000\022_\n\tapp" +
      "_field\030\005 \001(\0162J.google.ads.googleads.v2.e" +
      "nums.AppPlaceholderFieldEnum.AppPlacehol" +
      "derFieldH\000\022n\n\016location_field\030\006 \001(\0162T.goo" +
      "gle.ads.googleads.v2.enums.LocationPlace" +
      "holderFieldEnum.LocationPlaceholderField" +
      "H\000\022\212\001\n\030affiliate_location_field\030\007 \001(\0162f." +
      "google.ads.googleads.v2.enums.AffiliateL" +
      "ocationPlaceholderFieldEnum.AffiliateLoc" +
      "ationPlaceholderFieldH\000\022k\n\rcallout_field" +
      "\030\010 \001(\0162R.google.ads.googleads.v2.enums.C" +
      "alloutPlaceholderFieldEnum.CalloutPlaceh" +
      "olderFieldH\000\022\212\001\n\030structured_snippet_fiel" +
      "d\030\t \001(\0162f.google.ads.googleads.v2.enums." +
      "StructuredSnippetPlaceholderFieldEnum.St" +
      "ructuredSnippetPlaceholderFieldH\000\022k\n\rmes" +
      "sage_field\030\n \001(\0162R.google.ads.googleads." +
      "v2.enums.MessagePlaceholderFieldEnum.Mes" +
      "sagePlaceholderFieldH\000\022e\n\013price_field\030\013 " +
      "\001(\0162N.google.ads.googleads.v2.enums.Pric" +
      "ePlaceholderFieldEnum.PricePlaceholderFi" +
      "eldH\000\022q\n\017promotion_field\030\014 \001(\0162V.google." +
      "ads.googleads.v2.enums.PromotionPlacehol" +
      "derFieldEnum.PromotionPlaceholderFieldH\000" +
      "\022{\n\023ad_customizer_field\030\r \001(\0162\\.google.a" +
      "ds.googleads.v2.enums.AdCustomizerPlaceh" +
      "olderFieldEnum.AdCustomizerPlaceholderFi" +
      "eldH\000\022u\n\023dsa_page_feed_field\030\016 \001(\0162V.goo" +
      "gle.ads.googleads.v2.enums.DsaPageFeedCr" +
      "iterionFieldEnum.DsaPageFeedCriterionFie" +
      "ldH\000\022\242\001\n\"location_extension_targeting_fi" +
      "eld\030\017 \001(\0162t.google.ads.googleads.v2.enum" +
      "s.LocationExtensionTargetingCriterionFie" +
      "ldEnum.LocationExtensionTargetingCriteri" +
      "onFieldH\000\022q\n\017education_field\030\020 \001(\0162V.goo" +
      "gle.ads.googleads.v2.enums.EducationPlac" +
      "eholderFieldEnum.EducationPlaceholderFie" +
      "ldH\000\022h\n\014flight_field\030\021 \001(\0162P.google.ads." +
      "googleads.v2.enums.FlightPlaceholderFiel" +
      "dEnum.FlightPlaceholderFieldH\000\022h\n\014custom" +
      "_field\030\022 \001(\0162P.google.ads.googleads.v2.e" +
      "nums.CustomPlaceholderFieldEnum.CustomPl" +
      "aceholderFieldH\000\022e\n\013hotel_field\030\023 \001(\0162N." +
      "google.ads.googleads.v2.enums.HotelPlace" +
      "holderFieldEnum.HotelPlaceholderFieldH\000\022" +
      "u\n\021real_estate_field\030\024 \001(\0162X.google.ads." +
      "googleads.v2.enums.RealEstatePlaceholder" +
      "FieldEnum.RealEstatePlaceholderFieldH\000\022h" +
      "\n\014travel_field\030\025 \001(\0162P.google.ads.google" +
      "ads.v2.enums.TravelPlaceholderFieldEnum." +
      "TravelPlaceholderFieldH\000\022e\n\013local_field\030" +
      "\026 \001(\0162N.google.ads.googleads.v2.enums.Lo" +
      "calPlaceholderFieldEnum.LocalPlaceholder" +
      "FieldH\000\022_\n\tjob_field\030\027 \001(\0162J.google.ads." +
      "googleads.v2.enums.JobPlaceholderFieldEn" +
      "um.JobPlaceholderFieldH\000B\007\n\005fieldB\375\001\n%co" +
      "m.google.ads.googleads.v2.resourcesB\020Fee" +
      "dMappingProtoP\001ZJgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v2/resource" +
      "s;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds" +
      ".V2.Resources\312\002!Google\\Ads\\GoogleAds\\V2\\" +
      "Resources\352\002%Google::Ads::GoogleAds::V2::" +
      "Resourcesb\006proto3"
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
          com.google.ads.googleads.v2.enums.AdCustomizerPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AppPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CallPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CalloutPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CustomPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.DsaPageFeedCriterionFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.EducationPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.FeedMappingCriterionTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.FeedMappingStatusProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.FlightsPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.HotelsPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.JobsPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.LocalPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.LocationExtensionTargetingCriterionFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.LocationPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.MessagePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.PricePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.PromotionPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.RealEstatePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.SitelinkPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.StructuredSnippetPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.TravelPlaceholderFieldProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_FeedMapping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_FeedMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_FeedMapping_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "AttributeFieldMappings", "Status", "PlaceholderType", "CriterionType", "Target", });
    internal_static_google_ads_googleads_v2_resources_AttributeFieldMapping_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_resources_AttributeFieldMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_AttributeFieldMapping_descriptor,
        new java.lang.String[] { "FeedAttributeId", "FieldId", "SitelinkField", "CallField", "AppField", "LocationField", "AffiliateLocationField", "CalloutField", "StructuredSnippetField", "MessageField", "PriceField", "PromotionField", "AdCustomizerField", "DsaPageFeedField", "LocationExtensionTargetingField", "EducationField", "FlightField", "CustomField", "HotelField", "RealEstateField", "TravelField", "LocalField", "JobField", "Field", });
    com.google.ads.googleads.v2.enums.AdCustomizerPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AppPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CallPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CalloutPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CustomPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.DsaPageFeedCriterionFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.EducationPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.FeedMappingCriterionTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.FeedMappingStatusProto.getDescriptor();
    com.google.ads.googleads.v2.enums.FlightsPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.HotelsPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.JobsPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.LocalPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.LocationExtensionTargetingCriterionFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.LocationPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.MessagePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.PlaceholderTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.PricePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.PromotionPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.RealEstatePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.SitelinkPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.StructuredSnippetPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.TravelPlaceholderFieldProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
