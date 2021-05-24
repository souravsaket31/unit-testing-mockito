package com.learning.may.ut.business;

import org.springframework.stereotype.Component;

import com.learning.may.ut.dao.Item;

@Component
public class ItemBusinessService {

	
	public Item retreiveHardCodedItem() {
		return new Item(1, "Book", "Cracking the Coding Interview");
	}

	
	
}
