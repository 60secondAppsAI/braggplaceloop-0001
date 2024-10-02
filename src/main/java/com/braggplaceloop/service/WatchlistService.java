package com.braggplaceloop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggplaceloop.domain.Watchlist;
import com.braggplaceloop.dto.WatchlistDTO;
import com.braggplaceloop.dto.WatchlistSearchDTO;
import com.braggplaceloop.dto.WatchlistPageDTO;
import com.braggplaceloop.dto.WatchlistConvertCriteriaDTO;
import com.braggplaceloop.service.GenericService;
import com.braggplaceloop.dto.common.RequestDTO;
import com.braggplaceloop.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface WatchlistService extends GenericService<Watchlist, Integer> {

	List<Watchlist> findAll();

	ResultDTO addWatchlist(WatchlistDTO watchlistDTO, RequestDTO requestDTO);

	ResultDTO updateWatchlist(WatchlistDTO watchlistDTO, RequestDTO requestDTO);

    Page<Watchlist> getAllWatchlists(Pageable pageable);

    Page<Watchlist> getAllWatchlists(Specification<Watchlist> spec, Pageable pageable);

	ResponseEntity<WatchlistPageDTO> getWatchlists(WatchlistSearchDTO watchlistSearchDTO);
	
	List<WatchlistDTO> convertWatchlistsToWatchlistDTOs(List<Watchlist> watchlists, WatchlistConvertCriteriaDTO convertCriteria);

	WatchlistDTO getWatchlistDTOById(Integer watchlistId);







}





