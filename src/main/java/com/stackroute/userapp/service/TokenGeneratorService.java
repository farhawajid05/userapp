package com.stackroute.userapp.service;

import java.util.Map;

import com.stackroute.userapp.model.User;

public interface TokenGeneratorService {
	Map<String,String> generateToken(User user);

}
