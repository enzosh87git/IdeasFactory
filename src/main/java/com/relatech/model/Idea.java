package com.relatech.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Idea {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String text;
	private LocalDateTime ldt;	
	private boolean accepted;
	private double voteaverage;
	private int votecounter;
	
	@JsonIgnore
	@OneToMany(mappedBy = "idea", fetch = FetchType.EAGER )
	private List<Comment> comlist;
	
	//--------------------------------------------------------------
	public Idea() { this.comlist = new ArrayList<Comment>(); 
					this.accepted = false;
					this.voteaverage = 0;
					this.votecounter = 0;}
	
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
	public double getVoteaverage() {
		return voteaverage;
	}
	public void setVoteaverage(double voteaverage) {
		this.voteaverage = voteaverage;
	}
	public int getVotecounter() {
		return votecounter;
	}
	public void setVotecounter(int votecounter) {
		this.votecounter = votecounter;
	}
	
	public List<Comment> getComlist() {
		return comlist;
	}
	public void setComlist(List<Comment> comlist) {
		this.comlist = comlist;
	}
	@Override
	public String toString() {
		return "Idea [id=" + id + ", text=" + text + ", ldt=" + ldt + ", accepted=" + accepted + ", voteaverage="
				+ voteaverage + ", votecounter=" + votecounter + "]";
	}

}
