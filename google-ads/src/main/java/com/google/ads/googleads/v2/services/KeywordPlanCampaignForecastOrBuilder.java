// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/keyword_plan_service.proto

package com.google.ads.googleads.v2.services;

public interface KeywordPlanCampaignForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.KeywordPlanCampaignForecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword+plan_campaign_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
   */
  boolean hasKeywordPlanCampaign();
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword+plan_campaign_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
   */
  com.google.protobuf.StringValue getKeywordPlanCampaign();
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword+plan_campaign_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getKeywordPlanCampaignOrBuilder();

  /**
   * <pre>
   * The forecast for the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.ForecastMetrics campaign_forecast = 2;</code>
   */
  boolean hasCampaignForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.ForecastMetrics campaign_forecast = 2;</code>
   */
  com.google.ads.googleads.v2.services.ForecastMetrics getCampaignForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.services.ForecastMetrics campaign_forecast = 2;</code>
   */
  com.google.ads.googleads.v2.services.ForecastMetricsOrBuilder getCampaignForecastOrBuilder();
}
