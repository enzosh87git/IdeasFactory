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

import com.relatech.model.Comment;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@GetMapping("/getmodel")
	public Comment getmodel() {return new Comment(); }
	
	@PostMapping("/add")
	public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {
		return null;
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Comment> updateComment(@RequestBody Comment comment) {
		return null;
		
	}
	
	@DeleteMapping("/delete") 
	public ResponseEntity<Comment> deleteComment (@RequestBody Comment comment) {
		return null;
			
	}
	
	@GetMapping("/getList")
	public ResponseEntity<List<Comment>> getListComments () {
		return null;
				
	}
	
}
