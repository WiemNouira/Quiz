package com.fp.quiz.entities;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fp.quiz.entities.Question;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private int score;
   
    @OneToMany(fetch = FetchType.EAGER)  //10Questions
    private List<Response> reponses;
 
	public Participation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Participation(Long id, String username, int score, List<Response> reponses) {
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
	@JsonIgnore
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
	public List<Response> getReponses() {
		return reponses;
	}
	public void setReponses(List<Response> reponses) {
		this.reponses = reponses;
	}
	
	
	
	
}
