package com.relatech.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relatech.model.Idea;

@RestController
@RequestMapping("/idea")
public class IdeaController {
	
	@GetMapping("/getmodel")
	public Idea getmodel() {return new Idea(); }
	
	@PostMapping("/add")
	public ResponseEntity<Idea> addIdea(@RequestBody Idea idea) {
		return null;
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Idea> updateIdea(@RequestBody Idea idea) {
		return null;
		
	}
	
	@DeleteMapping("/delete") 
	public ResponseEntity<Idea> deleteIdea (@RequestBody Idea idea) {
		return null;
			
	}
	
	@GetMapping("/listIdeas")
	public ResponseEntity<List<Idea>> getListIdeas () {
		return null;
				
	}
	
}
