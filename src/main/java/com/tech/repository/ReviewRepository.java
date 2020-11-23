package com.tech.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tech.entity.ProductReviews;
import com.tech.response.ReviewResponse;

public interface ReviewRepository extends  CrudRepository<ProductReviews, Integer>{
	
	@Query("FROM product_reviews WHERE (product_id = :productId)")
	ReviewResponse getgetReviewsById(@Param("productId") String productId);
}
