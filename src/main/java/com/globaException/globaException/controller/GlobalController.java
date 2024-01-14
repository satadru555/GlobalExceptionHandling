package com.globaException.globaException.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.globaException.globaException.dto.User;
import com.globaException.globaException.exception.ConnectionFailureException;
import com.globaException.globaException.exception.Error;
import com.globaException.globaException.exception.ResourceNotFoundException;
import com.globaException.globaException.service.UserService;

@RestController
public class GlobalController {
	
	@Autowired
    private UserService service;
	
	@GetMapping("/user")
	  public ResponseEntity<User> getUser() throws ResourceNotFoundException {
		
		return ResponseEntity.ok(service.getUser());
		
	  
	  }
	
	@GetMapping("/fetchAllUser")
	  public ResponseEntity<User> fetchAllUser() throws ConnectionFailureException {
		
		// throw new ConnectionFailureException(Error.PMDM_ServiceName_Address_1000.getCode());
		 return ResponseEntity.ok(service.fetchAllUser());	
	  
	  }

}
