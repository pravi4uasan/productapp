package com.tech.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.ProductReviews;
import com.tech.repository.ReviewRepository;
import com.tech.response.ReviewResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductsReviewServiceImpl implements ProductsReviewService{
	
	@Autowired
	ReviewRepository reviewRepository;
	
	

	@Override
	public ReviewResponse getReviewsById(String productId) {
		log.info("START getReviewsById ");
		ReviewResponse reviewResponse=new ReviewResponse();
		List<ProductReviews> productReviewsList=new ArrayList<ProductReviews>();
		
		productReviewsList=reviewRepository.getReviewsById(productId);
		log.info("productReviewsList size>>>"+productReviewsList.size());
		log.info("productReviewsList>>>"+productReviewsList);
		reviewResponse.setProductId(productReviewsList.get(0).getProduct_id());
		
		Double averageReviewScore = productReviewsList
			    .stream()
			    .collect(Collectors.averagingInt(p -> p.getReview_score()));
		log.info("averageReviewScore>>>"+averageReviewScore);
		reviewResponse.setAvgReviewScore(averageReviewScore);
		reviewResponse.setNumberOfReviews(productReviewsList.size());
		log.info("END getReviewsById ");
		return reviewResponse;
	}

}
