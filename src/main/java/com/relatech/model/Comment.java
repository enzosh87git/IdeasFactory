package com.relatech.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.relatech.model.Idea;
import com.relatech.util.JsonDateSerializer;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private int id;
	
	private String text;
	
	@JsonSerialize(using = JsonDateSerializer.class)
	private Timestamp dateComment;	
	
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

	public Timestamp getDateComment() {
		return dateComment;
	}

	public void setDateComment(Timestamp dateComment) {
		this.dateComment = dateComment;
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
