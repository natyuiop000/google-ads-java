// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/billing_setup_error.proto

package com.google.ads.googleads.v0.errors;

public final class BillingSetupErrorProto {
  private BillingSetupErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_BillingSetupErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_BillingSetupErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v0/errors/billing" +
      "_setup_error.proto\022\036google.ads.googleads" +
      ".v0.errors\"\373\004\n\025BillingSetupErrorEnum\"\341\004\n" +
      "\021BillingSetupError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007U" +
      "NKNOWN\020\001\022\'\n#CANNOT_USE_EXISTING_AND_NEW_" +
      "ACCOUNT\020\002\022\'\n#CANNOT_REMOVE_STARTED_BILLI" +
      "NG_SETUP\020\003\0222\n.CANNOT_CHANGE_BILLING_TO_S" +
      "AME_PAYMENTS_ACCOUNT\020\004\0223\n/BILLING_SETUP_" +
      "NOT_PERMITTED_FOR_CUSTOMER_STATUS\020\005\022\034\n\030I" +
      "NVALID_PAYMENTS_ACCOUNT\020\006\0225\n1BILLING_SET" +
      "UP_NOT_PERMITTED_FOR_CUSTOMER_CATEGORY\020\007" +
      "\022\033\n\027INVALID_START_TIME_TYPE\020\010\022#\n\037THIRD_P" +
      "ARTY_ALREADY_HAS_BILLING\020\t\022\035\n\031BILLING_SE" +
      "TUP_IN_PROGRESS\020\n\022\030\n\024NO_SIGNUP_PERMISSIO" +
      "N\020\013\022!\n\035CHANGE_OF_BILL_TO_IN_PROGRESS\020\014\022\036" +
      "\n\032PAYMENTS_PROFILE_NOT_FOUND\020\r\022\036\n\032PAYMEN" +
      "TS_ACCOUNT_NOT_FOUND\020\016\022\037\n\033PAYMENTS_PROFI" +
      "LE_INELIGIBLE\020\017\022\037\n\033PAYMENTS_ACCOUNT_INEL" +
      "IGIBLE\020\020B\361\001\n\"com.google.ads.googleads.v0" +
      ".errorsB\026BillingSetupErrorProtoP\001ZDgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v0/errors;errors\242\002\003GAA\252\002\036Google.A" +
      "ds.GoogleAds.V0.Errors\312\002\036Google\\Ads\\Goog" +
      "leAds\\V0\\Errors\352\002\"Google::Ads::GoogleAds" +
      "::V0::Errorsb\006proto3"
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
        }, assigner);
    internal_static_google_ads_googleads_v0_errors_BillingSetupErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_BillingSetupErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_BillingSetupErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}