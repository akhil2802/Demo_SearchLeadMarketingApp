package com.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.search.dto.Lead;

@Controller
public class SearchLeadController {
	
	@Autowired
	private LeadRestClient leadRestClient;
	
	@RequestMapping("/search")
	public String getSearchLeadForm() {
		return "search";
	}
	
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam long id, Model model) {
		Lead lead = leadRestClient.getLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_result";
	}
}
