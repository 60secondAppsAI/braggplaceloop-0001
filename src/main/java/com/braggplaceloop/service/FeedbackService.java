package com.braggplaceloop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggplaceloop.domain.Feedback;
import com.braggplaceloop.dto.FeedbackDTO;
import com.braggplaceloop.dto.FeedbackSearchDTO;
import com.braggplaceloop.dto.FeedbackPageDTO;
import com.braggplaceloop.dto.FeedbackConvertCriteriaDTO;
import com.braggplaceloop.service.GenericService;
import com.braggplaceloop.dto.common.RequestDTO;
import com.braggplaceloop.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface FeedbackService extends GenericService<Feedback, Integer> {

	List<Feedback> findAll();

	ResultDTO addFeedback(FeedbackDTO feedbackDTO, RequestDTO requestDTO);

	ResultDTO updateFeedback(FeedbackDTO feedbackDTO, RequestDTO requestDTO);

    Page<Feedback> getAllFeedbacks(Pageable pageable);

    Page<Feedback> getAllFeedbacks(Specification<Feedback> spec, Pageable pageable);

	ResponseEntity<FeedbackPageDTO> getFeedbacks(FeedbackSearchDTO feedbackSearchDTO);
	
	List<FeedbackDTO> convertFeedbacksToFeedbackDTOs(List<Feedback> feedbacks, FeedbackConvertCriteriaDTO convertCriteria);

	FeedbackDTO getFeedbackDTOById(Integer feedbackId);







}





