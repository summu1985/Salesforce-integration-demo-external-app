package com.redhat.demo.salesforce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// @JsonIgnoreProperties(ignoreUnknown = true)
public class Account {
    @JsonProperty("attributes")
    Attributes attributes;
    // @JsonProperty("type")
    // private String type;
    @JsonProperty("Name")
    private String name;
   
   public Account() {}
    // Getter Methods 
   
    public Attributes getAttributes() {
        return attributes;
       }

    public String getName() {
     return name;
    }
   
    // Setter Methods 
   
    public void setName(String name) {
     this.name = name;
    }

    public void setAttributes(Attributes attributesObject) {
        this.attributes = attributesObject;
       }

    @Override
    public String toString() {
        return "Account [attributes=" + attributes + ", name=" + name + "]";
    }

       
}
