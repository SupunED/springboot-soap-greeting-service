package com.example.soap_service.endpoint;

import com.example.soap_service.model.GreetingRequest;
import com.example.soap_service.model.GreetingResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class GreetingEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/soapservice";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GreetingRequest")
    @ResponsePayload
    public GreetingResponse handleGreeting(@RequestPayload GreetingRequest request) {
        GreetingResponse response = new GreetingResponse();
        response.setMessage("Hello, " + request.getName() + "!");
        return response;
    }
}
