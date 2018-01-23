package com.relatech.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.relatech.model.Idea;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private int id;
	
	private String text;
	private LocalDateTime ldt;	
	private boolean accepted;

	@JsonIgnore
	@ManyToOne( fetch = FetchType.EAGER )
	private Idea idea;

	//--------------------------------------------------------------
	public Comment() {
		this.accepted = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getLdt() {
		return ldt;
	}

	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public Idea getIdea() {
		return idea;
	}

	public void setIdea(Idea idea) {
		this.idea = idea;
	}
	
}
