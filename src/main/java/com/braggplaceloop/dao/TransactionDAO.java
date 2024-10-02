package com.braggplaceloop.dao;

import java.util.List;

import com.braggplaceloop.dao.GenericDAO;
import com.braggplaceloop.domain.Transaction;





public interface TransactionDAO extends GenericDAO<Transaction, Integer> {
  
	List<Transaction> findAll();
	






}


