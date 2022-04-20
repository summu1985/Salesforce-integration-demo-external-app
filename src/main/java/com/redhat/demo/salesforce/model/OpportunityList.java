package com.redhat.demo.salesforce.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpportunityList {
    private float totalSize;
    private boolean done;
    ArrayList < Opportunity > records = null;

    public OpportunityList() {}

 public float getTotalSize() {
    return totalSize;
   }
  
   public boolean getDone() {
    return done;
   }
  
   public ArrayList<Opportunity> getRecords() {
       return records;
   }
   // Setter Methods 
  
   public void setTotalSize(float totalSize) {
    this.totalSize = totalSize;
   }
  
   public void setDone(boolean done) {
    this.done = done;
   }

   public void setRecords(ArrayList<Opportunity> records) {
       this.records = records;
   }

   public String toString() {
       return this.records.toString()
       +" totalSize = " +this.totalSize
       +" done = " + this.done;
   }
}
