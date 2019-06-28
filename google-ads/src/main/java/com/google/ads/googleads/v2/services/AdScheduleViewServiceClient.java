/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v2.services;

import com.google.ads.googleads.v2.resources.AdScheduleView;
import com.google.ads.googleads.v2.services.stub.AdScheduleViewServiceStub;
import com.google.ads.googleads.v2.services.stub.AdScheduleViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch ad schedule views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AdScheduleViewServiceClient adScheduleViewServiceClient = AdScheduleViewServiceClient.create()) {
 *   String formattedResourceName = AdScheduleViewServiceClient.formatAdScheduleViewName("[CUSTOMER]", "[AD_SCHEDULE_VIEW]");
 *   AdScheduleView response = adScheduleViewServiceClient.getAdScheduleView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the adScheduleViewServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of AdScheduleViewServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AdScheduleViewServiceSettings adScheduleViewServiceSettings =
 *     AdScheduleViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdScheduleViewServiceClient adScheduleViewServiceClient =
 *     AdScheduleViewServiceClient.create(adScheduleViewServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AdScheduleViewServiceSettings adScheduleViewServiceSettings =
 *     AdScheduleViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdScheduleViewServiceClient adScheduleViewServiceClient =
 *     AdScheduleViewServiceClient.create(adScheduleViewServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AdScheduleViewServiceClient implements BackgroundResource {
  private final AdScheduleViewServiceSettings settings;
  private final AdScheduleViewServiceStub stub;

  private static final PathTemplate AD_SCHEDULE_VIEW_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/adScheduleViews/{ad_schedule_view}");

  /**
   * Formats a string containing the fully-qualified path to represent a ad_schedule_view resource.
   *
   * @deprecated Use the {@link AdScheduleViewName} class instead.
   */
  @Deprecated
  public static final String formatAdScheduleViewName(String customer, String adScheduleView) {
    return AD_SCHEDULE_VIEW_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "ad_schedule_view", adScheduleView);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a ad_schedule_view
   * resource.
   *
   * @deprecated Use the {@link AdScheduleViewName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromAdScheduleViewName(String adScheduleViewName) {
    return AD_SCHEDULE_VIEW_PATH_TEMPLATE.parse(adScheduleViewName).get("customer");
  }

  /**
   * Parses the ad_schedule_view from the given fully-qualified path which represents a
   * ad_schedule_view resource.
   *
   * @deprecated Use the {@link AdScheduleViewName} class instead.
   */
  @Deprecated
  public static final String parseAdScheduleViewFromAdScheduleViewName(String adScheduleViewName) {
    return AD_SCHEDULE_VIEW_PATH_TEMPLATE.parse(adScheduleViewName).get("ad_schedule_view");
  }

  /** Constructs an instance of AdScheduleViewServiceClient with default settings. */
  public static final AdScheduleViewServiceClient create() throws IOException {
    return create(AdScheduleViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdScheduleViewServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AdScheduleViewServiceClient create(AdScheduleViewServiceSettings settings)
      throws IOException {
    return new AdScheduleViewServiceClient(settings);
  }

  /**
   * Constructs an instance of AdScheduleViewServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use AdScheduleViewServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdScheduleViewServiceClient create(AdScheduleViewServiceStub stub) {
    return new AdScheduleViewServiceClient(stub);
  }

  /**
   * Constructs an instance of AdScheduleViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdScheduleViewServiceClient(AdScheduleViewServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AdScheduleViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdScheduleViewServiceClient(AdScheduleViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdScheduleViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdScheduleViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad schedule view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdScheduleViewServiceClient adScheduleViewServiceClient = AdScheduleViewServiceClient.create()) {
   *   String formattedResourceName = AdScheduleViewServiceClient.formatAdScheduleViewName("[CUSTOMER]", "[AD_SCHEDULE_VIEW]");
   *   AdScheduleView response = adScheduleViewServiceClient.getAdScheduleView(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the ad schedule view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdScheduleView getAdScheduleView(String resourceName) {
    AD_SCHEDULE_VIEW_PATH_TEMPLATE.validate(resourceName, "getAdScheduleView");
    GetAdScheduleViewRequest request =
        GetAdScheduleViewRequest.newBuilder().setResourceName(resourceName).build();
    return getAdScheduleView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad schedule view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdScheduleViewServiceClient adScheduleViewServiceClient = AdScheduleViewServiceClient.create()) {
   *   String formattedResourceName = AdScheduleViewServiceClient.formatAdScheduleViewName("[CUSTOMER]", "[AD_SCHEDULE_VIEW]");
   *   GetAdScheduleViewRequest request = GetAdScheduleViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   AdScheduleView response = adScheduleViewServiceClient.getAdScheduleView(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdScheduleView getAdScheduleView(GetAdScheduleViewRequest request) {
    return getAdScheduleViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad schedule view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdScheduleViewServiceClient adScheduleViewServiceClient = AdScheduleViewServiceClient.create()) {
   *   String formattedResourceName = AdScheduleViewServiceClient.formatAdScheduleViewName("[CUSTOMER]", "[AD_SCHEDULE_VIEW]");
   *   GetAdScheduleViewRequest request = GetAdScheduleViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;AdScheduleView&gt; future = adScheduleViewServiceClient.getAdScheduleViewCallable().futureCall(request);
   *   // Do something
   *   AdScheduleView response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAdScheduleViewRequest, AdScheduleView> getAdScheduleViewCallable() {
    return stub.getAdScheduleViewCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
