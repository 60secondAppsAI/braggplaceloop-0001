package com.braggplaceloop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggplaceloop.domain.Bid;
import com.braggplaceloop.dto.BidDTO;
import com.braggplaceloop.dto.BidSearchDTO;
import com.braggplaceloop.dto.BidPageDTO;
import com.braggplaceloop.dto.BidConvertCriteriaDTO;
import com.braggplaceloop.service.GenericService;
import com.braggplaceloop.dto.common.RequestDTO;
import com.braggplaceloop.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface BidService extends GenericService<Bid, Integer> {

	List<Bid> findAll();

	ResultDTO addBid(BidDTO bidDTO, RequestDTO requestDTO);

	ResultDTO updateBid(BidDTO bidDTO, RequestDTO requestDTO);

    Page<Bid> getAllBids(Pageable pageable);

    Page<Bid> getAllBids(Specification<Bid> spec, Pageable pageable);

	ResponseEntity<BidPageDTO> getBids(BidSearchDTO bidSearchDTO);
	
	List<BidDTO> convertBidsToBidDTOs(List<Bid> bids, BidConvertCriteriaDTO convertCriteria);

	BidDTO getBidDTOById(Integer bidId);







}





