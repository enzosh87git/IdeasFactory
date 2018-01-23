package com.relatech.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.relatech.model.Idea;
import com.relatech.services.IdeaServiceImpl;

@RestController
@RequestMapping("/idea")
public class IdeaController {
	
	@Autowired
	private IdeaServiceImpl idserv;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/getmodel")
	public Idea getmodel() { return new Idea(); } 
	
	@PostMapping("/save")
	public ResponseEntity<Idea> saveUpdate( @RequestBody Idea c ){
		try {
				log.info("Saved");
				return new ResponseEntity<Idea>( idserv.save(c), HttpStatus.CREATED ); 
		}catch(Exception e) {
				log.error(e.getMessage());
				return new ResponseEntity<Idea>( idserv.save(c), HttpStatus.INTERNAL_SERVER_ERROR );
		}
	}
	
	@GetMapping("/getlist")
	public ResponseEntity<List<Idea>> list(){
		try {	
				log.info("List");
				return new ResponseEntity<List<Idea>>( idserv.list(), HttpStatus.OK ); 
		}catch(Exception e) {
				log.error(e.getMessage());
				return new ResponseEntity<List<Idea>>( idserv.list(), HttpStatus.INTERNAL_SERVER_ERROR );
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<Idea> updateIdea(@RequestBody Idea idea) {
		return null;
		
	}
	
	@DeleteMapping("/delete/{id}") 
	public ResponseEntity<Idea> deleteIdea (@PathVariable("id") int id) {
		try {	
			log.info("Deleted");
			return new ResponseEntity<Idea>( idserv.deleteId(id), HttpStatus.OK ); 
	}catch(Exception e) {
			log.error(e.getMessage());
			return new ResponseEntity<Idea>( idserv.deleteId(id), HttpStatus.INTERNAL_SERVER_ERROR );
	}
			
	}
	
}
