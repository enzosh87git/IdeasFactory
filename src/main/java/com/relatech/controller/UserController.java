package com.relatech.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relatech.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/getmodel")
	public User getmodel() {return new User(); }
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return null;
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		return null;
		
	}
	
	@DeleteMapping("/delete") 
	public ResponseEntity<User> deleteUser (@RequestBody User user) {
		return null;
			
	}
	
	@GetMapping("/listUsers")
	public ResponseEntity<List<User>> getListUsers () {
		return null;
				
	}
	
}
