package com.braggplaceloop.dao;

import java.util.List;

import com.braggplaceloop.dao.GenericDAO;
import com.braggplaceloop.domain.Item;





public interface ItemDAO extends GenericDAO<Item, Integer> {
  
	List<Item> findAll();
	






}


