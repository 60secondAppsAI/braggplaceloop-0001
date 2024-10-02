package com.braggplaceloop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggplaceloop.domain.Payment;
import com.braggplaceloop.dto.PaymentDTO;
import com.braggplaceloop.dto.PaymentSearchDTO;
import com.braggplaceloop.dto.PaymentPageDTO;
import com.braggplaceloop.dto.PaymentConvertCriteriaDTO;
import com.braggplaceloop.service.GenericService;
import com.braggplaceloop.dto.common.RequestDTO;
import com.braggplaceloop.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface PaymentService extends GenericService<Payment, Integer> {

	List<Payment> findAll();

	ResultDTO addPayment(PaymentDTO paymentDTO, RequestDTO requestDTO);

	ResultDTO updatePayment(PaymentDTO paymentDTO, RequestDTO requestDTO);

    Page<Payment> getAllPayments(Pageable pageable);

    Page<Payment> getAllPayments(Specification<Payment> spec, Pageable pageable);

	ResponseEntity<PaymentPageDTO> getPayments(PaymentSearchDTO paymentSearchDTO);
	
	List<PaymentDTO> convertPaymentsToPaymentDTOs(List<Payment> payments, PaymentConvertCriteriaDTO convertCriteria);

	PaymentDTO getPaymentDTOById(Integer paymentId);







}





