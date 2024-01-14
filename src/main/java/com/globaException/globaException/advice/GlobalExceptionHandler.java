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
    public Map<String, String>   resourceNotFoundException(ResourceNotFoundException resourceNotFoundException) {
		Map<String, String> errorMap = new HashMap<>();
		errorMap.put(Error.PMDM_ServiceName_Address_Property.getCode(),resourceNotFoundException.getMessage());
		errorMap.put(Error.PMDM_ServiceName_Address_Property.getMessage(),Error.PMDM_ServiceName_Address_1001.getMessage());
        return errorMap;
    }
}
