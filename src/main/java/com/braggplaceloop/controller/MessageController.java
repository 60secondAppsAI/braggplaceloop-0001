package com.braggplaceloop.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;


import com.braggplaceloop.util.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Date;

import com.braggplaceloop.domain.Message;
import com.braggplaceloop.dto.MessageDTO;
import com.braggplaceloop.dto.MessageSearchDTO;
import com.braggplaceloop.dto.MessagePageDTO;
import com.braggplaceloop.service.MessageService;
import com.braggplaceloop.dto.common.RequestDTO;
import com.braggplaceloop.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/message")
@RestController
public class MessageController {

	private final static Logger logger = LoggerFactory.getLogger(MessageController.class);

	@Autowired
	MessageService messageService;



	//@AllowSystem(AuthScopes.READ)
	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Message> getAll() {

		List<Message> messages = messageService.findAll();
		
		return messages;	
	}

	//@ReadAccess
	@GetMapping(value = "/{messageId}")
	@ResponseBody
	public MessageDTO getMessage(@PathVariable Integer messageId) {
		
		return (messageService.getMessageDTOById(messageId));
	}

 	//@WriteAccess
 	@RequestMapping(value = "/addMessage", method = RequestMethod.POST)
	public ResponseEntity<?> addMessage(@RequestBody MessageDTO messageDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = messageService.addMessage(messageDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}
		
		return result.asResponseEntity();
	}

	//@ReadAccess
	@GetMapping("/messages")
	public ResponseEntity<MessagePageDTO> getMessages(MessageSearchDTO messageSearchDTO) {
 
		return messageService.getMessages(messageSearchDTO);
	}	

 	//@WriteAccess
	@RequestMapping(value = "/updateMessage", method = RequestMethod.POST)
	public ResponseEntity<?> updateMessage(@RequestBody MessageDTO messageDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = messageService.updateMessage(messageDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
