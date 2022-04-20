package com.redhat.demo.salesforce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attributes {
    @JsonProperty("type")
    private String type;
    @JsonProperty("url")
    private String url;
   
   public Attributes() {}
    // Getter Methods 
   
    public String getType() {
     return type;
    }
   
    public String getUrl() {
     return url;
    }
   
    // Setter Methods 
   
    public void setType(String type) {
     this.type = type;
    }
   
    public void setUrl(String url) {
     this.url = url;
    }

    @Override
    public String toString() {
        return "Attributes [type=" + type + ", url=" + url + "]";
    }

    
}
