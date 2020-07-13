package com.rutuja.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rutuja.service.WelcomeService;


@RestController
public class WelcomeController {
	
	// Dependency
	//Here WelcomeController creates instance of the dependency
	//Autowiring is the Process where Spring Creates the Bean and injects them where ever they needed.
	
	@Autowired
	private WelcomeService service = new WelcomeService();
	
	@RequestMapping("/welcome")
	public String welcome() {
		//return "Hi... Welcome to Controller class..!!!";
		return service.retrieveWelcomeMessage();
	}
}
 
// Spring to manage this Bean and creates an instance of this
// You can use @Component or @Service... 

