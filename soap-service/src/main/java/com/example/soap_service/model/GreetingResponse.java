package com.example.soap_service.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GreetingResponse", namespace = "http://example.com/soapservice")
@XmlAccessorType(XmlAccessType.FIELD)
public class GreetingResponse {

    @XmlElement(name = "message", namespace = "http://example.com/soapservice")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
