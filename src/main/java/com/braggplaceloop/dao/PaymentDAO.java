package com.braggplaceloop.dao;

import java.util.List;

import com.braggplaceloop.dao.GenericDAO;
import com.braggplaceloop.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


