package com.braggplaceloop.dao;

import java.util.List;

import com.braggplaceloop.dao.GenericDAO;
import com.braggplaceloop.domain.Watchlist;





public interface WatchlistDAO extends GenericDAO<Watchlist, Integer> {
  
	List<Watchlist> findAll();
	






}


