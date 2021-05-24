package com.learning.may.ut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.may.ut.business.ItemBusinessService;
import com.learning.may.ut.dao.Item;
import com.learning.may.ut.repository.ItemRepository;

@RestController
public class ItemController {

	@Autowired
	private ItemBusinessService businessService;

	@Autowired
	ItemRepository itemRepository;

	@GetMapping("/dummy-item")
	public Item dummyItem() {
		return new Item(1001, "Item-1", "Book", 100);
	}

	@GetMapping("/dummy-item-business-service")
	public Item itemFromBusinessService() {
		return businessService.retreiveHardCodedItem();
	}

	@GetMapping("/all-item-from-database")
	public List<Item> itemFromRepository() {
		return businessService.retreiveAllItems();
	}
}
