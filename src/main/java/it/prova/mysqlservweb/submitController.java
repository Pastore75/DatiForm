package it.prova.mysqlservweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class submitController {
	 @GetMapping("/submit")
	    public String showSubmitPage() {
	    	/*System.out.println("Nome: " + name);
	        System.out.println("Cognome: " + surname);*/
	    	
	    	return "submit";
	    }
	    
	    @PostMapping("/submit")
	    public String handleFormSubmit(@RequestParam String name, @RequestParam String surname) {
	        System.out.println("Nome: " + name);
	        System.out.println("Cognome: " + surname);
	        return "redirect:/submit";
	    }

}

