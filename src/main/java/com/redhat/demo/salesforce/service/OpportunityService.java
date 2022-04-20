package com.redhat.demo.salesforce.service;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redhat.demo.salesforce.model.Opportunity;
import com.redhat.demo.salesforce.model.OpportunityList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OpportunityService {

    @Value( "${fuse.getAllAPI.url}" )
    private String getAllAPIURL;
    //http://localhost:8080/camel/opportunity

    public OpportunityService() {
    }

    public ArrayList<Opportunity> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(getAllAPIURL, String.class);
        System.out.println("Recieved response from Fuse service : " + result);
        OpportunityList opportunityList = null;
        ArrayList<Opportunity> opportunities = null;

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
            opportunityList = mapper.readValue(result, OpportunityList.class);
            opportunities = opportunityList.getRecords();
            // for (Opportunity opportunity : opportunityList.getRecords()) {
            //     System.out.println(opportunity);
            // }
            //System.out.println(opportunityList);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return opportunities;
    }

}