// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/language_constant_service.proto

package com.google.ads.googleads.v1.services;

public final class LanguageConstantServiceProto {
  private LanguageConstantServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetLanguageConstantRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetLanguageConstantRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v1/services/langu" +
      "age_constant_service.proto\022 google.ads.g" +
      "oogleads.v1.services\0329google/ads/googlea" +
      "ds/v1/resources/language_constant.proto\032" +
      "\034google/api/annotations.proto\032\027google/ap" +
      "i/client.proto\"3\n\032GetLanguageConstantReq" +
      "uest\022\025\n\rresource_name\030\001 \001(\t2\362\001\n\027Language" +
      "ConstantService\022\271\001\n\023GetLanguageConstant\022" +
      "<.google.ads.googleads.v1.services.GetLa" +
      "nguageConstantRequest\0323.google.ads.googl" +
      "eads.v1.resources.LanguageConstant\"/\202\323\344\223" +
      "\002)\022\'/v1/{resource_name=languageConstants" +
      "/*}\032\033\312A\030googleads.googleapis.comB\203\002\n$com" +
      ".google.ads.googleads.v1.servicesB\034Langu" +
      "ageConstantServiceProtoP\001ZHgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "1/services;services\242\002\003GAA\252\002 Google.Ads.G" +
      "oogleAds.V1.Services\312\002 Google\\Ads\\Google" +
      "Ads\\V1\\Services\352\002$Google::Ads::GoogleAds" +
      "::V1::Servicesb\006proto3"
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
          com.google.ads.googleads.v1.resources.LanguageConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetLanguageConstantRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetLanguageConstantRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetLanguageConstantRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.LanguageConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
