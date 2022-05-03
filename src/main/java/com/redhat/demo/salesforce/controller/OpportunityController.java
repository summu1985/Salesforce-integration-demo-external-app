package com.redhat.demo.salesforce.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import com.redhat.demo.salesforce.model.Account;
import com.redhat.demo.salesforce.model.Attributes;
import com.redhat.demo.salesforce.model.Opportunity;
import com.redhat.demo.salesforce.service.OpportunityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OpportunityController {
    private final OpportunityService opportunityService;

    @Autowired
    public OpportunityController(OpportunityService opportunityService) {
        this.opportunityService = opportunityService;
    }
    @GetMapping("/index")
    public String showOpportunityList(Model model) {
        model.addAttribute("opportunities", opportunityService.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String showOpportunityForm(Model model) {
        Account account = new Account();
        Attributes accAttrs = new Attributes();
        accAttrs.setType("Account");
        accAttrs.setUrl("/services/data/v53.0/sobjects/Account/0015j00000eJ79IAAS");
        account.setAttributes(accAttrs);
        Opportunity opp = new Opportunity();
        opp.setAccount(account);
        model.addAttribute("opportunity", opp);

        ArrayList<String> stages = new ArrayList<String>();
        stages.add("Prospecting");
        stages.add("Qualification");
        stages.add("Negotiation/Review");
        stages.add("Closed Won");
        stages.add("Proposal/Price Quote");
        model.addAttribute("stages", stages);

        return "add-expense";
    }

    @PostMapping("/addopportunity")
    public String addExpense(@Valid Opportunity opportunity, BindingResult result, Model model) {
    
        System.out.println(opportunity);
        String oppId = "Opportunity created successfully with Opportunity id = " + opportunityService.addOpportunity(opportunity);
        model.addAttribute("opportunityid", oppId);
        return "opportunity-created";
    }
}
