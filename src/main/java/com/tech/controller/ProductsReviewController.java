package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tech.response.ReviewResponse;
import com.tech.service.ProductsReviewService;

@RestController
public class ProductsReviewController {
	
	@Autowired
	ProductsReviewService productsReviewService;
	
	@GetMapping(value = "/review", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ReviewResponse getReviewsById(@RequestParam(value = "productId", required = true) String productId) {
		return productsReviewService.getReviewsById(productId);
	}

}
