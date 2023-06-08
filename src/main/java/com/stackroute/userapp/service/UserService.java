package com.stackroute.userapp.service;

import com.stackroute.userapp.exception.IncorrectPasswordException;
import com.stackroute.userapp.exception.UserExistsException;
import com.stackroute.userapp.exception.UserNotFoundException;
import com.stackroute.userapp.model.User;

public interface UserService {
	User registerUser(User user) throws UserExistsException;
	User authenticateUser(String email,String password)throws UserNotFoundException,IncorrectPasswordException;

}
