package com.rutuja.service;

import org.springframework.stereotype.Component;

@Component

public class WelcomeService{
	public String retrieveWelcomeMessage() {
		//complex method
		return "Welcome to Business Service Class with Autowired injected";
	}
}

// Spring to manage this Bean and creates an instance of this
//You can use @Component or @Service... 
