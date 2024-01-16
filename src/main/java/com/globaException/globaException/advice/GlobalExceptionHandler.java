package com.globaException.globaException.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.globaException.globaException.exception.ConnectionFailureException;
import com.globaException.globaException.exception.Error;
import com.globaException.globaException.exception.PMDMErrorMessage;
import com.globaException.globaException.exception.ResourceNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler({ConnectionFailureException.class})
    public ResponseEntity<ConnectionFailureException> connectionFailureException(ConnectionFailureException connectionFailureException) {
		connectionFailureException.setMessage(Error.PMDM_ServiceName_Address_1000.getMessage());
		connectionFailureException.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<ConnectionFailureException>(connectionFailureException, HttpStatus.NOT_FOUND);
    }
	
	
	@ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<PMDMErrorMessage>   resourceNotFoundException(ResourceNotFoundException resourceNotFoundException) {
		PMDMErrorMessage pMDMErrorMessage = new PMDMErrorMessage();
		pMDMErrorMessage.setMessage(Error.PMDM_ServiceName_Address_1001.getMessage());
		pMDMErrorMessage.setCode(resourceNotFoundException.getMessage());
		return new ResponseEntity<PMDMErrorMessage>(pMDMErrorMessage, HttpStatus.NOT_FOUND);
       
    }
}
