package com.tech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductReviews {
	@Id
	private Long id;
	private String product_id;
	private String review_score;
	private String review_comment;
}
