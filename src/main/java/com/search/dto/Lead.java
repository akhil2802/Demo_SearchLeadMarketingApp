package com.search.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// this class is created by analysing the json object from other app:

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lead {
	
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private long mobile;
}
