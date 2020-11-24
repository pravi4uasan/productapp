package com.tech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tech.entity.ProductReviews;
import com.tech.response.ReviewResponse;

public interface ReviewRepository extends  CrudRepository<ProductReviews, Integer>{
	
	@Query("FROM ProductReviews WHERE (product_id = :productId)")
	List<ProductReviews> getReviewsById(@Param("productId") String productId);
}
