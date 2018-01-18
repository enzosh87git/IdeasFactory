package com.relatech.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/idea")
public class IdeaController {
	
	@PostMapping("/add")
	public ResponseEntity<Idea> addIdea(@RequestBody Idea idea) {
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Idea> updateIdea(@RequestBody Idea idea) {
		
	}
	
	@DeleteMapping("/delete") 
	public ResponseEntity<Idea> deleteIdea (@RequestBody Idea idea) {
			
	}
	
	@GetMapping("/listIdeas")
	public ResponseEntity<List<Idea>> getListIdeas () {
				
	}
	
}
