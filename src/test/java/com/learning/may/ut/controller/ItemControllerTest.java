package com.learning.may.ut.controller;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.learning.may.ut.business.ItemBusinessService;
import com.learning.may.ut.dao.Item;

@WebMvcTest(ItemController.class)
class ItemControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ItemBusinessService businessServiceItem;

	@Test
	void dummyItemTest() throws Exception {

		// call "/dummy-item"
		// verify -- content-String
		RequestBuilder request = MockMvcRequestBuilders
				.get("/dummy-item")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1001,\"name\":\"Item-1\",\"desc\":\"Book\",\"price\":100,\"value\":0}"))
				.andReturn();
		
		//JSONAssert.assertEquals(expected, actual, strict);
		
		//assertEquals("{\"id\":1001,\"name\":\"Item-1\",\"desc\":\"Book\",\"price\":100,\"value\":0}", result.getResponse().getContentAsString());
	}
	
	@Test
	void itemFromBusinessServiceTest() throws Exception {

		when(businessServiceItem.retreiveHardCodedItem())
		.thenReturn(new Item(1001, "Item-1", "Book", 100));
		
		// call "/dummy-item"
		// verify -- content-String
		RequestBuilder request = MockMvcRequestBuilders
				.get("/dummy-item-business-service")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1001,\"name\":\"Item-1\",\"desc\":\"Book\",\"price\":100,\"value\":0}"))
				.andReturn();

}
}
