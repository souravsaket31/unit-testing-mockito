package com.learning.may.ut.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.may.ut.dao.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
