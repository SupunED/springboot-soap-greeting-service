package com.example.soap_service.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GreetingRequest", namespace = "http://example.com/soapservice")
@XmlAccessorType(XmlAccessType.FIELD)
public class GreetingRequest {

    @XmlElement(name = "name", namespace = "http://example.com/soapservice")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
