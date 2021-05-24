package com.learning.may.ut.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.may.ut.dao.Item;
import com.learning.may.ut.repository.ItemRepository;

@Component
public class ItemBusinessService {
	
	@Autowired
	ItemRepository repository;

	public Item retreiveHardCodedItem() {
		return new Item(1001, "Item-1", "Book", 100);
	}

	public List<Item> retreiveAllItems() {
		return repository.findAll();
	}

}
