package com.braggplaceloop.dao;

import java.util.List;

import com.braggplaceloop.dao.GenericDAO;
import com.braggplaceloop.domain.Message;





public interface MessageDAO extends GenericDAO<Message, Integer> {
  
	List<Message> findAll();
	






}


