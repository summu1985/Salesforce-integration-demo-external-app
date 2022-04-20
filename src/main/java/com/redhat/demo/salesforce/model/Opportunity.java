package com.redhat.demo.salesforce.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// @JsonIgnoreProperties(ignoreUnknown = true)
public class Opportunity {
    @JsonProperty("attributes")
    Attributes attributes;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("Account")
    private Account account;
    @JsonProperty("AccountId")
    private String accountId;
    @JsonProperty("StageName")
    private String stageName;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Amount")
    private float amount;
    @JsonProperty("Probability")
    private float probability;
    @JsonProperty("CloseDate")
    private String closeDate;
   
    public Opportunity() {}
   
    // Getter Methods 
   
    public Attributes getAttributes() {
     return attributes;
    }
   
    public String getId() {
     return id;
    }

    public Account getAccount() {
        return account;
    }
   
    public String getAccountId() {
     return accountId;
    }
   
    public String getStageName() {
     return stageName;
    }
   
    public String getName() {
     return name;
    }
   
    public float getProbability() {
     return probability;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public float getAmount() {
        return this.amount;
    }
   
    // Setter Methods 
   
    public void setAttributes(Attributes attributesObject) {
     this.attributes = attributesObject;
    }
   
    public void setId(String Id) {
     this.id = Id;
    }

    public void setAccount(Account account){
        this.account = account;
    }
   
    @Override
    public String toString() {
        return "Opportunity [account=" + account + ", accountId=" + accountId + ", amount=" + amount + ", attributes="
                + attributes + ", closeDate=" + closeDate + ", id=" + id + ", name=" + name + ", probability="
                + probability + ", stageName=" + stageName + "]";
    }

    public void setAccountId(String AccountId) {
     this.accountId = AccountId;
    }
   
    public void setStageName(String StageName) {
     this.stageName = StageName;
    }
   
    public void setName(String Name) {
     this.name = Name;
    }
   
    public void setProbability(float probability) {
     this.probability = probability;
    }

    public void setClosDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    // @Override
    // public String toString() {
    //     return "Id : " + this.id
    //     +" AccountId: " + this.accountId
    //     +" StageName: " + this.stageName;
    // }
   }
