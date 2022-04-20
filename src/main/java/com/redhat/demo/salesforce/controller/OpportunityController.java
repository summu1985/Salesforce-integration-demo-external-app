package com.redhat.demo.salesforce.controller;

import java.util.ArrayList;

import javax.validation.Valid;

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
        model.addAttribute("opportunity", new Opportunity());

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
        
        // System.out.println("Inside /addexpense : " + expense + result.toString());
        // if (result.hasErrors()) {
        //     return "add-expense";
        // }
    
        System.out.println(opportunity);
        // expense.setCreatedAt(new Date());
        // expense.setLastUpdated(new Date());
        //expenseRepository.save(expense);
        return "redirect:/index";
    }
}
