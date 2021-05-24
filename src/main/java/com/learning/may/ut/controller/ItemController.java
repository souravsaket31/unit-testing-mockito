package com.learning.may.ut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.may.ut.business.ItemBusinessService;
import com.learning.may.ut.dao.Item;

@RestController
public class ItemController {

	@Autowired
	private ItemBusinessService businessService;

	@GetMapping("/dummy-item")
	public Item dummyItem() {
		return new Item(1, "Book", "Cracking the Coding Interview");
	}

	@GetMapping("/dummy-item-business-service")
	public Item itemFromBusinessService() {
		return businessService.retreiveHardCodedItem();
	}
}
