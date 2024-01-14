package com.globaException.globaException.service;

import org.springframework.stereotype.Service;

import com.globaException.globaException.dto.User;
import com.globaException.globaException.exception.ConnectionFailureException;
import com.globaException.globaException.exception.Error;
import com.globaException.globaException.exception.ResourceNotFoundException;

@Service
public class UserService {

	public User getUser() throws ResourceNotFoundException {

		throw new ResourceNotFoundException(Error.PMDM_ServiceName_Address_1001.getCode());

	}
	
	public User fetchAllUser() throws ConnectionFailureException {

		throw new ResourceNotFoundException(Error.PMDM_ServiceName_Address_1000.getCode());

	}
}
