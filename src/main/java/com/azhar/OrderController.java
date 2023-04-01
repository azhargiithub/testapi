package com.azhar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@PostMapping("/purchase/{userName}/{amount}/{productName}")
	public String purchase(@PathVariable String userName,@PathVariable String productName,@PathVariable double amount) {
		return "Hi "+userName+" for order "+productName+" for amount "+amount+ " is successfull";
	}
}
