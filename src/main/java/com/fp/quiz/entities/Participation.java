package com.fp.quiz.entities;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


import java.util.ArrayList;
import java.util.List;


@Entity
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;
    private String username;
    private int score;
   
    private ArrayList<String> reponses;
 
	public Participation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Participation(Long id, String username, int score, ArrayList<String> reponses) {
		super();
		this.id = id;
		this.username = username;
		this.score = score;
		this.reponses = reponses;
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	public ArrayList<String> getReponses() {
		return reponses;
	}

	public void setReponses(ArrayList<String> reponses) {
		this.reponses = reponses;
	}
	
	
	
}
