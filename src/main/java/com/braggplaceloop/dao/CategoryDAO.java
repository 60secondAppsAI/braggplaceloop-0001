package com.braggplaceloop.dao;

import java.util.List;

import com.braggplaceloop.dao.GenericDAO;
import com.braggplaceloop.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}


