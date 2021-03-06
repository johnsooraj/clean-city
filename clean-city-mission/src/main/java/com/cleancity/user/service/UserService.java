package com.cleancity.user.service;

import java.util.List;

import com.cleancity.user.document.UserDetails;

public interface UserService {

	public List<UserDetails> findAll();

	public UserDetails saveNewUserUser(UserDetails details);

	public UserDetails fetchUserDetails(String id);

	public boolean updateUserCredit(String userId, Double rate);
}
