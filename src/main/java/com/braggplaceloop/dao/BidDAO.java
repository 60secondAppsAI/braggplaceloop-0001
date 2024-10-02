package com.braggplaceloop.dao;

import java.util.List;

import com.braggplaceloop.dao.GenericDAO;
import com.braggplaceloop.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


