package com.braggplaceloop.dao;

import java.util.List;

import com.braggplaceloop.dao.GenericDAO;
import com.braggplaceloop.domain.Feedback;





public interface FeedbackDAO extends GenericDAO<Feedback, Integer> {
  
	List<Feedback> findAll();
	






}


