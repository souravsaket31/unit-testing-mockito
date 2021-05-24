package com.learning.may.ut.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(ItemController.class)
class ItemControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void dummyItemTest() throws Exception {

		// call "/hello-world"
		// verify "Hello World!"
		RequestBuilder request = MockMvcRequestBuilders.get("/dummy-item").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string("{\"id\":1,\"name\":\"Book\",\"desc\":\"Cracking the Coding Interview\"}"))
				.andReturn();
		
		//assertEquals("{\"id\":1,\"name\":\"Book\",\"desc\":\"Cracking the Coding Interview\"}", result.getResponse().getContentAsString());
	}

}
