package com.tech.response;

import lombok.Data;

@Data
public class ReviewResponse {
	
	private String productId;
	private Double avgReviewScore;
	private int numberOfReviews;

}
