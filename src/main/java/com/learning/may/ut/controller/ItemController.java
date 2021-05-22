package com.learning.may.ut.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.may.ut.dao.Item;

@RestController
public class ItemController {

	@GetMapping("/dummy-item")
	public Item dummyItem()
	{
		return new Item(1, "Book", "Cracking the Coding Interview");
	}
	
}
