package com.braggplaceloop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggplaceloop.domain.Message;
import com.braggplaceloop.dto.MessageDTO;
import com.braggplaceloop.dto.MessageSearchDTO;
import com.braggplaceloop.dto.MessagePageDTO;
import com.braggplaceloop.dto.MessageConvertCriteriaDTO;
import com.braggplaceloop.service.GenericService;
import com.braggplaceloop.dto.common.RequestDTO;
import com.braggplaceloop.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface MessageService extends GenericService<Message, Integer> {

	List<Message> findAll();

	ResultDTO addMessage(MessageDTO messageDTO, RequestDTO requestDTO);

	ResultDTO updateMessage(MessageDTO messageDTO, RequestDTO requestDTO);

    Page<Message> getAllMessages(Pageable pageable);

    Page<Message> getAllMessages(Specification<Message> spec, Pageable pageable);

	ResponseEntity<MessagePageDTO> getMessages(MessageSearchDTO messageSearchDTO);
	
	List<MessageDTO> convertMessagesToMessageDTOs(List<Message> messages, MessageConvertCriteriaDTO convertCriteria);

	MessageDTO getMessageDTOById(Integer messageId);







}





