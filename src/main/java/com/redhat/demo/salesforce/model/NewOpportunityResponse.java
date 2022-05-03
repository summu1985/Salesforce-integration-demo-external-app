package com.redhat.demo.salesforce.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewOpportunityResponse {
    private String id;
    ArrayList<Object> errors = new ArrayList<Object>();
    private boolean success;
    private boolean created;

    // Getter Methods

    public String getId() {
        return id;
    }

    public boolean getSuccess() {
        return success;
    }

    public boolean getCreated() {
        return created;
    }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "NewOpportunityResponse [created=" + created + ", errors=" + errors + ", id=" + id + ", success="
                + success + "]";
    }
}
