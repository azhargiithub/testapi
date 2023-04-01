package com.azhar.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@PostMapping("/purchase")
	public String purchase(@RequestBody Order order) {
		return "Hi "+order.getUserName()+" for order "+order.getProductName()+" for amount "+order.getAmount()+ " is successfull";
	}
}
