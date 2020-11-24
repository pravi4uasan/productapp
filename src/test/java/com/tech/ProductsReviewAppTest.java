package com.tech;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
public class ProductsReviewAppTest {
	@Test
	void contextLoads() {
	}
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	@SneakyThrows
	public void testReview() {
		MvcResult result=mvc.perform(
				MockMvcRequestBuilders.get("/review/BB5476")
				.accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int status=result.getResponse().getStatus();
		log.info("test2 response code>>"+status);
		assert(200 == status);
	}
	@Test
	@SneakyThrows
	public void testReview1() {
		MvcResult result=mvc.perform(
				MockMvcRequestBuilders.get("/review/BB54761")
				.accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int status=result.getResponse().getStatus();
		log.info("test2 response code>>"+status);
		assert(404 == status);
	}
	
	
}
