package com.myjavaapi.myjavarestapi;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class CurrencyConfigurationController {
	
	@Autowired 
	private CurrencyServiceConfiguration configuration;
	
	// Go to this link browser: http://localhost:8080/currency-configuration
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses() {
		return configuration;
	}

}
