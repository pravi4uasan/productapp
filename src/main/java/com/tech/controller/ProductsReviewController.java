package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tech.response.ReviewResponse;
import com.tech.service.ProductsReviewService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ProductsReviewController {
	
	@Autowired
	ProductsReviewService productsReviewService;
	
	/*
	 * @GetMapping(value = "/review/{productId}", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public ReviewResponse
	 * getReviewsById1(@PathVariable(name = "productId") String productId) { return
	 * productsReviewService.getReviewsById(productId); }
	 */

	@GetMapping(value = "/review/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ReviewResponse> getReviewsById(@PathVariable(name = "productId") String productId)  {
        log.info("Getting review details");

        try{
        	ReviewResponse reviewResponse = productsReviewService.getReviewsById(productId);
            return ResponseEntity.ok().body(reviewResponse);
        }catch(Exception e){
            log.error(e.getMessage());
           
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
