package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.repository.ReviewRepository;
import com.tech.response.ReviewResponse;

@Service
public class ProductsReviewServiceImpl implements ProductsReviewService{
	
	@Autowired
	ReviewRepository reviewRepository;
	
	

	@Override
	public ReviewResponse getReviewsById(String productId) {
		
		
		
		
		return reviewRepository.getgetReviewsById(productId);
	}

}
