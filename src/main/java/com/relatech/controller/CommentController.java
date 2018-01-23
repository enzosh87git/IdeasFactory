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

import com.relatech.model.Comment;
import com.relatech.services.CommentService;
import com.relatech.services.CommentServiceImpl;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	private CommentServiceImpl comserv;
	
private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/getmodel")
	public Comment getmodel() { return new Comment(); } 
	
	@PostMapping("/save")
	public ResponseEntity<Comment> saveUpdate( @RequestBody Comment c ){
		try {
				log.info("Saved");
				return new ResponseEntity<Comment>( comserv.save(c), HttpStatus.CREATED ); 
		}catch(Exception e) {
				log.error(e.getMessage());
				return new ResponseEntity<Comment>( comserv.save(c), HttpStatus.INTERNAL_SERVER_ERROR );
		}
	}
	
	@GetMapping("/getlist")
	public ResponseEntity<List<Comment>> list(){
		try {	
				log.info("List");
				return new ResponseEntity<List<Comment>>( comserv.list(), HttpStatus.OK ); 
		}catch(Exception e) {
				log.error(e.getMessage());
				return new ResponseEntity<List<Comment>>( comserv.list(), HttpStatus.INTERNAL_SERVER_ERROR );
		}
	}
	
	@DeleteMapping("/delete/{id}") 
	public ResponseEntity<Comment> deleteComment(@PathVariable("id") int id) {
		try {	
			log.info("Deleted");
			return new ResponseEntity<Comment>( comserv.deleteId(id), HttpStatus.OK ); 
	}catch(Exception e) {
			log.error(e.getMessage());
			return new ResponseEntity<Comment>( comserv.deleteId(id), HttpStatus.INTERNAL_SERVER_ERROR );
	}
			
	}
	
}
