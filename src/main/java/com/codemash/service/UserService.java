package com.codemash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codemash.model.Users;

import com.codemash.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {


	
private final UserRepository userRepository;
	
	public List<Users> getUsers() {
		return userRepository.findAll();
	}
	
	public Users getUserById(Integer id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public Users createUser(Users user) {
		return userRepository.save(user);
	}
	
	public Users updateUser(Users user) {
		return userRepository.save(user);
	}
	
	public Users patchUser(Users user) {
		return userRepository.save(user);
	}
	
	public String deleteUser(Users user) {
		userRepository.delete(user);
		return "User deleted with ID: " + user.id();
	}

}
