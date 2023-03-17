package com.search.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.search.dto.Lead;

@Component
public class LeadRestClient {
	
	
	private RestTemplate restTemplate = new RestTemplate();   //converts json to java:
	
	public Lead getLeadById(long id) {
		Lead lead = restTemplate.getForObject("http://localhost:8080/api/leads/"+id, Lead.class);
		return lead;
	}
}
