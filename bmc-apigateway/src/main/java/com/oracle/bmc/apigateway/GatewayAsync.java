/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.apigateway;

import com.oracle.bmc.apigateway.requests.*;
import com.oracle.bmc.apigateway.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public interface GatewayAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Changes the gateway compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeGatewayCompartmentResponse> changeGatewayCompartment(
            ChangeGatewayCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeGatewayCompartmentRequest, ChangeGatewayCompartmentResponse>
                    handler);

    /**
     * Creates a new gateway.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateGatewayResponse> createGateway(
            CreateGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateGatewayRequest, CreateGatewayResponse>
                    handler);

    /**
     * Deletes the gateway with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteGatewayResponse> deleteGateway(
            DeleteGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteGatewayRequest, DeleteGatewayResponse>
                    handler);

    /**
     * Gets a gateway by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetGatewayResponse> getGateway(
            GetGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetGatewayRequest, GetGatewayResponse> handler);

    /**
     * Returns a list of gateways.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListGatewaysResponse> listGateways(
            ListGatewaysRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListGatewaysRequest, ListGatewaysResponse>
                    handler);

    /**
     * Updates the gateway with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGatewayResponse> updateGateway(
            UpdateGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateGatewayRequest, UpdateGatewayResponse>
                    handler);
}