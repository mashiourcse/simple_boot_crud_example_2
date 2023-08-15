package com.codemash.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codemash.dto.User;
import com.codemash.model.Users;
import com.codemash.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/crud")
@RequiredArgsConstructor
public class CrudController {
	
	private final UserService userService;
	
	
	@GetMapping("")
	public List<Users> getUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/{id}")
	public Users getUserById( @PathVariable Integer id){
		return userService.getUserById(id);
	}
	
	@PostMapping("")
	public Users createUser(@RequestBody Users user) {
		
		return userService.createUser(user);
	}
	
	@DeleteMapping("")
	public String deleteUser(@RequestBody Users user) {
		
		return userService.deleteUser(user);
	}
	
	@PutMapping("")
	public Users putUser(@RequestBody Users user) {
		
		return userService.updateUser(user);
	}
	
	@PatchMapping("")
	public Users patchUser(@RequestBody Users user) {
		
		return userService.patchUser(user);
	}
	
}
